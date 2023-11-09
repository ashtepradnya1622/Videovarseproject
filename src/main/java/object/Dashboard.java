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
        public void dataverify(){
            verifyText(totalstream, "Total Streams");
            System.out.println();
        }
}
