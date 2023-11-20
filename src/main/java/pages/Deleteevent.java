package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Genericutil;
public class Deleteevent extends Genericutil {
    WebDriver driver;
    /**
     * Constructor for the deleteevent
     */
    public Deleteevent() {
        super();
        PageFactory.initElements(driver(), this);
    }
    @FindBy(xpath = "//div[@class='InovuaReactDataGrid__row InovuaReactDataGrid__row--direction-ltr InovuaReactDataGrid__row--no-zebra InovuaReactDataGrid__row--no-locked-start InovuaReactDataGrid__row--no-locked-end InovuaReactDataGrid__row--show-horizontal-borders InovuaReactDataGrid__row--rowheight InovuaReactDataGrid__row--last']//span[contains(@class,'_notDisableView_o5s6f_8')]")
    WebElement Deleteeventdot;
    @FindBy(xpath = "(//div[contains(@class,'_kebabMenuItems_o5s6f_23 _menuEnabled_o5s6f_29')])[3]")
    WebElement Deleteeventbutton;
    @FindBy(xpath = "//button[@class='_buttonMain_199iz_1 _buttonTypeSecondary_199iz_27  undefined ']")
    WebElement Cancel;
    /**
     * clicks on kababamenu/three dots
     */
    public void deleteDot(){
        waitAndClick(Deleteeventdot);
    }
    /**
     * clicks on deletebutton
     */
    public void deleteButton() {
        waitAndClick(Deleteeventbutton);
    }
    /**
     * clicks on cancelebutton
     */
    public void deleteCancel() {
        waitAndClick(Cancel);
    }
}
