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
    @FindBy(xpath = "(//p[normalize-space()='Saniatenis'])[1]")
    WebElement Clickstream;
    @FindBy(xpath = "//button[@class='_buttonMain_199iz_1 _buttonTypePrimary_199iz_22  _button_15w0k_29 ']")
    WebElement addstream;
    @FindBy(xpath = "input[placeholder='Enter stream title']")
    WebElement streamtitle;
    /**
     * Clicks on stream
     */
    public void streamClick() {
        JSClick(Clickstream);
    }
    /**
     *clicks on addstream button
     */
    public void addStreamButton() {
        waitAndClick(addstream);
    }
    /**
     * Enter the streamname
     */
    public void addStreamTitle(String streamName) {
        sendValueToTextfield(streamtitle,streamName);
    }

}
