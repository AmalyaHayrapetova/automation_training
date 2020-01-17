package classtwo;

import org.testng.annotations.Test;

/**
 * @author amalyahayrapetova
 */

public class DependsOnMethodsTest {


    @Test
    public void setUpChrome() {
        System.out.println("1. Set Up Chrome");
    }

    /**
     * This test will be run after setUpChrome test
     */
    @Test(dependsOnMethods = "setUpChrome")
    public void openPage() {
        System.out.println("2. Open OrangeHRM");
    }


    @Test
    public void closeBrowser() {
        System.out.println("Browser is closed");
    }


}
