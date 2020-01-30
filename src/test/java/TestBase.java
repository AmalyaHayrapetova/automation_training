import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * This class will be the base of our test classes.
 * Here we will setUp chrome driver with its configurations
 */
public class TestBase {

    /**
     * Declare WebDriver as global variable
     */
    public WebDriver driver;



    @BeforeClass
    public void setUpDriver(){

        System.setProperty("webdriver.chrome.driver",AutomationPaths.CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
        //will open browser maximized
        driver.manage().window().maximize();
        //will wait up to 10 seconds while finding elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }




}
