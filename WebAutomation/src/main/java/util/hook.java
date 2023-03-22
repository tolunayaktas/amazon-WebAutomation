package util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class hook {

    WebDriver driver;

    @Before
    public void beforeTest() {
        driverFactory.initializeDriver();
        driver = driverFactory.getDriver();
        driver.get("https://www.amazon.com/");
    }

    @After
    public void afterTest() {
        //driver.quit();
    }
}
