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
    url = "https://codingbat.com/java"
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


def ScrapeProblemPage(driver: webdriver, url: str) -> dict:
    driver.get(url)
    content = driver.find_element(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[@class='indent']")
    title = content.find_element(By.XPATH, "./span")
    print(title.text)
    
    stuff = content.find_element(By.XPATH, "./table/tbody/tr/td")
    prompt = stuff.find_element(By.XPATH, "./div[@class='minh']/p")
    # 3 simple testcases are provided in the format: (x, y) -> expected_result (with UTF-8 arrow symbol)
    simple_testcases = [line for line in stuff.text.splitlines() if "→" in line]
    provided_code = stuff.find_element(By.XPATH, "./form[@name='codeform']/div[@id='ace_div']/div[@class='ace_scroller']/div[@class='ace_content']/div[3]")
    
    data = {
        "title": title.text,
        "prompt": prompt.text,
        "testcases": simple_testcases,
        "provided_code": provided_code.text,
    }
    
    return data


def Main():
    driver = StartupSelenium()
    scraped_results = []
    
    try:
        sitemap = BuildSitemap(driver)
        WriteSitemapFile(sitemap)
        
        for (section, problem_map) in sitemap.items():
            for (problem, link) in problem_map.items():
                scraped_data = ScrapeProblemPage(driver, link)
                scraped_results.append({
                    "url": link,
                    "section": section,
                    "problem": problem,
                    **scraped_data,
                })
    except Exception as E:
        print(f"exception: {E}")
        driver.quit()
        return
    
    driver.quit()
    return scraped_results


if __name__ == "__main__":
    results = Main()
    for result in results:
        SaveFile(result, result["section"], result["problem"])
        #WriteJavaFile(result["section"], result)
    