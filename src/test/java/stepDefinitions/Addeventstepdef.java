package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.Addevent;
import object.Login;

public class Addeventstepdef {
    Login login;
    Addevent addevent;

    public Addeventstepdef(Login login, Addevent addevent) {
        this.addevent = addevent;
        this.login = login;
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
    public void userClicksOnEventTitleAndEnterTheEventTitle(String ename) {
        addevent.enterEventTitle(ename);
    }
    @Then("user clicks on upload thumbnail and upload the file")
    public void userClicksOnUploadThumbnailAndUploadTheFile() {
        addevent.uploadthamb();
    }

//    @Then("user clicks on description and enter the description details")
//    public void userClicksOnDescriptionAndEnterTheDescriptionDetails() {
//        addevent.description();
//    }
}
