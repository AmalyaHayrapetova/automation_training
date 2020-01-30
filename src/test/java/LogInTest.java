import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {

    private LogInPage loginPage;

    @BeforeClass
    public void setUpPages(){
        loginPage = new LogInPage(driver);
    }


    @Test
    public void checkEmailField(){
        //todo some code
        Assert.assertTrue(true,"Email field is missing");
    }
}
