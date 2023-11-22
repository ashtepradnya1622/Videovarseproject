package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.Login;
import pages.Stream;
import util.Upload;
public class Streamstepdef {
    Login login;
    Stream stream;
    public Streamstepdef(Login login, Stream stream ) {
        this.stream  = stream;
        this.login = login;
  }
//    @Then("user clicks on any event")
//    public void userClicksOnAnyEvent() {
//    stream.streamClick();
//    }
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
    @Then("user clicks on uploadthumbnail butoon")
    public void userClicksOnUploadthumbnailButoon() {
    stream.uploadThamb1();
    }
    @Then("user clicks on streamtype dropdown option {string}")
    public void userClicksOnStreamtypeDropdownOption(String stype) {
        stream.streamType(stype);
    }
    @Then("user clicks on stream link type option {string}")
    public void userClicksOnStreamLinkTypeOption(String ltype) {
        stream.LinkType(ltype);
    }
    @Then("user clicks on Downlodable link")
    public void userClicksOnDownlodableLink() {
        stream.downladLink();
    }
    @Then("user clicks on create button")
    public void userClicksOnCreateButton() {
        stream.buttonSubmit();
    }

}
