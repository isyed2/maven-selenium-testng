package module2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class M2VerifyingTabVisualFeedback {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io");
        Thread.sleep(1000);

        WebElement usernameInput = driver.findElement(By.cssSelector("#txtUsername"));
        WebElement passwordInput = driver.findElement(By.cssSelector("[name=txtPassword]"));
        WebElement loginButton = driver.findElement(By.cssSelector("#btnLogin"));

        //Thread.sleep(1000);

        /* Test Data */
        String username = "yoll-student";
        String password = "Bootcamp5#";

        /* Perform actions on these elements */
        usernameInput.sendKeys(username);
        //Thread.sleep(2000);
        passwordInput.sendKeys(password);
        //Thread.sleep(2000);
        loginButton.click();

        String title=driver.getTitle();
        System.out.println("Page Title: "+title);

        WebElement getTabPIMColor = driver.findElement(By.xpath("//*[text()='PIM']"));
        String color = getTabPIMColor.getCssValue("background-color");//color
        System.out.println("PIM tab background color before: "+color);
        getTabPIMColor.click();

        WebElement getTabPIMColor2 = driver.findElement(By.xpath("//*[text()='PIM']"));
        String color2 = getTabPIMColor2.getCssValue("background-color");//color
        System.out.println("PIM tab background color after: "+color2);

        driver.quit();
    }

}
/* Book solution,
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeHrmVisualFeedback {

    public static void main(String[] args) throws InterruptedException {

                WebDriver driver = new ChromeDriver();
                driver.get("http://dev-hrm.yoll.io/");

                String username = "yoll-student";
                String password = "Bootcamp5#";

                WebElement usernameInput = driver.findElement(By.id("txtUsername"));
                WebElement passwordInput = driver.findElement(By.id("txtPassword"));
                WebElement loginButton = driver.findElement(By.id("btnLogin"));

                // Interact with elements
                usernameInput.sendKeys(username);
                passwordInput.sendKeys(password);
                loginButton.click();

                Thread.sleep(2000);

                String title = driver.getTitle();
                System.out.println("Page title: " + title);

                // Locate PIM Tab
                WebElement pimTab = driver.findElement(By.id("menu_pim_viewPimModule"));
                System.out.println("PIM tab background color before click: "
                                   + pimTab.getCssValue("background-color"));

                pimTab.click();

                // relocate the pim tab after interaction with it
                pimTab = driver.findElement(By.id("menu_pim_viewPimModule"));
                System.out.println("PIM tab background color after click: "
                                   + pimTab.getCssValue("background-color"));

                driver.quit();

    }
}
 */