package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.Base;

public class Addevent extends Base{
    public Addevent() {
            super();
            PageFactory.initElements(driver(), this);
        }
    @FindBy(linkText = "Events")
    WebElement clickevent;
    public void redirectEvents()
    {
        JSClick(clickevent);
    }
}
