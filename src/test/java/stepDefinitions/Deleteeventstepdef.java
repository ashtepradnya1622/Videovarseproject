package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import object.Deleteevent;
import object.Login;

public class Deleteeventstepdef {
    Login login;
    Deleteevent deleteevent ;
    public Deleteeventstepdef(Login login, Deleteevent  deleteevent) {
        this.deleteevent   = deleteevent;
        this.login = login;
    }
    @And("User clicks on the three dots under Actions column of Tenis evenet")
    public void userClicksOnTheThreeDotsUnderActionsColumnOfTenisEvenet() {
        deleteevent.deleteDot();
    }
    @And("user clicks on Delete event button")
    public void userClicksOnDeleteEventButton() {
        deleteevent.deleteButton();
    }
    @Then("user clicks on Cancel button")
    public void userClicksOnCancelButton() {
        deleteevent.deleteCancel();
    }
}
