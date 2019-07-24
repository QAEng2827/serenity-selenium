import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LinkedinLoginTest extends BaseTest{
    @Test
    public void successfulLoginTest(){
        driver.navigate().to("https://www.linkedin.com/");

        //  написать сексессфул тест на вход, используя пейдж обжект(прочесть документацию)


    }
}
