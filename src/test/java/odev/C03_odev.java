package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_odev {
    public static void main(String[] args) {
        // 1-C01_TekrarTesti isimli bir class olusturu
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 2- https://www.google.com/ adresine gidin.
        driver.get("https://www.google.com/");

        // 3- cookies uyarisini kabul ederek kapatin
        WebElement cookiesButton = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        cookiesButton.click();
        // driver.findElement(By.xpath("//button[@id='L2AGLb']"));

        // 4-Sayfa basliginin "Google" ifadesi icerdigini test edin.
        String expectedTitleIcerik= "Google";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Sayfa basligi 'Google' ifadesini iceriyor");
        }else{
            System.out.println("Sayfa basligi 'Google' ifadesini icermiyor");
        }
        // 5- Arama cubuguna "Nutella" yazip aratin.
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Nutella"+ Keys.ENTER);
        // 6-Bulunan sonuc sayisini yazdirin.
        WebElement bulunanSonuclar =driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println(bulunanSonuclar.getText());
        // 7- sonuc sayisinin 10 milyon'dan fazla oldugunu test edin.
        String [] elementler= bulunanSonuclar.getText().split(" ");

        long sayi = Long.parseLong(elementler[1].replaceAll("\\.",""));

        if (sayi>10_000_000){
            System.out.println("sonuc sayisi 10 milyon'dan fazla");
        }else {
            System.out.println("sonuc sayisi 10 milyon'dan fazla degil");
        }
        // 8-Sayfayi kapatin.

        driver.close();
    }

}
