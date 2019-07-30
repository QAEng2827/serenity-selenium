package test;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class LinkedinLoginTest extends BaseTest{

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                //  {userLogin,  userPassword},
                {"qaeng2728@gmail.com", "chertopoloh2827"},
                {"QAEng2728@gmail.com", "chertopoloh2827"},

        });
    }

    private String userLogin;
private String userPassvord;

    public LinkedinLoginTest(String userLogin, String userPassvord) {
        this.userLogin = userLogin;
        this.userPassvord = userPassvord;
    }

    @Test
    public void successfulLoginTest(){
        user.openLandingPage();
       // user.checkWelcomeTitle();
        user.checkElementsLandingPage();
        user.setCridentials(userLogin, userPassvord);

    }
}
