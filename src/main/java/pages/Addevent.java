package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.Env;
import util.Genericutil;
import util.Upload;

import java.util.List;
import java.util.Random;

public class Addevent extends Genericutil {
    WebDriver driver;
    /**
     * Constructor for the Addevent
     */
    public Addevent() {
        super();
        PageFactory.initElements(driver(), this);
    }
    @FindBy(linkText = "Events")
    WebElement clickevent;
    @FindBy(xpath = "//a[contains(.,'tennis (5)')]")
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
    @FindBy(css = "[id=react-select-2-input]")
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
    @FindBy(xpath = "//div[@class='_mainElement_1af1c_49']//a")
    List<WebElement> listOfCategories;
    public void redirectEvents() {
        JSClick(clickevent);
    }
    public void selectCategory1(String cname) {
        for (int i = 0; i < listOfCategories.size(); i++) {
            String[] name = listOfCategories.get(i).getText().split(" ");
            String formattedName = name[0].trim();
            if (cname.equalsIgnoreCase(formattedName)) {
                waitAndClick(listOfCategories.get(i));
            }
        }
    }
    public void Addevents() {
        JSClick(addeventbutton);
    }
    public void enterEventTitle(String eName) {
        sendValueToTextfield(nameoftitle,eName);
    }
    public void uploadThamb() {
        uploadThumbnail.click();
        Upload.file("C:\\Users\\Coditas\\Downloads\\Thumb.jpg");
    }
    /**Initiates the event organizer field by clicking using JavaScript
     * and then enters the provided organizer name.
     * @param Oname The name of the event organizer to be entered.
     */
    public void eventOrgnizer(String Oname) {
        JSClick(eventorgnize);
        sendValueToTextfield(eventorgnize,Oname);
    }
    /**
     *Create a new Random object&Generate a random integer between 0 (inclusive) and 100 (exclusive) and store it in the variable 'num'.
     */
      public void Dropdown(String stype) {
        waitAndClick(eventType);
        eventtypedropdown(stype);
    }
    public void eventtypedropdown(String option){
        WebElement optionElement1 = null;
        switch (option){
            case "National":
                optionElement1 =dropDwnNational ;
                break;
            case "International":
            default:
                optionElement1 = dropDwnInternational ;
        }
        JSClick(wait.until(ExpectedConditions.visibilityOf(optionElement1)));
    }
    /**
     *Clicks on the button to navigate to the previous month in a date picker or calendar.
     */
    public void previousMonth() {
        JSClick(previousMonthBtn);
    }
    /**
     * Clicks on the button to navigate to the next month in a date picker or calendar.
     */
    public void nextMonth() {
        JSClick(nextMonthBtn);
    }
    /**
     * Sets the event start date by clicking on the event start date element
     * and selecting the specified date using JavaScript.
     * @param sDate The day of the month for the event start date.
     */
    public void eventStartDate(Integer sDate) {
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