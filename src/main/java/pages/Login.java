package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Env;
import util.Genericutil;
//import util.Env;

public class Login extends Genericutil {
    /**
     * Constructor for the Login class.
     */
    public Login() {
        super();
        /**
         *Initializes the page elements of the current class using PageFactory.
         *The WebDriver instance is retrieved from the driver() method
         */
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
    /**
     * Performs a valid login by opening the URL, entering the username and password,
     * clicking the login button using JavaScript, and waiting for the dashboard element to be visible.
     */
    public void Validlogin() {
        openUrl();
        sendValueToTextfield(username, Env.config.username());
        sendValueToTextfield(pass, Env.config.passowrd());
        Clickonjs(logInBtn);
        waitForElement(dashboard);
        //System.out.println(driver().getCurrentUrl());
        //Assert.assertTrue(driver().getCurrentUrl().contains("dashboard"));
    }
    /**
     * Performs Invalid login by opening the URL, entering the invalid username and invalidpassword,
     * clicking the login button using JavaScript
     */
    public void Invalidlogin(String userId, String password) {
        openUrl();
        sendValueToTextfield(username, userId);
        sendValueToTextfield(pass, password);
        Clickonjs(logInBtn);
        verifyText(errorMsg2,"Invalid credentials.");
    }
    /**
     * Performs Blank login by opening the URL, without entering any details
     * clicking the login button using JavaScriptclick
     */
    public void blanklogin() {
        JSClick(logInBtn);
    }
    /**
     *Clicks on the "Forgot Password" link using JavaScript.
     */
    public void clickonforgotpassword() {

        JSClick(flink);
    }
    /**
     *Enters the email address into the username text field.
     */
    public void link() {
        sendValueToTextfield(username, Env.config.emailid1());
    }
    /**
     *Clicks on the reset password link using JavaScript.
     */
    public void clickonresetlink() {

        JSClick(resetpassword);
    }
}


