package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.Addevent;
import object.Login;
import util.Genericutil;

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
        Genericutil.sleep(2000);
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

    @Then("user clicks on event Orgnizer and enter the event orgnizer name {string}")
    public void userClicksOnEventOrgnizerAndEnterTheEventOrgnizerName(String Oname) {
        addevent.Eventorgnizer(Oname);
    }
    @Then("user clicks on dropdown option")
    public void userClicksOnDropdownOption() {
        addevent.dropdown();
    }

    @And("User selects the Event Type from the dropdown")
    public void userSelectsTheEventTypeFromTheDropdown()
    {
        addevent.eventType();
    }
    @Then("User selects the Event Start Date {int}")
    public void user_selects_the_event_start_date(Integer sDate) {
        addevent.eventStartDate(sDate);
    }
    @And("User selects the Event End Date {int}")
    public void userSelectsTheEventEndDate(Integer eDate) {
        addevent.eventEndDate(eDate);
    }
    @And("User clicks the Create button")
    public void userClicksTheButton() {
        addevent.clickCreateBtn();
    }

//    @Then("user clicks on dropdown option 1")
//    public void userClicksOnDropdownOption(String Option) {
//        addevent.Dropdown(Option);
//    }

}





