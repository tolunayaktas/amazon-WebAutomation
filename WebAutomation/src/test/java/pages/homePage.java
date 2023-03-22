package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.driverFactory;
import util.elementHelper;

public class homePage {

    WebDriver driver = driverFactory.getDriver();
    elementHelper elementHelper = new elementHelper(driverFactory.getDriver());

    By element1 = By.id("saddsadsa");
    By element2 = By.xpath("dsasadsa");
    By searchBar = By.id("twotabsearchtextbox");
    By searchBtn = By.id("nav-search-submit-button");
    By product1 = By.xpath("//span[contains(text(),'Apple 2023 MacBook Pro Laptop M2 Pro chip with 12‑')]");
    By visitApple = By.id("bylineInfo");
    By allMenu = By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/i[1]");
    By electronics = By.xpath("//div[contains(text(),'Electronics')]");
    By cameras = By.xpath("//a[contains(text(),'Camera & Photo')]");
    By filterSamsung = By.cssSelector("#brandsRefinements  .a-size-base.a-color-base");
    By filterLenses = By.cssSelector("#departments .a-size-base.a-color-base");
    By lenseProduct = By.xpath("//span[contains(text(),'Samsung GX-20 14.6MP Digital SLR Camera with 18-55')]");
    By iphone13 = By.xpath("//span[contains(text(),'iPhone 13, 128GB, Pink - Unlocked (Renewed Premium')]");

    public void goToHomePage(String degisken) {
        elementHelper.click(element1);
        //elementHelper.sendKey(element2,degisken);

    }

    public void checkHomePage() {
        driver.getTitle();
    }

    public void clickLoginButton() {
        driver.getTitle();
    }

    public void searchSomething(String araDegisken) {
        elementHelper.click(searchBar);
        elementHelper.sendKeys(searchBar, araDegisken);
        elementHelper.click(searchBtn);


    }

    public void clicktheproduct() {

        elementHelper.click(product1);
    }

    public void checkproductpage() {

        elementHelper.validate(visitApple, "Visit the Apple Store");
    }
    public void checkproduct() {

        elementHelper.validate(iphone13,"iPhone 13, 128GB, Pink - Unlocked (Renewed Premium)");
    }

    public void clicktheall() {
        elementHelper.click(allMenu);


    }

    public void clickeletronics() {
        elementHelper.click(electronics);


    }

    public void clickcameras() {
        elementHelper.click(cameras);


    }

    public void filterforsamandlen(String text, String text2) {
        elementHelper.clickListWitText(filterSamsung, text);
        elementHelper.clickListWitText(filterLenses, text2);
    }

    public void checkthelenseproduct() {
        elementHelper.validate(lenseProduct, "Samsung GX-20 14.6MP Digital SLR Camera with 18-55mm Lens");


    }


}
