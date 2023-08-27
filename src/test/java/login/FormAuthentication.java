package login;

import base.BaseTest;
import pages.LoginPage;
import pages.SecureAreaPage;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class FormAuthentication extends BaseTest {





    @Test(priority = 1)
    //SucessfulLogin
    public void SucessfulLogin()  {
        LoginPage loginPage= homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickOnLoginButton();
        String ActualSucessfulMessage = secureAreaPage.getValidationMessage();
        String ExpectedSucessfulMessage = "You logged into a secure area!";
//        assertEquals(sucessfulMessage," You logged into a secure area!");
        assertTrue(ActualSucessfulMessage.contains(ExpectedSucessfulMessage));
    }
    @Test
    public void SucessfulLogout(){
        LoginPage loginPage= homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickOnLoginButton();
        secureAreaPage.clickOnLogoutButton();
        String sucessfulLogOut = loginPage.getValidationLogoutMessage();
        assertTrue(sucessfulLogOut.contains("You logged out of the secure area!"));

    }

    @Test(priority = 2)
    public void invalidUsername()  {
        LoginPage loginPage= homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmit");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickOnLoginButton();
        String ActualsucessfulMessage= secureAreaPage.getValidationMessage();
        String expectedsucessfulMessage = "Your username is invalid!";
        assertTrue(ActualsucessfulMessage.contains(expectedsucessfulMessage));

    }


    @Test(priority = 3)
    public void invalidPassword()  {
        LoginPage loginPage= homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword");
        SecureAreaPage secureAreaPage=loginPage.clickOnLoginButton();
        String ActualsucessfulMessage = secureAreaPage.getValidationMessage();
        String expectedsucessfulMessage = "Your password is invalid!";
        assertTrue(ActualsucessfulMessage.contains(expectedsucessfulMessage));

    }
}
