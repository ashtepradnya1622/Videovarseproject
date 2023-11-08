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
}
