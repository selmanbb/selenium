package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");

        String expectedTitleIcerik="amazon";
        String expectedUrlIcerik="Amazon";

        String actualUrl= driver.getCurrentUrl();
        String actualTitle= driver.getTitle();

        //test yapalim

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url test PASSED");
        }else{
            System.out.println("Url test FAILED");
            System.out.println("actual URL : "+ actualUrl);
            System.out.println("actual url aranan " + expectedUrlIcerik+" kelimesini icermiyor");
        }

        //title test

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
            System.out.println("Actual Title : "+ actualTitle);
            System.out.println("actual url aranan " + expectedTitleIcerik+" kelimesini icermiyor");
        }

        driver.quit();


    }
}
