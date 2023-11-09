package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import util.Env;
import util.Genericutil;
//import util.Env;

public class Login extends Genericutil {
    public Login() {
        super();
        PageFactory.initElements(driver(), this);
    }
    @FindBy(css = "input[placeholder='Enter email ID']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Enter password']")
    WebElement pass;
    @FindBy(xpath = "//button[normalize-space()='Log In']")
    WebElement logInBtn;
    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement dashboard;

//    @FindBy(xpath = "//a[normalize-space()='Events']")
//    WebElement events;
    @FindBy(css = "a[class='active']")
    WebElement clickevent;
    @FindBy(xpath = "//p[normalize-space()='Invalid credentials.']")
    WebElement errorMsg2;
    @FindBy(xpath = "//div[@class='_forgotPasswordText_pexu6_72']")
    WebElement flink;
    @FindBy(css = "button[type='submit']")
    WebElement resetpassword;
    @FindBy(xpath = "//p[contains(@class,'false')]")
    WebElement blankerrormsg;
    public void openUrl() {
        driver().get(Env.config.url());
    }
    public void Validlogin() {
        openUrl();
        sendValueToTextfield(username, Env.config.username());
        sendValueToTextfield(pass, Env.config.passowrd());
        Clickonjs(logInBtn);
        waitForElement(dashboard);
        System.out.println(driver().getCurrentUrl());
        Assert.assertTrue(driver().getCurrentUrl().contains("dashboard"));
    }
    public void Invalidlogin(String userId, String password) {
        openUrl();
        sendValueToTextfield(username, userId);
        sendValueToTextfield(pass, password);
        Clickonjs(logInBtn);
        System.out.println(errorMsg2.getText());
    }
    public void blanklogin() {
       JSClick(logInBtn);
    }
    public void clickonforgotpassword() {
        JSClick(flink);
    }
    public void link() {
        sendValueToTextfield(username, Env.config.emailid1());
    }
    public void clickonresetlink() {
        JSClick(resetpassword);
    }
}





