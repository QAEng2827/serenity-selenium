package step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import page.LandingPage;

public class UserSteps extends ScenarioSteps {
    LandingPage landingPage;

    @Step
    public void openLandingPage(){
    landingPage.open();
    }

    @Step
    public void checkWelcomeTitle() {
        Assert.assertTrue(getDriver()
                .getTitle()
                .contains("LinkedIn"));
    }

    @Step
    public void checkElementsLandingPage() {
        Assert.assertTrue(getDriver()
                .getTitle()
                .contains("LinkedIn"));
        System.out.println("Yo-ho!");
        Assert.assertTrue(landingPage.lazyLogoIsDisplayed());
        System.out.println("Yo-ho! Yo-ho!");
        Assert.assertTrue(landingPage.secondaryLoginButtonIsEnabled());
        System.out.println("Yo-ho! Yo-ho! Go to next level!");
        Assert.assertTrue(landingPage.userEmailFieldIsDisplayed());
        System.out.println("Yo-ho! Yo-ho! Go to next level!");
    }

    @Step
    public void setCridentials(String userEmail, String userPassword){
               System.out.println("Just a moment please");
               landingPage.login(userEmail,userPassword);


    }
}
