package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Genericutil;
public class Editstream extends Genericutil {
    WebDriver driver;
    /**
     * Constructor for the Addevent
     */
    public Editstream() {
        super();
        PageFactory.initElements(driver(), this);
    }
    @FindBy(css = "input[placeholder='Search']")
    WebElement streamSearch;
    @FindBy(xpath = "(//div[contains(@class,'InovuaReactDataGrid__cell__content')])[5]")
    WebElement threedots ;
    @FindBy(xpath = "//div[contains(@class,'_kebabMenuContainer_o5s6f_16')]//div[2]")
    WebElement editstreambutton ;
    @FindBy(css = "input[placeholder='Enter stream title']")
    WebElement streamTitle ;
    @FindBy(xpath = "//p[@class='_gridEllipsis_1afhi_95']")
    WebElement selectStream ;
    /**
     * Click on the stream search and enter the value
     */
    public void streamSearch(String ssearch){
       waitAndClick(streamSearch);
       Genericutil.sleep(2000);
        sendValueToTextfield(streamSearch,"streamfour");
        streamSearch.sendKeys(Keys.ENTER);
    }
    /**
     * Click on the streamname
     */
    public void selectstreamName(){
        waitAndClick(selectStream);
    }
    public void threeDots(){
        threedots.click();
    }
    /**
     * Click on the editstreambutton
     */
    public void editStreambutton(){
        editstreambutton.click();
    }
    /**
     * Click on the stream title  and enter the value
     */
    public void streamTitle(String stname) {
        waitAndClick(streamTitle);
        streamTitle.clear();
        sendValueToTextfield(editstreambutton ,stname);
    }
}
