package odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_odev {
    public static void main(String[] args) throws InterruptedException {

        // 1. Yeni bir class olusturun (TekrarTesti)

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        driver.get("https://www.youtube.com");
        String expectedTitleIcerik ="youtube";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("youtube title test passed");
        }else {
            System.out.println("youtube title testi failed");
            System.out.println("actual title : " + actualTitle);
            System.out.println("actual title aranan " + expectedTitleIcerik + " kelimesini icermiyor");
        }

        // 3. Sayfa URL’sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL’yi yazdırın.

        String expectedUrlicerik = "youtube";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlicerik)){
            System.out.println("youtube Url testi Passed");
        }else {
            System.out.println("youtube Url testi Failed");
            System.out.println("Actual Url : " + actualUrl);
            System.out.println("Actual Url aranan "+ expectedUrlicerik + " kelimesini icermiyor");
        }

        // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        // 5. Youtube sayfasina geri donun

        driver.navigate().back();
        Thread.sleep(2000);

        // 6. Sayfayi yenileyin

        driver.navigate().refresh();
        Thread.sleep(2000);

        // 7. Amazon sayfasina donun

        driver.navigate().forward();
        Thread.sleep(2000);

        // 8. Sayfayi tamsayfa yapin

        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        // 9. Ardından sayfa başlığının “Amazon” içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.

        String expectedTitleIcerigi2 = "Amazon";
        String actualTitle2 = driver.getTitle();
        if (actualTitle2.contains(expectedTitleIcerigi2)){
            System.out.println("Amazon title test passed");
        }else{
            System.out.println("Amazon title test failed");
            System.out.println("Actual title : " + actualTitle2);
            System.out.println("Actual title aranan " + expectedTitleIcerigi2 + " kelimesini icermiyor");
        }

        // 10.Sayfa URL’sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL’yi yazdırın

        String expectedUrl2= "https://www.amazon.com/";
        String actualUrl2= driver.getCurrentUrl();
        if (actualUrl2.contains(expectedUrl2)){
            System.out.println("Amazon Url test passed");
        }else{
            System.out.println("Amazon Url testi failed");
            System.out.println("Actual url : " + actualUrl2);

        }
        // 11.Sayfayi kapatin

        driver.quit();

    }

}
