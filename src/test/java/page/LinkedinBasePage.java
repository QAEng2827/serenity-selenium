package page;

import org.openqa.selenium.WebDriver;

public class LinkedinBasePage {
    protected WebDriver driver;
//    public LinkedinBasePage(WebDriver driver) {
//
//        super(driver);
//    }

    protected String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
