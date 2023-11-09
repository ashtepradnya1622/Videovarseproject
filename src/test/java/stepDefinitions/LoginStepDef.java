package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.Login;

public class LoginStepDef {
    Login login;
    public LoginStepDef(Login login) {
        this.login = login;
    }
    @When("User opens the url")
    public void user_opens_the_url() {
        login.Validlogin();
    }
    @And("enter the valid details")
    public void enterTheValidDetails() {
        login.Validlogin();
    }

    @Then("Click on login button")
    public void clickOnLoginButton() {

    }
    @When("User opens the url enter the valid details & click on login button")
    public void userOpensTheUrlEnterTheValidDetailsClickOnLoginButton(){
        login.Validlogin();
    }
    @Given("user opens the url")
    public void userOpensTheUrl() {
        login.openUrl();
    }
    @When("^user Enter (.+) and (.+)$")
    public void userEnterUserIdAndPassword(String userId, String password) {
        login.Invalidlogin(userId,password);
    }
    @Then("User is not navigated to the next page")
    public void User_is_not_navigated_to_the_next_page() {

    }

    @Then("users clicks on login button")
    public void usersClicksOnLoginButton() {
        login.blanklogin();
    }
    @Then("user clicks on forgot password link text")
    public void userClicksOnForgotPasswordLinkText() {
        login.clickonforgotpassword();
    }

    @And("user enters the email id")
    public void userEntersTheEmailId() {
    login.link();
    }

    @Then("user clicks on reset password link buttton")
    public void userClicksOnResetPasswordLinkButtton() {
login.clickonresetlink();
    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        login.openUrl();
    }
}


