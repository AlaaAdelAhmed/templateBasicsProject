package statuscodes;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Status200Page;
import pages.StatusCodePage;

import static org.testng.Assert.*;


public class StatusCodes extends BaseTest {

    @Test
    public void StatusCodes(){

        StatusCodePage statusCodePage = homePage.clickOnStatusCode();
        Status200Page status200Page = statusCodePage.clickOn200Link();
        String actualMsg = status200Page.getMsgAfterClick200();
        String expectedMsg = "This page returned a 200 status code.";
        assertTrue(actualMsg.contains(expectedMsg));
    }
}
