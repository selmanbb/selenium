package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
            WebDriver driver=new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://www.google.com/");
            Thread.sleep(3000);
            driver.navigate().to("https://www.amazon.com/");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().forward();
            Thread.sleep(1000);
            driver.navigate().refresh();
            Thread.sleep(1000);
            driver.close();

            System.out.println("Gorev tamam");



    }
}
