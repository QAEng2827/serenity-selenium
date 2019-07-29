import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.Iterator;

public class BrowserStackSerenityDriver implements DriverSource {

    public WebDriver newDriver() {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

        String username = System.getenv("BROWSERSTACK_USERNAME");
        if(username == null) {
            username = (String) environmentVariables.getProperty("browserstack.user");
        }

        String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
        if(accessKey == null) {
            accessKey = (String) environmentVariables.getProperty("browserstack.key");
        }

        String environment = System.getProperty("environment");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        Iterator it = environmentVariables.getKeys().iterator();
        while(it.hasNext()){
            String key = (String) it.next();

            if(key.equals("browserstack.user") || key.equals("browserstack.key") || key.equals("browserstack.server")){
                continue;
            }
            else if(key.startsWith("browserstack.")){
                capabilities.setCapability(key.replace("browserstack.", ""), environmentVariables.getProperty(key));
                if(key.equals("browserstack.local")){
                    System.setProperty("browserstack.local", "true");
                }
            }
            else if(environment != null && key.startsWith("environment." + environment)){
                capabilities.setCapability(key.replace("environment." + environment + ".", ""), environmentVariables.getProperty(key));
                if(key.equals("environment." + environment + ".browserstack.local")){
                    System.setProperty("browserstack.local", "true");
                }
            }
        }

        try {
            return new RemoteWebDriver(new URL("http://"+username+":"+accessKey+"@"+environmentVariables.getProperty("browserstack.server")+"/wd/hub"), capabilities);
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public boolean takesScreenshots() {
        return true;
    }
}
