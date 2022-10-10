package day03_webElement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_findElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        //bir web sitesinde herhangi bir web elementi kullanabilmek icin
        //o web elementi kodlarimiza tanitmamiz gerekir.

        //WebElement amazonAramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement amazonAramaKutusu = driver.findElement(By.name("field-keywords"));

        amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        Thread.sleep(5000);

        driver.close();
    }





}
