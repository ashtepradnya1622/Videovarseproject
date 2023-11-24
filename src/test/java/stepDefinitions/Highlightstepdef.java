package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Addevent;
import pages.Highlight;
import pages.Login;

public class Highlightstepdef {
    Login login;
    Highlight highlight;
    public Highlightstepdef(Login login, Highlight highlight) {
        this.highlight = highlight;
        this.login = login;
    }
    @Then("user selects the clips")
    public void userSelectsTheClips() {
        highlight.clipOne();
        highlight.clipTwo();
        highlight.clipThree();
    }
    @Then("user clicks on uparrow")
    public void userClicksOnUparrow() {
        highlight.upArrow();
    }
    @Then("user clicks on highlight button")
    public void userClicksOnHighlightButton() {
        highlight.highLight();
    }
    @Then("user clicks on highlighttitle and enter the value{string}")
    public void userClicksOnHighlighttitleAndEnterTheValue(String title) {
        highlight.htitle(title);
    }
    @Then("user clicks on description and enter the description details {string}")
    public void userClicksOnDescriptionAndEnterTheDescriptionDetails(String hdesc) {
        highlight.hdescription(hdesc);
    }
    @Then("user clicks on clips and perform drag drop")
    public void userClicksOnClipsAndPerformDragDrop() {
        highlight.dragAndDrop();
    }
    @Then("user clicks on save as draft button")
    public void userClicksOnSaveAsDraftButton() {
        highlight.saveDraft();
    }
    @Then("user clicks on preview button")
    public void userClicksOnPreviewButton() {
        highlight.previewButton();
    }
    @Then("user clicks on frame")
    public void userClicksOnFrame() {
        highlight.frame();
    }
    @Then("user clicks on next icon")
    public void userClicksOnNextIcon() {
        highlight.nextIcon();
    }
    @Then("user clicks on frame type")
    public void userClicksOnFrameType() {
        highlight.frameType();
    }
}


