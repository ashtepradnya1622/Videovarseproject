package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Genericutil;
public class Stream extends Genericutil {
    WebDriver driver;
    public Stream() {
        super();
        PageFactory.initElements(driver(), this);
    }
//    @FindBy(xpath = "(//div[contains(@class,'InovuaReactDataGrid__cell__content')])[7]")
//    WebElement Clickstream;
    @FindBy(xpath = "(//p[normalize-space()='Saniatenis'])[1]")
    WebElement Clickstream;
    @FindBy(xpath = "//button[@class='_buttonMain_199iz_1 _buttonTypePrimary_199iz_22  _button_15w0k_29 ']")
    WebElement addstream;
    @FindBy(xpath = "input[placeholder='Enter stream title']")
    WebElement streamtitle;
    public void streamClick() {
        JSClick(Clickstream);
    }
    public void addStreamButton() {
        waitAndClick(addstream);
    }
    public void addStreamTitle(String streamName)
    {
        sendValueToTextfield(streamtitle,streamName);
    }

}
