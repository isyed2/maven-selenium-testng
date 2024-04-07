package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTables {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.expandtesting.com/dynamic-table");

        System.out.println("Page Title: " + driver.getTitle());

        //div[@class='col-md-6']//tr/td[text()='Chrome']/../td[2]"
        String getChromeCPUXpath = "//div[@class='col-md-6']//tr/td[text()='Chrome']/../td[contains(text(), '%')]";
        String getOrangeChromeCPUXpath = "//div[@class='col-md-6']/p[@id='chrome-cpu']//..//p[text()]";

        String chromeCPU = driver.findElement(By.xpath(getChromeCPUXpath)).getText();
        String chromeOrangeCPU = driver.findElement(By.xpath(getOrangeChromeCPUXpath)).getText();

        chromeOrangeCPU=chromeOrangeCPU.replaceAll("Chrome CPU: ","");

        System.out.println("chromeCPU: "+chromeCPU);
        System.out.println("chromeOrangeCPU: "+chromeOrangeCPU);

        // Validation
        if(chromeCPU.contains(chromeOrangeCPU)){
            System.out.println("TEST: PASSED");
        } else {
            System.err.println("TEST: FAILED");
        }

       driver.quit();

    }

}
/*
Practice Problem: Dynamic Web Tables
Objective:

In this task, you will hone your skills in web automation and data extraction using Selenium WebDriver and Java.
Your challenge is to interact with a dynamic web table, where the position of rows and columns can change upon each page refresh.
Your program should be resilient and adaptable to changes in the table's structure, ensuring that it can
consistently locate and extract the correct data. This will test your ability to implement dynamic XPath strategies
and employ robust programming practices to handle potential variations in real world environment.
Process:

    Initialize WebDriver:
    Create a driver object to interact with the web browser.
    Optimize Window for Testing:
    Maximize the browser window to ensure all elements are visible.
    Access the Web Page:
    Navigate to the URL: 'https://practice.expandtesting.com/dynamic-table'.
    Capture and Display Page Title:
    Print the Page Title in the following format: 'Page Title: ' - replace with the actual title of the page.
    Develop a Dynamic Locator for Chrome CPU:
    - Recognize that the positions of rows and columns in the table change with each page refresh.
    - Devise a strategy to dynamically locate the CPU value for the Chrome browser each time, ensuring the value is directly retrieved from the table.
    Extract Expected CPU Value:
    Locate and extract the CPU value from the Orange container under the table. This value represents the expected CPU value for comparison.
    Validate CPU Values:
    Compare the expected CPU value with the actual CPU value extracted from the table.
    If they match, print 'TEST: PASSED'.
    If they do not match, print 'TEST: FAILED'.
    Conclude Testing:
    Close the browser to end the session.

x - I need hints* (click only if you really tried everything) - x


 */