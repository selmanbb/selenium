package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.time.Duration;

public class Q2 {
    /* ...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.otto.de");

        String actOttoTitle = driver.getTitle();
        System.out.println("actOttoTitle = " + actOttoTitle);

        String actOttoUrl = driver.getCurrentUrl();
        System.out.println("actOttoUrl = " + actOttoUrl);

        if (actOttoTitle.contains("OTTO"))
            System.out.println("Otto title test passed");
        else
            System.out.println("Otto title test failed");

        if (actOttoUrl.contains("otto"))
            System.out.println("Otto Url test passed");
        else
            System.out.println("Otto Url test failed");

        driver.navigate().to("https://wisequarter.com");

        boolean isTrue = driver.getTitle().contains("Quarter");

        if (isTrue)
            System.out.println("WQ title test passed");
        else
            System.out.println("WQ title test failed");

        String wqUrl = driver.getCurrentUrl();

        System.out.println(wqUrl.contains("quarter")? "WQ Url Test Passed" : "WQ Url Test Failed");

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();
    }
}
