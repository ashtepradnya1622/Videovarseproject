package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Editevent;
import pages.Login;

public class Editeventstepdef {
    Login login;
    Editevent editevent;
    public Editeventstepdef(Login login, Editevent editevent) {
        this.editevent = editevent;
        this.login = login;
    }
    @And("User clicks on the three dots under Actions column")
    public void userClicksOnTheThreeDotsUnderActionsColumn() {
        editevent.clickEditEventBtn();
    }

    @And("User clicks on Edit Event button")
    public void userClicksOnEditEventButton() {
        editevent.editEventText();

    }
    @And("user edits the event title{string}")
    public void userEditsTheEventTitle(String etitle) {
        editevent.editEventTitle(etitle);
    }
    @And("User edits the name of the Organizer {string}")
    public void userEditsTheNameOfTheOrganizer(String oname) {
        editevent.editOrganizer(oname);
    }
    @Then("user clicks on save button")
    public void userclicksonsavebutton() {
        editevent.clickSaveBtn();
    }
    @Then("user clicks on serach box and enter the event name{string}")
    public void userClicksOnSerachBoxAndEnterTheEventName(String ename) {
        editevent.searchBox(ename);
    }


}
