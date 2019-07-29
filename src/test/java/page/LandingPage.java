package page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.BaseTest;

@DefaultUrl("https://www.linkedin.com/")
public class LandingPage extends PageObject {
    protected LinkedinBasePage linkedinBasePage;

    @FindBy(xpath = "//div/input[@name = 'session_key']")
    private WebElement userEmailField;

    @FindBy(xpath = "//div/input[@name = 'session_password']" )
    private WebElement userPasswordField;

    @FindBy(xpath = "//div/button[@class = 'sign-in-form__submit-btn']" )
    private WebElement signInButton;

    @FindBy(xpath = "//div/a[@class = 'sign-in-form__forgot-password']" )
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//li-icon[@class='nav__logo lazy-loaded']")
    protected WebElement lazyLoadLogo;

    @FindBy(xpath = "//a[@class='nav__button-secondary']")
    protected WebElement secondarySingInButton;



    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public boolean lazyLogoIsDisplayed(){
        System.out.println( "The lazi logo text is: " + lazyLoadLogo.getClass());
        return lazyLoadLogo.isDisplayed();

    }
    public boolean userEmailFieldIsDisplayed(){
        System.out.println( "The userEmailField  text is: " + userEmailField.getText());
        return userEmailField.isDisplayed();

    }

    public boolean userPasswordFieldIsDisplayed(){
        System.out.println( "The userPasswordField  text is: " + userPasswordField.getText());
        return userPasswordField.isDisplayed();

    }

    public boolean forgotPasswordLinkIsDisplayed(){
        System.out.println( "The userPasswordField  text is: " + forgotPasswordLink.getText());
        return forgotPasswordLink.isDisplayed();

    }

    public boolean secondaryLoginButtonIsEnabled(){
        System.out.println( "Yes!");
        return secondarySingInButton.isEnabled();

    }

    public <T> T login(String userEmail, String userPassword){

        userEmailField.sendKeys(userEmail);
        userPasswordField.sendKeys(userPassword);
        System.out.println("Credentials are inputed");
        Timeout.seconds(5);
        signInButton.click();
        Timeout.seconds(25);

//        if (linkedinBasePage.getCurrentUrl().contains("/feed")){
//            return (T) new LinkedinHomePage();
//        }
////        if (linkedinBasePage.getCurrentUrl().contains("/login-submit")){
////            return (T) new LinkedInSubmitPage(driver);
////        }
////
//        else {
            return (T) this; //PageFactory.initElements(driver,LinkedInLoginPage.class); - тоже рабочий вариант
//        }

    }
}
