package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();//cikan pencereyi asmak icin

        driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nevzat"+ Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Celik"+Keys.ENTER);
        Thread.sleep(1000);

        WebElement genderRadioButton= driver.findElement(By.xpath("//input[@id='sex-0']")); //gender
        genderRadioButton.click();
        genderRadioButton.sendKeys(Keys.PAGE_DOWN);

        driver.findElement(By.xpath("//input[@id='exp-0']")).click();


        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11.10.2021"+Keys.ENTER);


        driver.findElement(By.xpath("//input[@id='profession-1']")).click();


        driver.findElement(By.xpath("//input[@id='tool-2']")).click();


        driver.findElement(By.xpath("//select[@class='input-xlarge']")).sendKeys("Antartica"+Keys.ENTER+Keys.ENTER);


        driver.findElement(By.xpath("//select[@id='selenium_commands']")).sendKeys("Browser Commands"+Keys.ENTER);

        driver.findElement(By.xpath("//button[@id='submit']")).click();


        driver.close();






    }
}
