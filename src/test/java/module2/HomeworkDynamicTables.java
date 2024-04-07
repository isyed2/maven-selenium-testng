package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeworkDynamicTables {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dynamic-table");
        System.out.println("Page Title: " + driver.getTitle());

        List<WebElement> columnHeaders = driver.findElements(By.xpath("//table//th"));
        int cpuColumnPosition = -1;

        for(int i = 0; i < columnHeaders.size(); i++){
            String currentHeaderName = columnHeaders.get(i).getText();
            if("CPU".equals(currentHeaderName)){
                cpuColumnPosition = i+1;
                break;
            }
        }

        String chromeCpuXpath = "//table//td[text() = 'Chrome']/../td["+cpuColumnPosition+"]";
        String actualChromeCpu = driver.findElement(By.xpath(chromeCpuXpath)).getText();
        System.out.println("Actual Chrome CPU: " + actualChromeCpu);

        String expectedChromeCpu = driver.findElement(By.id("chrome-cpu")).getText();
        System.out.println("Expected Chrome CPU: " + expectedChromeCpu);

        if(expectedChromeCpu.endsWith(actualChromeCpu)){
            System.out.println("TEST: PASSED");
        } else {
            System.out.println("TEST: FAILED");
        }

        driver.quit();

    }
}