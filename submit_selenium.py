from scrape import *
from database import *


def Submit(driver:webdriver, url:str, solution:str):
    driver.get(url)
    content = driver.find_element(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[@class='indent']")
    title = content.find_element(By.XPATH, "./span")
    print(f"submitting: {title.text}...")
    stuff = content.find_element(By.XPATH, "./table/tbody/tr/td")
    textarea = stuff.find_element(By.XPATH, "./form[@name='codeform']/div[@id='ace_div']/textarea")
    cursor_position = textarea.get_property("style")['top']
    
    # TODO: figure out how to prevent the editor from auto-closing braces??
    # TODO: use cursor height instead of hardcoded 13; then line-num = top/height (first line is 0)
    # cursor_height = textarea.get_property("style")['height'] 
    while cursor_position != "39px":
        sleep(0.1) # print("waiting..."); sleep(0.25)
        textarea.send_keys(Keys.CONTROL, 'A')
        cursor_position = textarea.get_property("style")['top']
    
    while cursor_position != "0px":
        sleep(0.1) # print("waiting..."); sleep(0.25)
        textarea.send_keys(Keys.BACKSPACE)
        cursor_position = textarea.get_property("style")['top']
    
    # typing the solution and submitting with CTRL+ENTER
    (ActionChains(driver)
        .send_keys_to_element(textarea, solution).pause(1)
        .key_down(Keys.CONTROL).send_keys_to_element(textarea, Keys.ENTER).pause(1)
        .key_up(Keys.CONTROL)
    ).perform()
    
    content = driver.find_element(By.XPATH, "/html/body/div[@class='tabc']/div[@class='tabin']/div[@class='indent']")
    success = False
    try:
        results = content.find_element(By.XPATH, "./table/tbody/tr/td/div[@id='results']")
        success = 'Correct' in results.text
    except NoSuchElementException as notFound:
        print(f"[ERROR] results failed. {notFound}")
        success = False
    
    # on failure, screenshot the (presumably botched) input and (compiler) error message
    if not success:
        screenshot_dir = pathlib.Path.cwd() / "failure_screenshots"
        if not screenshot_dir.exists(): screenshot_dir.mkdir()
        problem_number = driver.current_url.rsplit('/', maxsplit=1)[-1]
        screenshot_filename = f"{driver.title.removeprefix('CodingBat Java ').replace('-','')} - {problem_number}"
        screenshot_filepath = screenshot_dir / f"{screenshot_filename}.png"
        with open(screenshot_filepath, 'wb') as screenshot_file:
            screenshot_file.write(content.screenshot_as_png)
    
    return success


def SubmitSolutions(solutions):
    driver = StartupSelenium(headless=False)
    failed_pages = {}  # section: problem
    
    url = "https://codingbat.com/prob/p125339"
    # TODO: trim final '}' and '\n' from solution (codingbat auto-inserts closing bracket)
    # you'll need to trim ALL closing brackets?? Or only when they're followed by newlines?
    solution = "boolean lastDigit(int a, int b) {\n    return ((a%10) == (b%10));"
    section = 'Warmup-1'
    problem = 'LastDigit'
    
    try:
        result = Submit(driver, url, solution)
        if not result:
            print(f"submission failed for: {section}/{problem}!")
            if not section in failed_pages: failed_pages[section] = { problem: url };
            else: failed_pages[section][problem] = url;
    except Exception as E:
        print(f"exception: {E}")
        driver.quit()
        return failed_pages
    
    driver.quit()
    return failed_pages


# TODO: finish the submission code


if __name__ == "__main__":
    Commit()
    solutions = LoadSolutions()
    failures = SubmitSolutions(solutions)
    if len(failures) > 0:
        print("failures: ")
        print(failures)
