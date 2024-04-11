package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownTwo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");

        WebElement dropdownWebElement =
                driver.findElement(By.id("daybox"));
        Select dropdown = new Select(dropdownWebElement);
        List<WebElement> allOptions = dropdown.getOptions();

        for (WebElement option: allOptions){
            System.out.println(option.getText());
        }

        dropdown.selectByVisibleText("21");
        String selectedOption = dropdown.getFirstSelectedOption().getText();
        System.out.println("Selected Day: " + selectedOption);

        driver.quit();

    }

}

/* My solution
    public static void main(String[] args) throws InterruptedException {
        // 1 - Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // 2 - Maximize window
        driver.manage().window().maximize();

        // 3 - Navigate to the webpage
        driver.get("http://demo.automationtesting.in/Register.html");
        Thread.sleep(2000);

        // 4 - Find the dropdown element
        WebElement dropdownWebElement = driver.findElement(By.xpath("//select[@placeholder='Day']"));

        // 5 - Create a Select object
        Select dropdown = new Select(dropdownWebElement);

        // 6 - Select options from the dropdown
        dropdown.selectByVisibleText("25");

        // 7 - Get the first selected option
        WebElement firstSelectedOption = dropdown.getFirstSelectedOption();

        // 8 - Print the text of the first selected option
        System.out.println("Selected day: " + firstSelectedOption.getText());

        // 9 - Close the browser
        driver.quit();
    }
}
 */
/*
// 5 - Create a Select object
Select dropdown = new Select(dropdownWebElement);

// 6 - Select options from the dropdown
        dropdown.selectByVisibleText("Option 1");
        dropdown.selectByVisibleText("Option 2");

// 7 - Get the first selected option
WebElement firstSelectedOption = dropdown.getFirstSelectedOption();

// 8 - Print the text of the first selected option
        System.out.println("First Selected Option: " + firstSelectedOption.getText());
/*
        // 5 - Click on the dropdown to open it
        dropdownWebElement.click();

        // 6 - Find all the options within the dropdown
        List<WebElement> options = dropdownWebElement.findElements(By.xpath("//select[@placeholder='Day']/option"));

        // 7 - Print the text of each option
        String dobMonth = "25";

        for (WebElement option : options) {
            System.out.println(option.getText());
            if(dobMonth.equals(option.getText())) {
                option.getFirstSelectedOption();
                break;
            }
        }
*/
// 8 - Close the browser
