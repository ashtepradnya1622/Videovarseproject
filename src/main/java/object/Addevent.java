package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Genericutil;
import util.Upload;

public class Addevent extends Genericutil {
    public Addevent() {
            super();
            PageFactory.initElements(driver(), this);
        }
    @FindBy(linkText = "Events")
    WebElement clickevent;
    @FindBy(xpath = "//a[text()='tennis (1)']")
    WebElement addcategory;
    @FindBy(xpath = "//button[@class='_buttonMain_199iz_1 _buttonTypePrimary_199iz_22  _button_y1kex_13 ']")
    WebElement addeventbutton;
    @FindBy(css = "input[placeholder='Name of the Event']")
    WebElement nameoftitle;
    @FindBy(xpath = "//div[@class='_uploadDiv_mt5l6_19']")
    WebElement uploadThumbnail;
    @FindBy(xpath = "textarea[placeholder='Type something here']")
    WebElement Dsecription;


    public void redirectEvents()
    {
        JSClick(clickevent);
    }
    public void selectcategory() {

        Clickonjs(addcategory);
    }
    public void Addevents()
    {
        Clickonjs(addeventbutton);
        //Genericutil.sleep(2000);
    }
    public void enterEventTitle(String eName)
    {
        sendValueToTextfield(nameoftitle,eName);
    }
    public void uploadthamb()
    {
    uploadThumbnail.click();
    Upload.file("C:\\Users\\Coditas\\Downloads\\Thumb.jpg");
    }
    public void description()
    {
        JSClick(Dsecription);
        sendValueToTextfield(Dsecription,"Tennis is international game ");
    }
}
