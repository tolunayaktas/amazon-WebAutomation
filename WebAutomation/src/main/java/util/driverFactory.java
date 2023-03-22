package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverFactory {



    static WebDriver driver;

    public static void initializeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    public static WebDriver getDriver(){
        return driver;
    }
}
