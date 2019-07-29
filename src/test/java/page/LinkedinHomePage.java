package page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.linkedin.com/home")
public class LinkedinHomePage extends PageObject {
    public LinkedinHomePage(WebDriver driver) {
        super(driver);
    }
}
