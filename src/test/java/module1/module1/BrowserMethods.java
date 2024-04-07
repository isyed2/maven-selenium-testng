package module1.module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//driver.close(); // one tab
//driver.quit();  // all table plus browser.
//driver.get();
//driver.navigate().to();
//driver.navigate().refresh();
//driver.navigate().back();
//driver.manage().window().maximize();
//driver.navigate().forward();
//driver.navigate().forward();
//driver.navigate().forward();
//String url = "http://dev-hrm.yoll.io/";
//sout sys out print
//System.out.println("Item Relevant");
//System.err.println("Item Irrelevant");
//WebElement searchInput = driver.findElement(By.id("gh-search-input"));
//WebElement searchButton = driver.findElement(By.className("header-search-button"));
//WebDriver driver = new ChromeDriver();
//driver.get("http://dev-hrm.yoll.io/");
//driver.manage().window().maximize();
//driver.findElement(By.id("btnLogin")).click();
//usernameInput.sendKeys("username123");
//Thread.sleep(2000);
//usernameInput.clear();
//usernameInput.sendKeys("yoll-student");
//passwordInput.sendKeys("Bootcamp5#");
//List<WebElement> products = driver.findElements(By.className("sku-title"));
//for (WebElement product : products) {
//  String text = product.getText();
//WebElement loginButton = driver.findElement(By.id("btnLogin"));
//loginButton.click();
//WebElement vacationsLink = driver.findElement(By.partialLinkText("Vacations"));
//vacationsLink.click();
//WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
//registerLink.click();
//// 1. Select element by id
//WebElement element = driver.findElement(By.xpath("//*[@id='elementId']"));
//// 2. Select element by class name
//WebElement element = driver.findElement(By.xpath("//*[@class='className']"));
//// 3. Select element by attribute value
//WebElement element = driver.findElement(By.xpath("//*[@attribute='value']"));
//// 4. Select element by tag name
//WebElement element = driver.findElement(By.xpath("//tagName"));
//// 5. Select child element
//WebElement element = driver.findElement(By.xpath("//parentElement/childElement"));
//// 6. Select element by index
//WebElement element = driver.findElement(By.xpath("(//*[@class='className'])[2]"));
//// 7. Select element by text
//WebElement element = driver.findElement(By.xpath("//*[text()='desiredText']"));
//// 8. Select element with contains() function
//WebElement element = driver.findElement(By.xpath("//*[contains(@attribute,'partialValue')]"));
//// 9. Select element with starts-with() function
//WebElement element = driver.findElement(By.xpath("//*[starts-with(@attribute,'partialValue')]"));
//// 10. Select element with following-sibling axis
//WebElement element = driver.findElement(By.xpath("//precedingSiblingElement/following-sibling::siblingElement"));

// Code format
// Opt + Cmd + L
// Ctrl + Alt  + L

public class BrowserMethods {

    public static void main(String[] args) throws InterruptedException {

        //to pause use java method - Thread.sleep(5000);

        WebDriver driver = new ChromeDriver();
        //max the window size
        driver.manage().window().maximize();
        String url = "https://www.bestbuy.com";

        //driver.get(url);
        driver.navigate().to(url);

        String title = driver.getTitle();
        System.out.println(title);

        Thread.sleep(5000);

        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.get("https://www.google.com/");
        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(5000);

        driver.navigate().forward();
        Thread.sleep(5000);


        driver.quit();

        //driver.close(); // one tab
        //driver.quit();  // all table plus browser.
        //driver.get();
        //driver.navigate().to();
        //driver.navigate().refresh();
        //driver.navigate().back();
        //driver.manage().window().maximize();
        //driver.navigate().forward();
        //driver.navigate().forward();
        //driver.navigate().forward();
        //String url = "http://dev-hrm.yoll.io/";
        //sout sys out print


        // Code format
        // Opt + Cmd + L
        // Ctrl + Alt  + L
    }

}
