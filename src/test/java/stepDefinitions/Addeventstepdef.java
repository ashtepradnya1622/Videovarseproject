package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.Addevent;
import object.Login;

public class Addeventstepdef {
    Addevent addevent;

    public Addeventstepdef (Addevent addevent) {
        this.addevent = addevent;
    }
    @Then("user clicks on event")
    public void userClicksOnEvent() {
        addevent.redirectEvents();
    }

    @Then("user selects the category")
    public void userSelectsTheCategory() {
    addevent.selectcategory();
    }

    @Then("user click on Add event button")
    public void userClickOnAddEventButton() {
    addevent.Addevents();
    }
    @Then("user clicks on event title  and enter the event title {string}")
    public void userClicksOnEventTitleAndEnterTheEventTitle(String arg0) {
    //addevent.enterEventTitle();
    }
}
