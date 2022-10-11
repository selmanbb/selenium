package day03_webElement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_noSuchElementExc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement aramaKtusu= driver.findElement(By.id("twotabsearchtextbox"));

        aramaKtusu.sendKeys("Nutella");

        driver.close();

    }
}
