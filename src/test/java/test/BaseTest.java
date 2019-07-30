package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import step.UserSteps;


public class BaseTest {
    @Steps
    protected UserSteps user;

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Before
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }

//    @After
//    public void downDriver(){WebDriverManager.chromedriver().clearCache();}

}
