package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import step.UserSteps;

import java.net.MalformedURLException;
import java.net.URI;

public class BaseTest {

    @Steps
    protected UserSteps user;

    //@Managed(uniqueSession = true)
    //private WebDriver webdriver;

    @Before
    public void setupDriver() throws MalformedURLException {
        //WebDriverManager.chromedriver().setup();
        /*DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("76.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        driver = new RemoteWebDriver(
                URI.create("http://34.220.181.94:4444/wd/hub").toURL(),
                capabilities
        );*/
    }
}
