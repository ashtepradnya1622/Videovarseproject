package stepDefinitions;

import io.cucumber.java.en.Then;
import object.Addevent;
import object.Login;
import object.Stream;
public class Streamstepdef {
    Login login;
    Stream stream;
    public Streamstepdef(Login login, Stream stream ) {
        this.stream  = stream;
        this.login = login;
    }@Then("user clicks on any event")
    public void userClicksOnAnyEvent() {
    stream.streamClick();
    }
    @Then("user clicks on add stream button")
    public void userClicksOnAddStreamButton() {
   stream.addStreamButton();
    }
    @Then("user clicks on event name{string}")
    public void userClicksOnEventName(String ename1) {
        stream.streamClick();
    }
    @Then("user clicks on Streamtitle and enter the stream name {string}")
    public void userClicksOnStreamtitleAndEnterTheStreamName(String streamname) {
    stream.addStreamTitle(streamname);
    }
}
