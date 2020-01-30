import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {

    /**
     * Constructor of the class
     *
     * @param driver
     */
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    private final By EMAIL_FIELD = By.id("some field");


    public void typeEmail(){
        type(EMAIL_FIELD,"test@gmail.com");
    }
}
