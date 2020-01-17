package classone;

import org.testng.annotations.Test;

/**
 * @author amalyahayrapetova
 */
public class PriorityAttributesTest {

    @Test
    public void testSystem() {
        System.out.println("System is tested.");
    }

    @Test(priority = 1)
    public void signIn() {
        System.out.println("System is Signed In.");
    }

    @Test(priority = 2)
    public void signOut() {
        System.out.println("System is Signed Out.");
    }

    @Test
    public void exitSystem() {
        System.out.println("System is exited.");
    }

    @Test(priority = 4)
    public void testPriority(){
        System.out.println("The priority is tested.");
    }

}
