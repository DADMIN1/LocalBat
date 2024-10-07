from save import *

from selenium import webdriver
from selenium.webdriver.firefox.options import Options as FirefoxOptions
from selenium.webdriver.common.by import By


def StartupSelenium() -> webdriver:
    options = FirefoxOptions()
    options.add_argument('--headless')
    driver = webdriver.Firefox(options=options)
    driver.implicitly_wait(10)
    return driver


# returns dict { section-name: link }
def SpiderMainPage(driver: webdriver) -> dict:
    url = "https://codingbat.com/java"  # TODO: add python 
    driver.get(url)
    table = driver.find_element(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[1]/table")
    hrefs = table.find_elements(By.XPATH, "./tbody/tr/td/div[@class='summ']/a[@href]")
    links = { href.accessible_name: href.get_attribute('href') for href in hrefs }
    return links


def Spider(driver: webdriver, link: str) -> dict:
    driver.get(link)
    table = driver.find_element(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[1]/table")
    problem_links = table.find_elements(By.XPATH, "./tbody/tr/td/a[@href]")
    return { problem.accessible_name: problem.get_attribute('href') for problem in problem_links }


def BuildSitemap(driver: webdriver) -> dict:
    section_links = SpiderMainPage(driver)
    sitemap = {
        section_name: Spider(driver, section_link)
        for (section_name, section_link) in section_links.items()
    }
    return sitemap


# TODO: implement this.
def GetExtendedTestcases():
    # it's not as straightforward as just clicking the button; 
    # the submitted code needs to compile (including correct return-type).
    # Click the 'solution' button, then copy and submit the code from that. 
    # but not all problems have a solution provided?
    return []


def ScrapeProblemPage(driver: webdriver, url: str, getAllTestcases=True) -> dict:
    driver.get(url)
    content = driver.find_element(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[@class='indent']")
    title = content.find_element(By.XPATH, "./span")
    print(title.text)
    
    stuff = content.find_element(By.XPATH, "./table/tbody/tr/td")
    prompt = stuff.find_element(By.XPATH, "./div[@class='minh']/p")
    # 3 simple testcases are provided in the format: (x, y) -> expected_result (with UTF-8 arrow symbol)
    simple_testcases = [line for line in stuff.text.splitlines() if "→" in line]
    extended_testcases = []
    provided_code = stuff.find_element(By.XPATH, "./form[@name='codeform']/div[@id='ace_div']/div[@class='ace_scroller']/div[@class='ace_content']/div[3]")
    
    # if getAllTestcases:
    #     extended_testcases = GetExtendedTestcases()
    
    data = {
        "title": title.text,
        "prompt": prompt.text,
        #"testcases": [*simple_testcases, *extended_testcases],
        "testcases": simple_testcases,
        "provided_code": provided_code.text,
    }
    
    return data


def Scrape() -> list[dict]:
    driver = StartupSelenium()
    scraped_results = []
    
    sitemap = LoadSitemapFile()
    try:
        if sitemap is None:
            print("sitemap not found; building sitemap")
            sitemap = BuildSitemap(driver)
            WriteSitemapFile(sitemap)
    except Exception as E:
        print(f"failed to write sitemap exception: {E}")
        driver.quit()
        return scraped_results
    
    try:
        for (section, problem_map) in sitemap.items():
            for (problem, link) in problem_map.items():
                scraped_data = ScrapeProblemPage(driver, link)
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
        return scraped_results
    
    driver.quit()
    return scraped_results


if __name__ == "__main__":
    results = Scrape()
    print("\n finished scrape \n")
    for result in results:
        WriteJavaFile(result["section"], result)
    print("\n finished writing all files \n")
