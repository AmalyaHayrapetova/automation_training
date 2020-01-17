package classone;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author amalyahayrapetova
 */
public class HardAssertionTest {

    @BeforeClass
    public void setUp() {
        System.out.println("Open Chrome Browser");
    }

    @Test
    public void signIn() {

        Assert.assertEquals(true, false, "The user is not Signed In");
        System.out.println("3. Verify Sign In");

        Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The SignIn Page");
        System.out.println("4. Verify Admin Tab");

        Assert.assertTrue(false, "The Dashboard Is Not Correct On The SignIn Page");
        System.out.println("5. Verify Dashboard");

    }

    /**
     * The first parameter represents the actual value. The second parameter represents the expected value
     * The third parameter is a String and it represents the message that will show up only in the event of an assertion failure
     */
    @Test
    public void testHomePageVerification() {
        Assert.assertEquals(true, true, "The Welcome Link Is Not Correct On The Home Page");

        Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");

        Assert.assertTrue(true, "The Dashboard Is Not Correct On The Home Page");


    }

    @AfterClass
    public void tearDown() {
        System.out.println("Close Chrome Browser");
    }

}
