package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Addevent;
import pages.Login;
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
        addevent.selectCategory1();
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
        addevent.uploadThamb();
    }
    @Then("user clicks on event Orgnizer and enter the event orgnizer name {string}")
    public void userClicksOnEventOrgnizerAndEnterTheEventOrgnizerName(String Oname) {
        addevent.eventOrgnizer(Oname);
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
    @When("User clicks on sport")
    public void userClicksOnSport() {
        addevent.selectCategory1();
    }
    @Then("user clicks on dropdown option {string}")
    public void userClicksOnDropdownOption(String stype) {
        addevent.Dropdown(stype);
    }
}
