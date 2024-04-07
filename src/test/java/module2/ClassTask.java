package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask {

    //https://magento.softwaretestingboard.com/
//Locate below elements with xpath
//Logo
//Cart
//Search input box
//
//WOMEN'S DEALS
//- Hoodies and Sweatshirts
//- Jackets
//
//Xpath syntax => //tagName[@AttributeName='AttributeValue']

    public static void main(String[] args) throws InterruptedException {

        // create a driver
        WebDriver driver = new ChromeDriver();
        String url = "https://www.saucedemo.com/";
        driver.get(url);

        // maximize window
        driver.manage().window().maximize(); // full screen

        // locate web elements for login
        WebElement usernameInput = driver.findElement(By.xpath("//input[@data-test = 'username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value = 'Login']"));

        // interact with elements
        String username = "standard_user", password = "secret_sauce";
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        Thread.sleep(3000);
    }

}
