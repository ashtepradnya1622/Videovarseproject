package object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Genericutil;

import java.util.List;

public class Editevent extends Genericutil {
    WebDriver driver;

    public Editevent() {
        super();
        PageFactory.initElements(driver(), this);
    }
    @FindBy(css = "._formContainer_mt5l6_8")
    WebElement formEditEvent;
    @FindBy(xpath = "(//div[contains(@class,'InovuaReactDataGrid__cell__content')])[5]")
    WebElement editBtn;
    @FindBy(xpath = "(//div[contains(@class,'_kebabMenuItems_o5s6f_23 _menuEnabled_o5s6f_29')])[2]")
    WebElement editEventText;
    @FindBy(xpath = "//input[@placeholder='Name of the Event']")
    WebElement editEventTitle;
    @FindBy(xpath = "//textarea[@placeholder='Type something here']")
    WebElement editDescription;
    @FindBy(xpath = "//input[@placeholder='Enter name of organizer']")
    WebElement editEventOrganizer;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveBtn;
    @FindBy(css = "input[placeholder='Search']")
    WebElement search;
    @FindBy(xpath = "//div[@class='_mainElement_1af1c_49']//a")
    List<WebElement> listOfCategories;
    @FindBy(xpath = "button[type='submit']")
    WebElement submit;

    /**
     * clicks on editeventbutton
     */
    public void clickEditEventBtn() {
        Genericutil.sleep(2000);
        waitAndClick(editBtn);
    }

    /**
     * Perform a search operation by clicking on the search element.
     */
    public void searchBox(String ename) {
        Clickonjs(search);
        sendValueToTextfield(search, ename);
        search.sendKeys(Keys.ENTER);
    }

    /**
     * clicks on editeventtext
     */
    public void editEventText() {
        Genericutil.sleep(2000);
        waitAndClick(editEventText);
    }

    /**
     * Clear the existing value in the eventtitle field and enter new value.
     */
    public void editEventTitle(String eTitle) {
        editEventTitle.clear();
        sendValueToTextfield(editEventTitle, eTitle);
    }

    /**
     * Clear the existing value in the event organizer field and enter new value
     */
    public void editOrganizer(String orgName) {
        editEventOrganizer.clear();
        sendValueToTextfield(editEventOrganizer, orgName);
    }
    /**
     * click using javascript
     */
    public void clickSaveBtn() {
        Genericutil.sleep(2000);
        scrollTO(saveBtn);
        JSClick(saveBtn);
    }
}

