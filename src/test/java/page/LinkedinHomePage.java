package page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.linkedin.com/home")
public class LinkedinHomePage extends PageObject {
    public LinkedinHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@id='profile-nav-item']" )
    private WebElement profileNavItem;
}
