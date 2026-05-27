package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass {


    @Test(enabled = false)
    public void verify_login(){
        logger.info("********* Starting TC_002_LoginTest *********");

        try {


            HomePage homePage = new HomePage(driver);
            homePage.clickMyAccount();
            homePage.clickLogin();

            LoginPage loginPage = new LoginPage(driver);
            loginPage.setEmail(properties.getProperty("email"));
            loginPage.setPassword(properties.getProperty("password"));
            loginPage.clickLogin();

            //My Account
            MyAccountPage myAccountPage = new MyAccountPage(driver);
            boolean targetPage = myAccountPage.IsMyAccountPageExists();

//        Assert.assertEquals(targetPage, true, "Login failed");
            Assert.assertTrue(targetPage);
        }
        catch (Exception e){
            Assert.fail();
        }

        logger.info("********* Finished TC_002_LoginTest *********");
    }

}
