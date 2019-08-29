package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static java.lang.Thread.sleep;

@RunWith(SerenityRunner.class)
public class LinkedinLoginTest extends BaseTest {

    @Test
    public void successfulLoginTest() throws InterruptedException {
        user.openLandingPage();
    }
}
