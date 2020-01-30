import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * In this class we will implement our main methods
 */
public class BasePage {
    private WebDriver driver;


    /**
     * Constructor of the class
     * @param driver
     */
    public BasePage(WebDriver driver){
        this.driver = driver;
    }


    /**
     * Click on the element
     * @param by
     */
    public void click(By by){

        driver.findElement(by).click();
    }

    /**
     * Check if element displayed
     * @param by
     * @return
     */
    public boolean isElementDisplayed(By by){
        return driver.findElement(by).isDisplayed();
    }


    /**
     * Type the given text
     */
    public void type(By by,String text){
        driver.findElement(by).sendKeys(text);
    }






}
