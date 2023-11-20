package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Dashboard;
import pages.Login;

public class Dashboardverificationstep {
    Dashboard dashboard;
    Login login;
    public Dashboardverificationstep(Login login, Dashboard  dashboard)  {
        this.login =login;
        this.dashboard = dashboard;
    }
    @Given("When User opens the url enter the valid details & click on login button")
    public void whenUserOpensTheUrlEnterTheValidDetailsClickOnLoginButton() {
login.Validlogin();
    }
    @Then("Verify the data from dashboard")
    public void verifyTheDataFromDashboard() {
    dashboard.dataverify();
    }
}
