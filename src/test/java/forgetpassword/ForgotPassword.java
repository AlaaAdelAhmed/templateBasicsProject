package forgetpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;
import pages.InternalServerErrorPage;

import static org.testng.Assert.assertEquals;

public class ForgotPassword extends BaseTest {
    @Test
    public void ForgotPassword (){
        ForgetPasswordPage forgetPasswordPage = homePage.clickOnForgetPassword();
        forgetPasswordPage.InsertEMailToSendPassword("alaa@gmail.com");
        InternalServerErrorPage internalServerErrorPage = forgetPasswordPage.clickOnForgetPassword();
        String expectedText =internalServerErrorPage.getPageText();
        String actualAfterClickSubmitMsg = "Internal Server Error";
        assertEquals(expectedText, actualAfterClickSubmitMsg);

    }
}
