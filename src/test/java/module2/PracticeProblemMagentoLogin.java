package module2;

/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeProblemMagentoLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");


        WebElement signInInput = driver.findElement(By.xpath("//li[@class='authorization-link']//a[@href = 'https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']"));


        //WebElement signInButton = driver.findElement(By.name("submit"));


        String UN = "testautoman@email.com";
        String PW = "qwerty123!";


        signInInput.click();
        Thread.sleep(2000);

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='login[username]']"));
        emailInput.sendKeys(UN);
        Thread.sleep(2000);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='login[password]']"));
        passwordInput.sendKeys(PW);
        Thread.sleep(2000);
        WebElement signInButton = driver.findElement(By.xpath("//button[@class='action login primary']//span[text()='Sign In']"));
        signInButton.click();
        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(2000);

        if(title.equals("Home Page")) {
            System.out.println("Welcome Message.");
            System.out.println("TEST: PASSED");
        }
        else
            System.err.println("TEST: FAILED");
        Thread.sleep(2000);

        driver.quit();


    }

}

Practice Problem: Magento Login
Test Intention:

Verify that the user can successfully log into the application using the provided credentials and that the application displays the appropriate indicators of a successful login. This includes ensuring that the appropriate elements (like signin button, email, and password fields) are correctly identified and can be interacted with.

Process:

    Setup your email and pwd by creating string variables for each on your IDE.
    UN: testautoman@email.com
    PW: qwerty123!
    Navigate to - https://magento.softwaretestingboard.com/
    Click sign-in button on homepage - use xpath as a locator strategy.
    Enter your email  - use xpath as a locator strategy.
    Enter your pwd  - use xpath as a locator strategy.
    Click signin button  - use xpath as a locator strategy.
    Print Title of the page to verify you successfully signed in.
    Print Welcome Message.
    Additionally, you can make a validation of the welcome message.
    - If the message starts with Welcome, then print in the console TEST: PASSED
    - Otherwise, TEST: FAILED
    Close the browser.


Note: Welcome message is located in the top right corner of the web page. It starts with "Welcome ..." and adds the name of the user.

Hint: To get the text from a web element you can use the getText() method. This will return you a string. Here is an example:

WebElement button = driver.findElement(By.xpath("//*[@id = 'button']"));
String textFromButton = button.getText();
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProblemMagentoLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Store the credentials that we will use to sign in
        String username = "testautoman@email.com";
        String password = "qwerty123!";

        // Navigate to the web-app
        driver.get("https://magento.softwaretestingboard.com/");

        // Wait for 2 seconds for the page to render
        Thread.sleep(2000);

        // Locate and store the Sign In button
        WebElement signInButton = driver.findElement(By.xpath(
                "//header[@class = 'page-header']//a[contains(text(), 'Sign In')]"
        ));
        signInButton.click();

        // Wait for 2 seconds for the page to render
        Thread.sleep(2000);

        WebElement usernameField = driver.findElement(By.xpath(
                "//input[@id = 'email']"
        ));
        WebElement passwordField = driver.findElement(By.xpath(
                "//input[contains(@title,'Password')]"
        ));
        WebElement logInButton = driver.findElement(By.xpath(
                "//fieldset//button"
        ));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        logInButton.click();

        // Wait for 2 seconds for the page to render
        Thread.sleep(2000);

        // Retrieve the title of the current page and print it
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Locate the web welcome message element
        WebElement welcomeMessageElement = driver.findElement(By.xpath(
                "//div[@class = 'panel header']//span[starts-with(text(), 'Welcome, ')]"
        ));
        // Having the element, utilize getText() to retrieve
        // the text from the web element
        String welcomeMessage = welcomeMessageElement.getText();
        // Print the message that comes from the web page
        System.out.println("Actual message on the web page: "
                + welcomeMessage);


        // Validation
        if(welcomeMessage.startsWith("Welcome,")){
            System.out.println("TEST: PASSED");
        } else {
            System.out.println("TEST: FAILED");
        }

        // terminate driver session
        driver.quit();

    }

}

