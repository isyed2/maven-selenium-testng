package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class M2InteractionswithSwagLabsInventory {
    public static void main(String[] args) throws InterruptedException {

        // create a driver
        WebDriver driver = new ChromeDriver();
        String url = "https://www.saucedemo.com/";
        driver.get(url);

        // maximize window
        driver.manage().window().maximize(); // full screen

        /* 1- Login */
        // locate web elements for login
        WebElement usernameInput = driver.findElement(By.xpath("//input[@data-test = 'username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value = 'Login']"));

        /* 2 Locate the username and password fields and the login button to log in to the system */
        String username = "standard_user", password = "secret_sauce";
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        /* 3- Validate Login Success: */
        WebElement pageHeaderElement = driver.findElement(By.xpath("//span[@class='title']"));
        String header = pageHeaderElement.getText();
        System.out.println("Successfully Logged In. Page header: "+header);

        if(header.equals("Products"))
            System.out.println("- Verify Page Header: PASSED");
        else
            System.err.println("- Verify Page Header: FAILED");

        /* 4- Verify Items Count: */
        List<WebElement> pageHeaderElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div[@class='inventory_item']"));
        int pageHeaderElementsCount = pageHeaderElements.size();
        System.out.println("Available items on Products page: "+pageHeaderElementsCount);

        if(pageHeaderElementsCount==6)
            System.out.println("- Verify Items Count: PASSED");
        else
            System.err.println("- Verify Items Count: FAILED");

        /* 5- Check for Specific Product: */

        WebElement bikeLightElement = driver.findElement(By.xpath("//div[@class='inventory_list']//img[@alt='Sauce Labs Bike Light']"));
        String isPresent = bikeLightElement.getAccessibleName();

        if(isPresent.equals("Sauce Labs Bike Light"))
            System.out.println("- Verify \'Sauce Labs Bike Light\' is present : PASSED");
        else
            System.err.println("- Verify \'Sauce Labs Bike Light\' is present : FAILED");

        /* 6- ADD TO CART Button Displayed and Enabled State: */

        WebElement addToCartButtonElement = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        String isPresentButton = addToCartButtonElement.getAccessibleName();

        if(isPresentButton.equals("Add to cart"))
            System.out.println("- Verify \'ADD TO CART\' button for \'Sauce Labs Bolt T-Shirt\' is visible: PASSED");
        else
            System.err.println("- Verify \'ADD TO CART\' button for \'Sauce Labs Bolt T-Shirt\' is visible: FAILED");

        /* 7- Verify ADD TO CART Button CSS Properties: */

        WebElement addToCartButtonColor = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        String checkButtonColor = addToCartButtonColor.getCssValue("color");

        WebElement addToCartButtonBorderColor = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        String checkButtonBorderColor = addToCartButtonBorderColor.getCssValue("border-top-color");

        if(checkButtonColor.equals("rgba(19, 35, 34, 1)"))
            System.out.println("- Verify Button Text Color: PASSED");
        else
            System.err.println("- Verify Button Text Color: FAILED");

        if(checkButtonBorderColor.equals("rgba(19, 35, 34, 1)")) // You should replace "rgba(19, 35, 34, 1)" with the actual expected color value
            System.out.println("- Verify Button Border Color: PASSED");
        else
            System.err.println("- Verify Button Border Color: FAILED");

        /* 8- Interact with Button and Verify Changes: */

        WebElement addToCartButtonInteract = driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCartButtonInteract.click();
        System.out.println("Clicked 'ADD TO CART' button.");

        WebElement addToCartButtonRemoveColor = driver.findElement(By.xpath("//*[@name='remove-sauce-labs-bolt-t-shirt']"));
        String checkButtonInteract = addToCartButtonRemoveColor.getText();
        System.out.println("Current button displayed text: "+checkButtonInteract );
        if (checkButtonInteract.equals("Remove"))
            System.out.println("- Verify Button Text: PASSED");
        else
            System.err.println("- Verify Button Text: FAILED");

        String checkButtonRemoveColor = addToCartButtonRemoveColor.getCssValue("color");
        String checkButtonBorderColor2 = addToCartButtonRemoveColor.getCssValue("border-color");

        if (checkButtonRemoveColor.equals("rgba(226, 35, 26, 1)"))
            System.out.println("- Verify Button Text Color: PASSED");
        else
            System.err.println("- Verify Button Text Color: FAILED");

        if (checkButtonBorderColor2.equals("rgb(226, 35, 26)"))
            System.out.println("- Verify Button Border Color: PASSED");
        else
            System.err.println("- Verify Button Border Color: FAILED");

        /* 9- Cart Verification: */

        WebElement cartClick = driver.findElement(By.xpath("//a[@class='shopping_cart_link']/span[@class='shopping_cart_badge']"));
        cartClick.click();
        Thread.sleep(2000);
        System.out.println("Clicked Cart button.");

        WebElement cartVerification = driver.findElement(By.xpath("//div[@class='cart_quantity']"));
        String isItemCartVerification = cartVerification.getText();

        if(isItemCartVerification.equals("1"))
            System.out.println("- Verify Cart Items: PASSED");
        else
            System.err.println("- Verify Cart Items: FAILED");


        /* 10- Quit the Browser. */
        driver.quit();
    }

}


