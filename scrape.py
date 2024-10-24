from save import *

import datetime
from pprint import pprint
from time import sleep

from selenium import webdriver
from selenium.webdriver.firefox.options import Options as FirefoxOptions
from selenium.webdriver.common.by import By
from selenium.webdriver import Keys, ActionChains
from selenium.common.exceptions import NoSuchElementException


def StartupSelenium() -> webdriver:
    options = FirefoxOptions()
    options.add_argument('--headless')
    driver = webdriver.Firefox(options=options)
    driver.implicitly_wait(5)
    # driver.delete_all_cookies()
    return driver


# returns dict { section-name: link }
def SpiderMainPage(driver: webdriver) -> dict:
    url = "https://codingbat.com/java"  # TODO: add python 
    driver.get(url)
    # there are two tables; 'New...' sections are listed under a different table
    tables = driver.find_elements(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[@class='floatleft']/table")
    section_lists = [table.find_elements(By.XPATH, "./tbody/tr/td/div[@class='summ']") for table in tables]
    # unpacking the two lists from section_lists
    sections = [section for section_list in section_lists for section in section_list]
    
    section_map = {
        section_name: {
            "name": section_name,
            "desc": description,
            "href": section.find_element(By.XPATH, "./a[@href]").get_attribute('href'),
            "date": str(datetime.date.today()),
        } for section in sections
        for section_name, description in [section.text.splitlines()]
    }
    
    return section_map


def Spider(driver: webdriver, link: str) -> dict:
    driver.get(link)
    table = driver.find_element(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[1]/table")
    problem_links = table.find_elements(By.XPATH, "./tbody/tr/td/a[@href]")
    return { problem.accessible_name: problem.get_attribute('href') for problem in problem_links }


def BuildSitemap(driver: webdriver) -> dict:
    section_map = SpiderMainPage(driver)
    sitemap = {
        section_name: {
            **section,
            "pages": Spider(driver, section["href"]),
        } for (section_name, section) in section_map.items()
    }
    return sitemap


# given a return-type, writes a minimal expression that allows the function to compile
def MinimalExpression(returnType: str) -> str:
    def MatchReturnValue(returnType: str) -> str:
        if returnType.startswith('Map'): return f"new Hash{returnType}()"
        if returnType.startswith('List'): return f"new Array{returnType}()" # ArrayList<T,U>
        returnType_noArr = returnType.replace('[','').replace(']','')
        match (returnType_noArr.split('<', maxsplit=1)[0]):
            case "int" :    return '0'
            case "char":    return "\'a\'"
            case "boolean": return 'false'
            case "String":  return '\"\"'
            case _ as unhandled: print(f"[WARNING] MatchReturnValue(): unhandled returnType: '{unhandled}'\n")
        return ' '
    
    nested_arrayCount = returnType.count("[]")
    return_value = MatchReturnValue(returnType)
    
    # constructing nested arrays if necessary
    returnsArray = (nested_arrayCount > 0)
    while nested_arrayCount > 0:
        return_value = '{'+return_value+'}'
        nested_arrayCount -= 1
    if returnsArray: return_value = f"new {returnType}{return_value}";  # {0} -> new int[]{0}
    return return_value


# it's not as straightforward as just clicking the button; 
# the submitted code needs to compile (including correct return-type).
# 'ace_div' is the webelement where you enter your code
# when you're debugging this, you can't see the text from textarea, instead check 'ace_div.text'
def GetExtendedTestcases(driver: webdriver, textarea, returnType: str) -> list[str] | None:
    return_value = MinimalExpression(returnType)
    
    # Wait until the cursor gets repositioned inside the code block (which should happen on load)
    # For some reason, the initial cursor position is super inconsistent and sometimes it warps up on first input for no reason
    # Even if the visual cursor is centered, the actual cursor can randomly start in the middle of the first line
    cursor_position = textarea.get_property("style")['top']
    # so move it down until it's on the right line.
    while cursor_position != "13px": # the lines are 13px.
        sleep(0.1) # print("waiting..."); sleep(0.25)
        if cursor_position == "0px": textarea.send_keys(Keys.ARROW_DOWN)
        else: textarea.send_keys(Keys.ARROW_UP)
        cursor_position = textarea.get_property("style")['top']
    # style_properties = [S.strip() for S in textarea.get_attribute('style').split(';') if (len(S) > 0)]
    
    # (ActionChains(driver)
    #     .send_keys_to_element(textarea, Keys.END, Keys.END, Keys.END, Keys.END).pause(1)
    #     .send_keys_to_element(textarea,Keys.ARROW_DOWN).pause(1)
    #     .send_keys_to_element(textarea, "return ").pause(1)
    # ).perform()
    # ActionChains(driver).send_keys_to_element(textarea, Keys.BACKSPACE).perform()
    
    # typing the minimal expression and submitting with CTRL+ENTER
    (ActionChains(driver)
        .send_keys_to_element(textarea, "return ").pause(1)
        .send_keys_to_element(textarea, f"{return_value};").pause(1)
        .key_down(Keys.CONTROL).send_keys_to_element(textarea, Keys.ENTER).pause(1)
        .key_up(Keys.CONTROL)
    ).perform()
    
    content = driver.find_element(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[@class='indent']")
    
    try:
        results_table = content.find_element(By.XPATH, "./table/tbody/tr/td/div[@id='results']/div[@id='tests']/table[@class='out']")
        extended_testcases = [td.text for td in results_table.find_elements(By.XPATH, "./tbody/tr/td") if ('→' in td.text)]
    # on failure, screenshot the (presumably botched) input and (compiler) error message
    except NoSuchElementException as notFound:
        # print(f"[ERROR] locating extended-testcases failed: {notFound}\n")
        print(f"[ERROR] locating extended-testcases failed.")
        screenshot_dir = pathlib.Path.cwd() / "failure_screenshots"
        if not screenshot_dir.exists(): screenshot_dir.mkdir()
        problem_number = driver.current_url.rsplit('/', maxsplit=1)[-1]
        screenshot_filename = f"{driver.title.removeprefix('CodingBat Java ').replace('-','')} - {problem_number}"
        screenshot_filepath = screenshot_dir / f"{screenshot_filename}.png"
        with open(screenshot_filepath, 'wb') as screenshot_file:
            screenshot_file.write(content.screenshot_as_png)
        return None
    
    return extended_testcases


def ScrapeProblemPage(driver: webdriver, url: str, getAllTestcases=False) -> dict:
    driver.get(url)
    content = driver.find_element(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[@class='indent']")
    title = content.find_element(By.XPATH, "./span")
    print(f"scraping page: {title.text}...")
    
    difficulty = content.find_element(By.XPATH, "./p/font[contains(text(),'Difficulty')]").text.removeprefix("Difficulty: ")
    stuff = content.find_element(By.XPATH, "./table/tbody/tr/td")
    prompt = stuff.find_element(By.XPATH, "./div[@class='minh']/p")
    # 3 simple testcases are provided in the format: (x, y) -> expected_result (with UTF-8 arrow symbol)
    simple_testcases = [line for line in stuff.text.splitlines() if "→" in line]
    provided_code = stuff.find_element(By.XPATH, "./form[@name='codeform']/div[@id='ace_div']/div[@class='ace_scroller']/div[@class='ace_content']/div[3]")
    
    extended_testcases = None
    if getAllTestcases:
        textarea = stuff.find_element(By.XPATH, "./form[@name='codeform']/div[@id='ace_div']/textarea")
        returnType = provided_code.text.split('(', maxsplit=1)[0].removeprefix("public ").strip().rsplit(maxsplit=1)[0]
        extended_testcases = GetExtendedTestcases(driver, textarea, returnType)
    
    data = {
        "title": title.text,
        "prompt": prompt.text,
        "testcases": simple_testcases,
        "testcases_extended": extended_testcases,
        "provided_code": provided_code.text,
        "difficulty": difficulty,
    }
    
    return data


def Scrape(sitemap: dict | None, getAllTestcases=False) -> (list[dict], dict):
    driver = StartupSelenium()
    scraped_results = []
    failed_pages = {}  # section: problem
    
    try:
        if sitemap is None:
            print("sitemap not found; building sitemap")
            sitemap = BuildSitemap(driver)
            WriteSitemapFile(sitemap)
    except Exception as E:
        print(f"failed to write sitemap.\n exception: {E}")
        driver.quit()
        return (scraped_results, failed_pages)
    
    try:
        for (section, section_map) in sitemap.items():
            for (problem, link) in section_map["pages"].items():
                existing_data = LoadFile(section, problem)  # None if non-existant
                if existing_data:
                    if not "testcases_extended" in existing_data.keys(): existing_data["testcases_extended"] = None;
                    if getAllTestcases and existing_data["testcases_extended"]:
                        print(f"extended testcases already exist for: {section}/{problem}; skipping.")
                        continue
                
                scraped_data = ScrapeProblemPage(driver, link, getAllTestcases)
                if (getAllTestcases and (not scraped_data["testcases_extended"])):
                    print(f"failed to get extended-testcases for '{section}/{problem}'; not saving.\n")
                    if not section in failed_pages: failed_pages[section] = { problem: link };
                    else: failed_pages[section][problem] = link;
                    continue
                
                if ((not getAllTestcases) and existing_data): # preserve the extended testcases
                    scraped_data["testcases_extended"] = existing_data["testcases_extended"]
                    scraped_data["provided_code"] = existing_data["provided_code"] # preserving the expression filled in when scraping extended_testcases
                
                data = {
                    "url": link,
                    "section": section,
                    "problem": problem,
                    **scraped_data,
                }
                SaveFile(data, section, problem)
                scraped_results.append(data)
    except Exception as E:
        print(f"exception: {E}")
        driver.quit()
        return (scraped_results, failed_pages)
    
    driver.quit()
    return (scraped_results, failed_pages)


# if targetSections are specified, only scrapes those sections. 
# otherwise, if targetPages are specified, those pages will be scraped.
# the layout of targetPages is { SectionName: PageURLs }, where 'SectionName' can be whatever you want
# alternatively, you can pass in entire sections from the sitemap; it looks for "pages" sub-dict 
def BuildTargetMap(targetSections: list[str] = None, targetPages: dict[str:dict] = None) -> dict:
    sitemap = LoadSitemapFile()
    filtered_sitemap = {}
    custom_sitemap = {}
    
    if targetSections:
        if sitemap is None: 
            print("[ERROR] targetSections specified but no sitemap file exists. Exiting.\n")
            raise FileNotFoundError
        # if targetPages: print("[WARNING] targetPages is ignored when targetSections are specified!\n")
        # targetPages = None
        missing_sections = []
        for section_name in targetSections:
            if '-' not in section_name: print(f'warning: section-name "{section_name}" expected to have a dash');
            if section_name not in sitemap.keys():
                print(f"[ERROR] section: '{section_name}' not found in sitemap.")
                missing_sections.append(section_name)
                section_name = section_name[:-1] + "-" + section_name[-1] # putting the dash back in
                print(f'retrying with section-name: "{section_name}"...')
                if section_name in sitemap.keys(): missing_sections.pop();
                else:
                    print(f"[ERROR] fallback failed. skipping section '{section_name}'\n.")
                    continue
            filtered_sitemap[section_name] = sitemap[section_name]
        if (len(missing_sections) > 0): 
            print(f"\n unrecognized sections: {missing_sections}\n")
    # filtered_sitemap has been filled out
    
    if targetPages:
        for (key, value) in targetPages.items():
            # if "pages" sub-dict exists, assume it's a copy-paste from a sitemap; user wants to override the entries in that section
            if "pages" in value.keys():
                if '-' not in key: print(f'warning: section-name "{key}" expected to have a dash');
                if key not in sitemap.keys():
                    print(f"[ERROR] section: '{key}' not found in sitemap.")
                    key = key[:-1] + "-" + key[-1] # putting the dash back in
                    print(f'retrying with section-name: "{key}"...')
                    if key not in sitemap.keys():
                        print(f"[ERROR] fallback failed. skipping section '{key}'\n.")
                        continue
                custom_sitemap[key] = sitemap[key]
                custom_sitemap[key]["pages"] = value["pages"]
            # 'pages' doesn't exist, so the entry is a custom section of pagename/URL pairs
            # elif key in sitemap.keys():  # re-use existing entry 
            #     custom_sitemap[key] = sitemap[key]
            else:
                custom_sitemap[key] = {
                    "name": f"{key}-custom",
                    "desc": "custom section",
                    "href": "about:blank",
                    "date": "2011-11-11",
                    "pages": {**value},
                }
    # custom_sitemap has been filled out
    return { **filtered_sitemap, **custom_sitemap }


#TODO: BuildTargetMap should lookup the URL, allowing for just a list of problem-names
if __name__ == "__main__":
    sitemap = LoadSitemapFile()
    # target_sections = ["Array-2", "Array-3"]
    # target_filelist = {
    #   "sleepIn": "https://codingbat.com/prob/p187868",
    #   "monkeyTrouble": "https://codingbat.com/prob/p181646",
    #   "sumDouble": "https://codingbat.com/prob/p154485",
    #   "diff21": "https://codingbat.com/prob/p116624",
    # }
    # target_pages = { "CustomSection": target_filelist }
    # sitemap = BuildTargetMap(target_sections, target_pages)
    # pprint(sitemap, indent=2, width=180, sort_dicts=False)
    
    results, failures = Scrape(sitemap, getAllTestcases=True)
    print("\n finished scrape \n")
    pprint(results, indent=2, width=180, sort_dicts=False)
    
    if (len(failures.keys()) > 0):
        print("\nFAILURES:")
        pprint(results, indent=2, width=180, sort_dicts=False)
    
    total_failure_count = 0
    for fail_list in failures.values():
        total_failure_count += len(fail_list) 
    print(f"\n scraped {len(results)} pages; {total_failure_count} failures ({len(failures)} sections). \n")
