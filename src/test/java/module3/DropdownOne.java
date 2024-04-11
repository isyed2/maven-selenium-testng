package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownOne {
    public static void main(String[] args) throws InterruptedException {
        // 1 - Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // 2 - Maximize window
        driver.manage().window().maximize();

        // 3 - Navigate to the webpage
        driver.get("http://demo.automationtesting.in/Register.html");
        Thread.sleep(2000);

        // 4 - Find the dropdown element
        WebElement dropdownWebElement = driver.findElement(By.xpath("//select[@placeholder='Month']"));

        // 5 - Click on the dropdown to open it
        dropdownWebElement.click();

        // 6 - Find all the options within the dropdown
        List<WebElement> options = dropdownWebElement.findElements(By.tagName("option"));

        // 7 - Print the text of each option
        String dobMonth = "May";
        for (WebElement option : options) {
            System.out.println(option.getText());
            if(dobMonth.equals(option.getText())) {
                break;
            }
        }

        // 8 - Close the browser
        driver.quit();
    }
}
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");

        WebElement dropdownWebElement =
                driver.findElement(By.cssSelector("select[placeholder=Month]"));
        Select dropdown = new Select(dropdownWebElement);
        List<WebElement> allOptions = dropdown.getOptions();

        String expectedDOB = "November";

        for (WebElement option: allOptions){
            String month = option.getText();
            System.out.println(month);
            if(expectedDOB.equals(month)){
                break;
            }
        }

        driver.quit();

    }

}
 */
