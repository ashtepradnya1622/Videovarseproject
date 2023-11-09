package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Genericutil;

public class Dashboard extends Genericutil{
        public Dashboard() {
            super();
            PageFactory.initElements(driver(), this);
        }
    @FindBy(xpath = "//p[text()='Total Streams']")
    WebElement totalstream;
    @FindBy(xpath = "//p[text()='Live Streams']")
    WebElement livestream;
    @FindBy(xpath = "//p[text()='Total Users']")
    WebElement totaluser;
    @FindBy(xpath = "//p[text()='Pending Invitations']")
    WebElement PendingInvitations;
    public void dataverify(){
            verifyText(totalstream, "Total Streams");
            verifyText(livestream ,"Live Streams");
            verifyText(totaluser,"Total Users");
            verifyText(PendingInvitations,"Pending Invitations");


    }
}
