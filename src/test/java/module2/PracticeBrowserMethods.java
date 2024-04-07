package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeBrowserMethods {

    public static void main(String[] args) throws InterruptedException {

        // to start visiting any web applications/sites
        // we will first create a driver object
        WebDriver driver = new ChromeDriver();

        // go to website number 1 of your choice using get() method
        driver.get("https://www.facebook.com/");

        // maximize the window
        driver.manage().window().maximize();

        // go to website number 2 of your choice using get() method
        driver.get("https://www.bestbuy.com/");

        // go to website number 3 of your choice using get() method
        driver.get("https://github.com/");

        // go to website number 4 of your choice using navigate() method
        driver.navigate().to("http://dev-hrm.yoll.io/");

        // print 4th website title on your console using getTitle() method
        System.out.println("4th Web Site Title: " + driver.getTitle());

        // go back using back() method and print 3rd website title
        driver.navigate().back();
        System.out.println("3rd Web Site Title: " + driver.getTitle());

        // go back using back() method and print 2nd website URL
        driver.navigate().back();
        System.out.println("2nd Web Site URL: " + driver.getCurrentUrl());

        // go back using back() method and print 1st website URL
        driver.navigate().back();
        System.out.println("1st Web Site URL: " + driver.getCurrentUrl());

        //======================================================================================
        /*
        8. Write a Selenium code snippet with Xpath which will return number of available items in page.
        The solution here will be a snippet of selenium code how you would identify programmatically how many items present on the home page.
        * Hint: Utilize, xpath to locate multiple items, findElements() to retrieve all of them, and List to count how many items are in there.
        */
        //=======================================================================================

        driver.get("https://demowebshop.tricentis.com/");

        WebElement productsGroup = driver.findElement(By.xpath("//div[@class='prices']/span[text()='1800.00']"));
        String s1= productsGroup.getText();
        System.out.println(s1);

        List<WebElement> productsCategories = driver.findElements(By.xpath("//div[@class='block block-category-navigation']//li[@class='inactive']"));
        for (WebElement productsCategory : productsCategories) {
            String s2 = productsCategory.getText();
            System.out.println(s2);
        }
        System.out.println("Items found(productsCategories): " + productsCategories.size());

        List<WebElement> columnCustomerServices = driver.findElements(By.xpath("//div[@class='column customer-service']//li/a"));
        for (WebElement columnCustomerService : columnCustomerServices) {
            String s3 = "Item: "+columnCustomerService.getText();
            System.out.println(s3);
        }
        System.out.println("Items found(columnCustomerService): " + columnCustomerServices.size());


        List<WebElement> productsTopMenuItems = driver.findElements(By.xpath("//div[@class='header-menu']/ul[@class='top-menu']/li/a"));
        for (WebElement productsTopMenuItem : productsTopMenuItems) {
            String s4 = "Item: "+productsTopMenuItem.getText();
            System.out.println(s4);
        }
        System.out.println("Items found(productsTopMenuItems): " + productsTopMenuItems.size());


        List<WebElement> products = driver.findElements(By.xpath("//div[@class='item-box']"));

        System.out.println("Items found(products): " + products.size());

        for (WebElement product : products) {
            // Lets print the titles in our console
            String text = product.getText();
            System.out.println("Title: " + text);
        }
        //=====================================================================================
        driver.quit();


    }

}
/*
1. Logo:
- //img[contains(@src,'logo.png')]
- //img[@alt = 'Tricentis Demo Web Shop']
2. Gift Cart:
- //a[text() = '$25 Virtual Gift Card']
- //h2[@class = 'product-title']//a[text() = '$25 Virtual Gift Card']
3. Wishlist:
- //*[@class = 'header']//*[@class = 'ico-wishlist']
- //div[@class = 'header-links']//*[@href = '/wishlist']
4. Register:
- //a[text() = 'Register']
5. Search Button:
- //input[contains(@class, 'search-box-button')]
6. Search Input Field:
- //input[@id = 'small-searchterms']
7. Build your own expensive computer price:
- //a[text() = 'Build your own expensive computer']/../..//span



Part 2: Understanding XPath and Element Collection in Selenium

Explanation:

When developing web automation scripts, it's often necessary to locate multiple web elements on a page. One popular strategy for this is using XPath, which allows you to specify criteria that match multiple elements.


If an XPath expression matches more than one element on a webpage, the result is a collection of those web elements. In the context of Selenium, this collection is represented as a list of WebElements.

When you anticipate that an XPath might match multiple elements on a page, you should use the findElements() method in Selenium. Note the 's' in findElements, which indicates that it's designed to fetch multiple elements. This method returns a list of WebElement objects. For instance:
List elements = driver.findElements(By.xpath("your-xpath-here"));

The returned datatype of the findElements() method is List, representing a list of WebElement objects.

Counting the Elements:

To ascertain the number of elements that an XPath has matched, simply invoke the size() method on the returned list.

When it comes to counting the elements matched by an XPath, there are two primary approaches:

    Assign the result of findElements() to a List object and subsequently call the size() method.
    Directly apply the size() method to the result of the findElements() method, bypassing the need to store the elements in a list if they aren't required for further processing.

Consider an XPath expression that matches 10 elements, represented as "//*[@class = 'items']".


To retrieve and count these elements using Selenium:
List elements = driver.findElements(By.xpath("//*[@class = 'items']"));

With the elements stored in the 'elements' list, you can then determine the count as follows:
int countOfItems = elements.size();

If your sole aim is to ascertain the count without any subsequent processing of the elements, you can shorten the code as follows:
int countOfItems = driver.findElements(By.xpath("//*[@class = 'items']")).size();

See the solution for second part here:

WebDriver driver = new ChromeDriver();

driver.get("https://demowebshop.tricentis.com/");

​

// items available - //div[@class = 'item-box']

int numberOfItemsOnHomePage =

    driver.findElements(By.xpath("//div[@class = 'item-box']")).size();

// category options - /strong[text() = 'Categories']/../..//li

int numberOfCategoryOptions =

    driver.findElements(By.xpath("//strong[text() = 'Categories']/../..//li")).size();

// customer srvice op - //h3[text() = 'Customer service']/..//li

int numberOfCustomerServiceOptions =

    driver.findElements(By.xpath("//h3[text() = 'Customer service']/..//li")).size();

// header options - //*[@class= 'header-menu']/ul[@class = 'top-menu']/li

int numberOfHeaderMenuOptions =

    driver.findElements(By.xpath("//*[@class= 'header-menu']/ul[@class = 'top-menu']/li")).size();

​

// Optional Part of printing them:

System.out.println("numberOfItemsOnHomePage: "+ numberOfItemsOnHomePage);

System.out.println("numberOfCategoryOptions: " + numberOfCategoryOptions);

System.out.println("numberOfCustomerServiceOptions: " + numberOfCustomerServiceOptions);

System.out.println("numberOfHeaderMenuOptions: " + numberOfHeaderMenuOptions);

​

 */