package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.driverFactory;
import util.elementHelper;

import java.util.concurrent.TimeUnit;

public class loginPage {

    WebDriver driver = driverFactory.getDriver();
    util.elementHelper elementHelper = new elementHelper(driverFactory.getDriver());

    By element1 = By.id("nav-link-accountList-nav-line-1");
    By element2 = By.xpath("dsasadsa");
    By HelloSignin = By.cssSelector("#nav-link-accountList");
    By Signin = By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]");
    By emailField = By.id("ap_email");
    By passwordField = By.id("ap_password");
    By continueBtn = By.id("continue");
    By invalidResponse = By.xpath("//h4[contains(text(),'There was a problem')]");
    By signinBtn = By.id("signInSubmit");
    By needHelp = By.xpath("//span[contains(text(),'Need help?')]");

    public void goToSite() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.get("https://www.amazon.com/");


    }

    public void reachTheLoginPage() throws InterruptedException {

        //elementHelper.checkElementPresence(HelloSignin);
        elementHelper.moveTo(HelloSignin);
        elementHelper.click(Signin);


    }
    public void fill_the_related_fields_with_given_texts(String asdf){

        elementHelper.sendKeys(emailField,asdf);
        elementHelper.click(continueBtn);

    }
    public void check_the_warning_message(String deşdadsad){

        elementHelper.validate(invalidResponse,deşdadsad);

    }
    public void fill_the_password_field(String sdfg){

        elementHelper.sendKeys(passwordField,sdfg);
        elementHelper.click(signinBtn);
    }
    public void check_if_youre_logged_in(){

        elementHelper.validate(needHelp,"Need help?");


    }




}
