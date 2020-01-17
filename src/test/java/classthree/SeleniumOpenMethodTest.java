package classthree;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumOpenMethodTest {

    private WebDriver driver;


    @Test
    public void openPageWithMaximizedWind() {
        /**
         * Inside of here, Selenium WebDriver is going to need to know where is that executable file that you have,
         * because I need it in order to run. We do this using a System.setProperty() and we give this the name of the property.
         * And this property that Selenium will look for is called webdriver.chrome.driver,
         * and it must be specified exactly like this because this is what Selenium will look for. This is like a key.
         */
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverMac");

        //init chrome driver
        driver = new ChromeDriver();

        //1 - maximize window
        driver.manage().window().maximize();

        /*
        //2 - full screen mode
        driver.manage().window().fullscreen();
         */

        /*
        //3 - Specific width (show Chrome iPhoneX emulator)
        Dimension size = new Dimension(375, 812);
        driver.manage().window().setSize(size);

         */

        //open url
        driver.get("https://the-internet.herokuapp.com/");

        //print page title
        System.out.println(driver.getTitle());

        //close(quite) driver
        driver.quit();
        System.out.println("hello");
        System.out.println("world");


    }


    @Test
    public void openPageAsMobileWind() {
        /**
         * Inside of here, Selenium WebDriver is going to need to know where is that executable file that you have,
         * because I need it in order to run. We do this using a System.setProperty() and we give this the name of the property.
         * And this property that Selenium will look for is called webdriver.chrome.driver,
         * and it must be specified exactly like this because this is what Selenium will look for. This is like a key.
         */
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverMac");

        //init chrome driver
        driver = new ChromeDriver();


        //3 - Specific width (show Chrome iPhoneX emulator)
        Dimension size = new Dimension(375, 812);
        driver.manage().window().setSize(size);

        //open url
        driver.get("https://the-internet.herokuapp.com/");

        //print page title
        System.out.println(driver.getTitle());

        //close(quite) driver
        driver.quit();
        System.out.println("helllo");

    }


    @Test
    public void openPageAsFullScreen() {
        /**
         * Inside of here, Selenium WebDriver is going to need to know where is that executable file that you have,
         * because I need it in order to run. We do this using a System.setProperty() and we give this the name of the property.
         * And this property that Selenium will look for is called webdriver.chrome.driver,
         * and it must be specified exactly like this because this is what Selenium will look for. This is like a key.
         */
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverMac");

        //init chrome driver
        driver = new ChromeDriver();


        //2 - full screen mode
        driver.manage().window().fullscreen();


        //open url
        driver.get("https://the-internet.herokuapp.com/");

        //print page title
        System.out.println(driver.getTitle());

        //close(quite) driver
        driver.quit();

    }


}
