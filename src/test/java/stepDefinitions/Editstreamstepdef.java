package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.Addevent;
import pages.Editstream;
import pages.Login;
public class Editstreamstepdef {
    Login login;
    Editstream editstream;
    public Editstreamstepdef(Login login, Editstream editstream) {
        this.login = login;
        this.editstream=editstream;
    }
    @Then("user clicks on three dots")
    public void userClicksOnThreeDots() {
        editstream.threeDots();
    }
    @Then("user clicks on editstreambutton")
    public void userClicksOnEditstreambutton() {
    editstream.editStreambutton();
    }
    @Then("user clicks on stream title and enter the stream name {string}")
    public void userClicksOnStreamTitleAndEnterTheStreamName(String stname) {
        editstream.streamTitle(stname);
    }
    @Then("user clicks on stream name{string}")
    public void userClicksOnStreamName(String ssearch) {
        editstream.streamSearch(ssearch);
    }
    @Then("user clicks on stream Name")
    public void userClicksOnStreamName() {
        editstream.selectstreamName();
    }
}
