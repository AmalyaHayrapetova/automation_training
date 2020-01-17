package classtwo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author amalyahayrapetova
 */
public class GroupsTest {

    /**
     * This will run only before tests that are in "regression" group
     */
    @BeforeMethod(onlyForGroups = "regression")
    public void signIn() {
        System.out.println("Sign in");
    }


    @Test(groups = "regression")
    public void validSignIn() {
        System.out.println("The user Signed In with valid credentials");
    }

    @Test(groups = "regression")
    public void signInWithoutPassword() {
        System.out.println("Cannot signed in without password");
    }


    /**
     * This test depends on signInWithoutPassword and validSignIn tests, as they are in a group of "regression"
     */
    @Test(dependsOnGroups = "regression", groups = "sanity")
    public void inValidSignIn() {
        System.out.println("The user Signed In with invalid credentials");
    }


    @Test(groups = {"regression", "sanity"})
    public void signOut() {
        System.out.println("User is signed out");
    }

    /**
     * This will be executed only after "inValidSignIn" test, as it is in a group of "sanity"
     */
    @AfterMethod(onlyForGroups = "sanity")
    public void sanityExecution() {
        System.out.println("Sanity is done");
    }


}
