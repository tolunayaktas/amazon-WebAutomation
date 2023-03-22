package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class homePageSteps {

    homePage homePage = new homePage();

    @Given("ortama getirme")
    public void ortamaGetirme() {
        homePage.goToHomePage("sadsa");
    }

    @When("eylem gerçekleştirme")
    public void eylemGerçekleştirme() {
        homePage.clickLoginButton();
    }

    @Then("kontrol yapılması")
    public void kontrolYapılması() {
        homePage.checkHomePage();
    }

    @When("eylem gerçekleştirme {string}")
    public void eylemGerçekleştirme(String degisken) {
        homePage.goToHomePage(degisken);
    }
    @Given("Open browser and the website")
    public void open_browser_and_the_website() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("click searchbar and type {}")
    public void click_searchbar_and_type(String ara1) {
        // Write code here that turns the phrase above into concrete actions
        homePage.searchSomething(ara1);
    }
    @When("Click the shown product")
    public void click_the_shown_product() {
        homePage.clicktheproduct();
    }
    @Then("Check whether youre right product")
    public void check_whether_youre_right_product() {
        homePage.checkproductpage();
    }
    @Then("Check the shown product")
    public void check_the_shown_product(){
        homePage.checkproduct();
    }

    @When("Click the all menu")
    public void clickTheAllMenu() {
        homePage.clicktheall();
    }

    @When("Click electronics")
    public void clickElectronics() {
        homePage.clickeletronics();
    }

    @When("Click cameras")
    public void clickCameras() {
        homePage.clickcameras();
    }

    @Then("check if the product exists")
    public void checkIfTheProductExists() {
        homePage.checkthelenseproduct();
    }

    @When("Filter by {string} and {string}")
    public void filterByAndLenses(String text,String text2) {
        homePage.filterforsamandlen(text,text2);
    }
}
