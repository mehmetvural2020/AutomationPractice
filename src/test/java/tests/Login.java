package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.Driver;

public class Login extends TestBase {


    @Test(description = "Verifying the title of the webpage")
    public void testTitle() {
//        System.out.println(Driver.get().getTitle());

        String expectedTitle = "My Store";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        BrowserUtils.wait(3);
    }

//    @Test(priority = 1, groups = {"sanity", "regression", "smoke"})
//    public void testZero(){
//        System.out.println("Test1");
//    }
//
//    @Test(priority = 2, dependsOnMethods = {"testTwo"}, alwaysRun = true)  // Can we use more than one test method?
//    public void testOne(){
//        System.out.println("Test2");
//    }
//
//    @Test(priority = 3)
//    public void testTwo(){
//        System.out.println("Test3");
//    }
//
//    @Test(priority = 4, enabled = false)
//    public void testThree(){
//        System.out.println("Test4");
//    }
}
