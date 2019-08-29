package step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import page.HomePage;
import page.LandingPage;
import page.LoginPage;

public class UserSteps extends ScenarioSteps {

    LandingPage landingPage;
    LoginPage loginPage;
    HomePage homePage;

    @Step
    public void openLandingPage() {
        landingPage.open();
    }

    @Step
    public void clickOnButton(String buttonText) {
        landingPage.clickOnButtonWithText(buttonText);
    }

    @Step
    public void login(String userEmail, String userPassword) {
        loginPage.login(userEmail, userPassword);
    }

    @Step
    public boolean isHomePageLoaded() {
        return homePage.isPageLoaded();
    }

    @Step
    public boolean isLoginPageLoaded() {
        return loginPage.isPageLoaded();
    }
}
