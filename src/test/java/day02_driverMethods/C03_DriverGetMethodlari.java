package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver=new ChromeDriver();

        System.out.println(driver.getWindowHandle());
        //CDwindow-F60644D5C18C1E0CB5D413FC61EC362E

        System.out.println(driver.getWindowHandles());

        driver.get("https:www.amazon.com");

        System.out.println(driver.getPageSource());

        driver.close();

    }
}
