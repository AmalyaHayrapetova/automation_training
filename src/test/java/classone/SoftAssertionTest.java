package classone;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author amalyahayrapetova
 */
public class SoftAssertionTest {
    private SoftAssert softAssert;

    @BeforeClass
    public void setUp() {
        softAssert = new SoftAssert();
        System.out.println("Open Chrome Browser");
    }

    /**
     * The SoftAssert class actually only has two methods: assertAll and doAssert.
     * We need to use assertAll every time for soft assert to work.
     * If assertAll is not used then our test will pass.
     * I’m going to run with assertAll then run with assertAll to show you the difference.
     */

    @Test
    public void signIn() {

        softAssert.assertEquals(true, false, "The user is not Signed In");
        System.out.println("3. Verify Sign In");

        softAssert.assertFalse(false, "The Admin Tab Is Not Displayed On The SignIn Page");
        System.out.println("4. Verify Admin Tab");

        softAssert.assertTrue(false, "The Dashboard Is Not Correct On The SignIn Page");
        System.out.println("5. Verify Dashboard");

        softAssert.assertAll();

    }

    /**
     * The SoftAssert class actually only has two methods: assertAll and doAssert.
     * We need to use assertAll every time for soft assert to work.
     * If assertAll is not used then our test will pass.
     * I’m going to run without assertAll then run with assertAll to show you the difference.
     */
    @Test
    public void testHomePageVerification() {
        softAssert.assertEquals(true, false, "The Welcome Link Is Not Correct On The Home Page");
        System.out.println("3. Verify Welcome Link");

        softAssert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
        System.out.println("4. Verify Admin Tab");

        softAssert.assertTrue(false, "The Dashboard Is Not Correct On The Home Page");
        System.out.println("5. Verify Dashboard");

    }

    @AfterClass
    public void tearDown() {
        System.out.println("Close Chrome Browser");
    }

}
