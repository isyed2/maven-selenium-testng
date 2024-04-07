package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

            /*
            Go to http://demo.guru99.com/test/newtours/
            Fill out username and password using Name locator
            Username: test@email.com
            Password: test
            Click on submit button
            Click on Vacations link using partialLinktext locator
            Then wait for 10 seconds
            Click on Register link using linkText locator
            Then wait for 10 seconds
            Close completely the webDriver instance
             */

public class Guru99Practice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/");

        /* Locate the elements for login form */
        WebElement usernameInput = driver.findElement(By.name("userName"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.name("submit"));

        /* Test Data */
        String username = "test@email.com";
        String password = "test";

        /* Perform actions on these elements */
        usernameInput.sendKeys(username);
        Thread.sleep(2000);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        submitButton.click();
        Thread.sleep(5000);

        /* Interact with Vacations link */
        // When locating element - use locators per page and then actions
        WebElement vacationsLink = driver.findElement(By.partialLinkText("Vacations"));
        vacationsLink.click();
        Thread.sleep(10000);

        /* Interact with Register link */
        WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
        registerLink.click();
        Thread.sleep(10000);

        /* Verify successfully landed on Register Page */
        String expectedUrlPostFix = "/register.php";
        String actualUrl = driver.getCurrentUrl();

        // https://demo.guru99.com/test/newtours/register.php/success
        // contains -> true
        // /register.php

        if (actualUrl.endsWith(expectedUrlPostFix)) {
            System.out.println("Registration Page Test: PASSED");
        } else {
            System.err.println("Registration Page Test: FAILED");
        }


        driver.quit();

    }
}