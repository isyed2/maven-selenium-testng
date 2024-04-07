package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNewToursRegistrationForm {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/");

        // locate Register tab
        WebElement registerTab = driver.findElement(By.linkText("REGISTER"));
        registerTab.click();

        // wait for 2 seconds until all elements render on the new page
        Thread.sleep(2000);

        //MY XPATH vs Teachers findElement...
        //WebElement InputClick           = driver.findElement(By.xpath("//a[text() = 'REGISTER']"));
        //WebElement usernameInput        = driver.findElement(By.xpath("//input[@name = 'email']"));
        //WebElement passwordInput        = driver.findElement(By.xpath("//input[@name = 'password']"));
        //WebElement confirmpasswordInput = driver.findElement(By.xpath("//input[@name = 'confirmPassword']"));
        //WebElement submitInput 		= driver.findElement(By.xpath("//input[@name='submit']"));

        // Locate the web elements for the registration form
        WebElement firstNameInputBox = driver.findElement(By.name("firstName"));
        WebElement lastNameInputBox = driver.findElement(By.name("lastName"));
        WebElement phoneInputBox = driver.findElement(By.name("phone"));
        WebElement emailInputBox = driver.findElement(By.name("userName"));
        WebElement addressInputBox = driver.findElement(By.name("address1"));
        WebElement cityInputBox = driver.findElement(By.name("city"));
        WebElement stateInputBox = driver.findElement(By.name("state"));
        WebElement postalCodeInputBox = driver.findElement(By.name("postalCode"));
        WebElement countryInputBox = driver.findElement(By.name("country"));
        WebElement usernameInputBox = driver.findElement(By.name("email"));
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        WebElement confirmPasswordInputBox = driver.findElement(By.name("confirmPassword"));
        WebElement submitButton = driver.findElement(By.name("submit"));

        // interact with the elements:
        firstNameInputBox.sendKeys("FirstNameTest");
        lastNameInputBox.sendKeys("LastNameTest");
        phoneInputBox.sendKeys("1233211212");
        emailInputBox.sendKeys("test@email.com");

        // wait for 2 seconds
        Thread.sleep(2000);
        addressInputBox.sendKeys("123 Test Street");
        cityInputBox.sendKeys("New York");
        stateInputBox.sendKeys("FL");
        postalCodeInputBox.sendKeys("33333");
        countryInputBox.sendKeys("United States");

        // wait for 2 seconds
        Thread.sleep(2000);
        usernameInputBox.sendKeys("testUsername");
        passwordInputBox.sendKeys("12345");
        confirmPasswordInputBox.sendKeys("12345");
        submitButton.click();

        // wait for 2 seconds
        Thread.sleep(2000);
        // get current url
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.endsWith("/register_sucess.php")){
            System.out.println("TEST: PASSED");
        } else {
            System.err.println("TEST: FAILED");
        }

        driver.quit();

    }

}


/*
Objective:
Verify user can successfully register an account.

Note:
When creating the WebDriver object make sure that you will maximize the window before starting the interactions with the web page for more flawless execution.
Note:
There will be one input box that differs from others. The 'Country' input box is a dropdown type where you can click on it and make a selection. However, in your scripts treat it as a simple input box and send the keys to it of whatever country you want.

    Navigate to 'http://demo.guru99.com/test/newtours/'
    Click on 'Register' tab on top navigation menu.
    Fill out all of the fields.
    Click 'Submit' button.
    If the url ends with '/register_sucess.php' print in the console TEST: PASSED otherwise, TEST: FAILED.
    Terminate the driver
 */