package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;


    @At("https://www.linkedin.com/checkpoint/lg/login-submit")
    public class CheckpointPage extends PageObject {


        public CheckpointPage(WebDriver driver) {
            super(driver);
                }

        @FindBy(xpath = "//div[@id='error-for-password']")
        private WebElement errorForPassword;

        @WhenPageOpens
        public void waitUntilTitleAppears() {
            element(errorForPassword).waitUntilVisible();
        }

        public boolean isPageLoaded() {
            return getPages().isCurrentPageAt(page.CheckpointPage.class);
        }

    }

