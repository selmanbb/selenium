package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver=new ChromeDriver();
        //driver objesi olusturunca selenium web driver
        // bilgisayarimizdali chrome browserdan bos bir sayfa actirir.
        // eger baska browser kullanmak istersek selenium sitesinden o browser driver
        //indirip projeye eklemek gerekir.

        driver.get("https://www.amazon.com");

        //eger kodlarimizi belirli bir sure bekletmek istersek

        Thread.sleep(5000);

        System.out.println("sayfa url'i : " +driver.getCurrentUrl());

        System.out.println("sayfa title'i : "+ driver.getTitle());

        driver.close();
    }

}
