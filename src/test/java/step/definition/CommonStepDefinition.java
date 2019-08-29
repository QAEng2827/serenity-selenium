package step.definition;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import step.UserSteps;

public class CommonStepDefinition {

    @Steps
    private UserSteps userSteps;

    @Given("I open Landing page")
    public void openLandingPage() {
        userSteps.openLandingPage();
    }

    @When("I click on '$buttonText' button")
    public void givenIClickOnButton(String buttonText) {
        userSteps.clickOnButton(buttonText);
    }

    @When("I sign In as '$userEmail' , '$userPassword'")
    public void whenISignInAs(String userEmail, String userPassword) {
        userSteps.login(userEmail, userPassword);
    }

    @Then("I should be on Home page")
    public void thenIShouldBeOnHomePage() {
        Assert.assertTrue("Home page is not loaded.", userSteps.isHomePageLoaded());
    }

    @Then("I should be on Login page")
    public void thenIShouldBeOnLoginPage() {
        Assert.assertTrue("Home page is not loaded.", userSteps.isLoginPageLoaded());
    }
}
