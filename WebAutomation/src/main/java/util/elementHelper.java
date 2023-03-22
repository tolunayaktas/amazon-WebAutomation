package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class elementHelper {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public elementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.actions = new Actions(driver);
    }

    public void click(By by) {
        driver.findElement(by).click();
        driver.findElement(by).isDisplayed();
    }
    public void exists(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }


    public void clickListWitText(By by, String text) {
        boolean check = false;
        List<WebElement> elements = driver.findElements(by);
        for (WebElement element : elements) {
            if (element.getText().equals(text)) {
                element.click();
                check = true;
                break;
            }
        }
        Assert.assertEquals(check, true, "Listede istediğin elementi bulamadım!");
    }


    public void sendKeys(By by, String degiskenIsmı) {
        driver.findElement(by).sendKeys(degiskenIsmı);
    }

    public void moveTo(By elementname) {
        //actions.moveToElement(driver.findElement(elementname)).perform();

        //actions.moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(elementname))).build().perform();

        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elementname));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.moveToElement(driver.findElement(elementname)).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkElementPresence(By elementname) {
        //wait.until(ExpectedConditions.presenceOfElementLocated(by));

        actions.moveToElement(wait.until(ExpectedConditions.presenceOfElementLocated(elementname))).build().perform();
    }

    public void validate(By degisken, String text) {
        Assert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(degisken)).getText(), text);
    }


}
