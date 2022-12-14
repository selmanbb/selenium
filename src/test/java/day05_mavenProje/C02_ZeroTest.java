package day05_mavenProje;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ZeroTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
       // 2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();
       // 3. Login alanine  “username” yazdirin
        WebElement loginUsernameKutusu= driver.findElement(By.id("user_login"));
        loginUsernameKutusu.sendKeys("username");
       // 4. Password alanine “password” yazdirin
        WebElement passwordElementKutusu= driver.findElement(By.id("user_password"));
        passwordElementKutusu.sendKeys("password");
       // 5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        driver.navigate().back();

       // 6. online bankings menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[text()='Pay Bills']")).click();

       // 7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amountKutusu= driver.findElement(By.id("sp_amount"));
        amountKutusu.sendKeys("200");

       // 8. tarih kismina “2020-09-10” yazdirin
        WebElement tarihKutusu= driver.findElement(By.id("sp_date"));
        tarihKutusu.sendKeys("2020-09-10");
       // 9. Pay buttonuna tiklayin
        WebElement payButonu= driver.findElement(By.id("pay_saved_payees"));
        payButonu.click();
        // 10. “The payment was successfully submitted.” mesajinin ciktigini control edin
        WebElement basariliYazisiElementi= driver.findElement(By.id("alert_content"));

        String actualBasariliYazisi= basariliYazisiElementi.getText();
        String expectedBasariliYazisi="The payment was successfully submitted.";

        if (actualBasariliYazisi.equals(expectedBasariliYazisi)){
            System.out.println("Basarili odeme yazisi gorunuyor, test PASSED");
        }else{
            System.out.println("Basarili odeme yazisi gorunmuyor, test FAILED");
        }

    }
}
