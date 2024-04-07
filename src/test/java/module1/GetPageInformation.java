package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageInformation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "http://dev-hrm.yoll.io/";
        driver.get(url);

        String title=driver.getTitle();
        System.out.println("Page Title: "+title);

        //http://dev-hrm.yoll.io/index.php/auth/requestPasswordResetCode

        String currentUrl=driver.getCurrentUrl();
        System.out.println("Actual URL: "+currentUrl);

        driver.quit();


        //String url = "http://dev-hrm.yoll.io/";
        //sout sys out print

        // Code format
        // Opt + Cmd + L
        // Ctrl + Alt  + L
    }
}