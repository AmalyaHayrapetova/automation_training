package classthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumFindElementTest {

    private WebDriver driver;

    @Test
    public void clickOnElement() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverWin.exe");

        //init chrome driver
        driver = new ChromeDriver();

        //1 - maximize window
        driver.manage().window().maximize();


        //open url
        driver.get("https://the-internet.herokuapp.com/");

        //find element by link text and get its text

        String linkText = driver.findElement(By.linkText("Digest Authentication")).getText();
        System.out.println("The elements text is: " + linkText);

        /*
        //exception while fining element
        String exceptionText = driver.findElement(By.linkText("Automation")).getText();
        System.out.println("The elements text is: " + exceptionText);
        */


        //find elements and get its size
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("The list size with \"a\" tag name is: " + list.size());


        //close(quite) driver
        //driver.quit();


    }


}
