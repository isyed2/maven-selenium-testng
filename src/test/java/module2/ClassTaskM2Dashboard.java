package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTaskM2Dashboard {

    public static void main(String[] args) throws InterruptedException {

        // create a driver
        WebDriver driver = new ChromeDriver();
        String url = "http://dev-hrm.yoll.io";
        driver.get(url);

        /* maximize window */
        driver.manage().window().maximize(); // full screen

        // locate web elements for login
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='LOGIN']"));

        // Interact with elements
        String username = "yoll-student";
        String password = "Bootcamp5#";

        /* Perform actions on these elements */
        usernameInput.sendKeys(username );
        Thread.sleep(2000);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(5000);

        // Wait for 3 seconds
        Thread.sleep(3000);

        String expectedPageHeader="Dashboard";

        WebElement pageHeader = driver.findElement(By.xpath("//*[@class='head']/h1"));
        String actualPageHeader=pageHeader.getText();

        if(expectedPageHeader.equals(actualPageHeader))
            System.out.println("TEST: PASSED");
        else
            System.err.println("TEST: FAILED");



        // Close the browser
        driver.quit();
    }
}


