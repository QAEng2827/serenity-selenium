package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedinBasePage extends PageObject {
    protected WebDriver driver;
//    public LinkedinBasePage(WebDriver driver) {
//
//        super(driver);
//    }

    protected String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

//    protected WebElement waitUntilElementVisible (WebElement webElement, int timeOutInSec){
//        WebDriverWait wait = new WebDriverWait(driver, timeOutInSec);
//        return wait.until(ExpectedConditions.visibilityOf(webElement));
//    }
//
//
//    protected void assertElementIsVisible(WebElement webElement, int timeOutInSec , String message) {
//        try {
//            waitUntilElementVisible(webElement, timeOutInSec);
//        } catch (TimeoutException e) {
//            throw new AssertionError(message);
//        }
//    }


}
