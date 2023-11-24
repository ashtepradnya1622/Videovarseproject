package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Genericutil;
public class Highlight extends Genericutil {
    WebDriver driver;

    /**
     * Constructor for the Addevent
     */
    public Highlight() {
        super();
        PageFactory.initElements(driver(), this);
        this.driver= driver();
    }
    @FindBy(xpath = "(//input[@type='checkbox']/parent::div)[1]")
    WebElement clip1;
    @FindBy(xpath = "(//input[@type='checkbox']/parent::div)[2]")
    WebElement clip2;
    @FindBy(xpath = "(//input[@type='checkbox']/parent::div)[3]")
    WebElement clip3;
    @FindBy(xpath = "//button[@class='_buttonMain_199iz_1 _buttonTypePrimary_199iz_22  _buttonStyle_w89gy_64 ']")
    WebElement upArrow;
    @FindBy(xpath = "(//div[@class='_openMenuItem_96255_5'])[1]")
    WebElement highLight;
    @FindBy(css = "input[placeholder='Enter title']")
    WebElement htitle;
    @FindBy(css = "textarea[placeholder='Enter video description']")
    WebElement hdescription;
    @FindBy(xpath = "(//button[contains(@class,'undefined')])[2]")
    WebElement saveasDraft;
    @FindBy(xpath = "//button[@class='_buttonMain_199iz_1 _buttonTypePrimary_199iz_22  _arrowButton_2vkpv_7 ']")
    WebElement nexticon;
    @FindBy(xpath = "(//div[contains(@class,'_tileContainer_1k2ky_1')])[1]")
    WebElement dragdrop1;
    @FindBy(xpath = "(//div[contains(@class,'_tileContainer_1k2ky_1')])[2]")
    WebElement dragdrop2;
    @FindBy(xpath = "//div[text()='Preview']")
   WebElement previewButton;
    @FindBy(xpath = "//div[@class='_mainWrapper_qv7pu_1']")
    WebElement previewtype;
    @FindBy(xpath = "//div[@class='_aspectRatioLabelWrapper_qv7pu_9 _selectedAspectRatio_qv7pu_22']")
    WebElement frame;
//    @FindBy(xpath = "//div[@class='_mainContainer_13j8h_1 ']")
//    WebElement dragdrop1;
    /**
     * click on uparrow
     */
    public void upArrow() {
        waitAndClick(upArrow);
    }
    /**
     * click on highlight button
     */
    public void highLight() {
        waitAndClick(highLight);
    }
    public void clipOne() {
        clip1.click();
    }
    public void clipTwo() {
        click(clip2);
    }
    public void clipThree() {
        click(clip3);
    }
    /**
     * Click on the htitle element and send the value
     */
    public void htitle(String title) {
        waitAndClick(htitle);
        sendValueToTextfield(htitle, title);
    }
    /**
     * *Click on the hdescription and send the value
     */
    public void hdescription(String hdesc) {
        waitAndClick(hdescription);
        sendValueToTextfield(hdescription, hdesc);
    }
    public void saveDraft(){
        waitAndClick(saveasDraft);
    }
    /**
     * click on preview button
     */
    public void previewButton(){
        JSClick(previewButton);
    }
    /**
     * Click on the nexticon
     */
    public void nextIcon(){
        waitAndClick(nexticon);
    }
    public void frame(){
        waitAndClick(frame);
    }
    /**
     * Drag and drop operation using Action Class
     */
    public void dragAndDrop() {
        WebElement dragdrop1 = driver.findElement(By.xpath("//p[text()='clip2']"));
        WebElement dragdrop2 = driver.findElement(By.xpath("//p[text()='Clipone']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragdrop1, dragdrop2).build().perform();
        }
        public void frameType(){
        JSClick(frame);
        }
}

