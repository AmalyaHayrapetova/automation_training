import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverWin.exe");
        //init chrome driver
        driver=new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //open url

    }
    @BeforeMethod
    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/");
        //click on Form Authentication Button
        driver.findElement(By.cssSelector("a[href=\"/login\"]")).click();
    }
    @Test
    public void isOpenPage(){
        //is Present SignIn Button
        Assert.assertTrue(driver.findElement(By.cssSelector("button i[class=\"fa fa-2x fa-sign-in\"]")).isDisplayed());
    }
    @Test
    public void signIn(){
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button i[class=\"fa fa-2x fa-sign-in\"]")).click();
        //is Present LogOut Button
        Assert.assertTrue(driver.findElement(By.cssSelector("a[href=\"/logout\"]")).isDisplayed());
    }
    @Test
    public void signInWithWrongUsername(){
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("xxxxxxxx");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button i[class=\"fa fa-2x fa-sign-in\"]")).click();
        //is Present Error Message
        Assert.assertTrue(driver.findElement(By.cssSelector("div[data-alert]")).isDisplayed());
    }
    @Test
    public void signInWithWrongPassword(){
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("xxxxxxxx");
        driver.findElement(By.cssSelector("button i[class=\"fa fa-2x fa-sign-in\"]")).click();
        //is Present Error Message
        Assert.assertTrue(driver.findElement(By.cssSelector("div[data-alert]")).isDisplayed());
    }
    @Test
    public void signInWithMissingUsername(){
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button i[class=\"fa fa-2x fa-sign-in\"]")).click();
        //is Present Error Message
        Assert.assertTrue(driver.findElement(By.cssSelector("div[data-alert]")).isDisplayed());
    }
    @Test
    public void signInWithMissingPassword(){
        driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("");
        driver.findElement(By.cssSelector("button i[class=\"fa fa-2x fa-sign-in\"]")).click();
        //is Present Error Message
        Assert.assertTrue(driver.findElement(By.cssSelector("div[data-alert]")).isDisplayed());
    }
    @AfterClass
    public void tearDown(){
        //down the web driver instance
        driver.quit();
    }
}
