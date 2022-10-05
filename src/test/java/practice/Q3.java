package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    /* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button
 */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");



    }
}
