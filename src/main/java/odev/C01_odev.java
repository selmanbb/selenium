package odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_odev {
    public static void main(String[] args) throws InterruptedException {
        //1.Yeni bir class olusturalim (Homework)

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        // (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        driver.get("https://www.facebook.com");
        String expectedTitleIcerik= "facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Facebook Title testi Passed");
        }else{
            System.out.println("Facebook Title testi Failed");
            System.out.println("Actual title : " + actualTitle);
            System.out.println("Actual title aranan " +expectedTitleIcerik+ " kelimesini icermiyor");
        }

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.

        String expectedUrlIcerik = "facebook";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Facebook Url testi Passed");
        }else {
            System.out.println("Url testi Failed");
            System.out.println("Actual Url : " + actualUrl);
            System.out.println("Actual Url aranan "+ expectedUrlIcerik + " kelimesini icermiyor");
        }
        //4.https://www.walmart.com/ sayfasina gidin.

        driver.get("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        String expectedTitle2 = "Walmart.com";
        String actualTitle2= driver.getTitle();
        if (actualTitle2.contains("Walmart.com")){
            System.out.println("Walmart Title testi Passed");
        }else {
            System.out.println("Walmart Title testi failed");
            System.out.println("Actual title : " + actualTitle2);
            System.out.println("Actual title aranan " +expectedTitleIcerik+ " kelimesini icermiyor");
        }


        //6. Tekrar “facebook” sayfasina donun

        driver.navigate().back();


        //7. Sayfayi yenileyin

        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin

        driver.manage().window().maximize();
        Thread.sleep(2000);


        //9.Browser’i kapatin

        driver.quit();


    }
}
