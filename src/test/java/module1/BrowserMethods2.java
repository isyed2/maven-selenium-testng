package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods2 {

    // To kick out - start a program with java code you will need a main method
    // JVM - it looks for specific combination of keywords for main() method (public, static, void)
    public static void main(String[] args) throws InterruptedException {

        // First we need to create a driver instance that will force our (corresponding) browser to do actions
        //WebDriver driver = new ChromeDriver(); // Upcasting - Polymorphism
        WebDriver driver = new ChromeDriver();

        // Once you create a driver object you can access the methods and variables from it
        // To navigate to a web application we use 2 methods
        // driver.get() - requires url as String argument
        driver.get("http://dev-hrm.yoll.io/");

        // Once we navigated to the URL
        // We can start interacting with web application

        // The getTitle() method will return you the page title as a string
        String title = driver.getTitle();

        // We will simply print the title in the console
        System.out.println(title);

        // pause the execution
        Thread.sleep(5000);

        // At the end of all tests we want to clean up the browser - we will close it
        // for that we can use quit() method
        driver.quit();

        // Code format
        // Opt + Cmd + L
        // Ctrl + Alt  + L
        // Code format
        //String url = "http://dev-hrm.yoll.io/";
        //sout sys out print

        // Code format
        // Opt + Cmd + L
        // Ctrl + Alt  + L

    }
}

