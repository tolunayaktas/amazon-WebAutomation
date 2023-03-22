package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.loginPage;

public class loginPageSteps {

    loginPage loginPage = new loginPage();


    @Given("Go to the Site")
    public void go_to_the_site() {
        loginPage.goToSite();

    }

    @When("Reach the login page")
    public void reach_the_login_page() throws InterruptedException {
        loginPage.reachTheLoginPage();
    }



    @Then("check {string} the warning message")
    public void checkTheWarningMessage(String degisken) {
        loginPage.check_the_warning_message(degisken);
    }

    @When("Fill the related email fields with {string}")
    public void fillTheRelatedEmailFieldsWith(String email) {
        loginPage.fill_the_related_fields_with_given_texts(email);
    }

    @When("Fill the related password fields with {string}")
    public void fillTheRelatedPasswordFieldsWith(String password) {
        loginPage.fill_the_password_field(password);
    }

    @Then("Check if you're logged in without any error")
    public void checkIfYouReLoggedInWithoutAnyError() {
        loginPage.check_if_youre_logged_in();

    }
}
