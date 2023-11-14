package object;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.Genericutil;
import util.Upload;

import java.util.Random;

public class Addevent extends Genericutil {
    /**
     * Constructor for the Addevent
     */
    public Addevent() {
            super();
            PageFactory.initElements(driver(), this);
        }
    @FindBy(linkText = "Events")
    WebElement clickevent;
    @FindBy(xpath = "//a[contains(.,'tennis (4)')]")
    //@FindBy(xpath = "//a[text()='tennis (1)']")
    WebElement addcategory;
    @FindBy(xpath = "//button[@class='_buttonMain_199iz_1 _buttonTypePrimary_199iz_22  _button_y1kex_13 ']")
    WebElement addeventbutton;
    @FindBy(css = "input[placeholder='Name of the Event']")
    WebElement nameoftitle;
    @FindBy(xpath = "//div[@class='_uploadDiv_mt5l6_19']")
    WebElement uploadThumbnail;
    @FindBy(xpath = "textarea[placeholder='Type something here']")
    WebElement Dsecription;
    @FindBy(xpath = "//input[@placeholder='Enter name of organizer']")
    WebElement eventorgnize;
    //@FindBy(xpath = "//div[@class=' css-1jqq78o-placeholder']")
    @FindBy(css = "[id=react-select-2-input]")
    WebElement Dropdown;

    @FindBy(css = "[id=\"react-select-2-input\"]")
    WebElement eventType;

    @FindBy(xpath = "//div[@title=\"National\"]")
    WebElement dropDwnNational;

    @FindBy(xpath = "//div[@title=\"International\"]")
    WebElement dropDwnInternational;
    @FindBy(xpath = "(//div[@class='react-datepicker__input-container ']/input)[1]")
    WebElement evntStartDate;
    @FindBy(xpath = "//button[@aria-label='Previous Month']")
    WebElement previousMonthBtn;
    @FindBy(xpath = "//button[@aria-label='Next Month']")
    WebElement nextMonthBtn;
    @FindBy(xpath = "(//div[@class='react-datepicker__input-container ']/input)[2]")
    WebElement evntEndDate;
    @FindBy(xpath = "//button[normalize-space()='Create']")
    WebElement Submit;


// @FindBy(xpath = "//div[@class=' css-16ji5os']")
// WebElement selectdropdown;
    public void redirectEvents()
    {
        JSClick(clickevent);
    }
    public void selectcategory() {

       addcategory.click();
    }
    public void Addevents()
    {
        JSClick(addeventbutton);

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
//    public void description()
//    {
//        JSClick(Dsecription);
//        sendValueToTextfield(Dsecription,"Tennis is international game ");
//    }
    /**Initiates the event organizer field by clicking using JavaScript
     * and then enters the provided organizer name.
     * @param Oname The name of the event organizer to be entered.
     */
    public void Eventorgnizer(String Oname)
    {
        JSClick(eventorgnize);
        sendValueToTextfield(eventorgnize,Oname);
    }
    /**Clicks on the dropdown using JavaScript
     *pressing the "Enter" key to select the value
     */
    public void dropdown()
    {
        Genericutil.sleep(3000);
        waitAndClick(Dropdown);
        sendValueToTextfield(Dropdown,"National");
        Dropdown.sendKeys(Keys.ENTER);
    }


    public void eventType()
    {
        JSClick(eventType);
        Random random = new Random();
        int num = random.nextInt(100);
        if(num<50)
        {
            sendValueToTextfield(eventType,"International");
            JSClick(dropDwnInternational);
        }
        else
        {
            sendValueToTextfield(eventType,"National");
            JSClick(dropDwnNational);
        }
    }
//    public void Dropdown(int option){
//        String dropdownLocater = "\"[id=\\\"react-select-2-input\\\"] and text()='%option']";
//        dropdownLocater = dropdownLocater.replace("%option",Integer.toString(option));
//        JSClick(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdownLocater))));
//    }
    /**
     *Clicks on the button to navigate to the previous month in a date picker or calendar.
     */
    public void previousMonth()
    {
        JSClick(previousMonthBtn);
    }
    /**
     * Clicks on the button to navigate to the next month in a date picker or calendar.
     */
    public void nextMonth()
    {JSClick(nextMonthBtn);
    }
    /**
     * Sets the event start date by clicking on the event start date element
     * and selecting the specified date using JavaScript.
     * @param sDate The day of the month for the event start date.
     */
    public void eventStartDate(Integer sDate)
    {
        JSClick(evntStartDate);
        previousMonth();
        selectDate(sDate);
    }
    /**
     * @param date The day of the month to be selected.
     * The method constructs an XPath for the date, waits for the element to be visible,
     * and performs a JavaScript click on the element.
     */
    public void selectDate(int date){
        String dateLocater = "//div[contains(@class,'react-datepicker__day') and text()='%date']";
        dateLocater = dateLocater.replace("%date",Integer.toString(date));
        JSClick(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dateLocater))));
    }
    /**
     * Sets the event end date by clicking on the event end date element
     * and selecting the specified date using JavaScript.
     * @param eDate The day of the month for the event end date.
     */
    public void eventEndDate(Integer eDate)
    {
        JSClick(evntEndDate);
        nextMonth();
        selectDate(eDate);
    }
    public void clickCreateBtn(){
        Genericutil.sleep(2000);
        scrollTO(Submit);
        JSClick(Submit);
    }
}
