package alerts;

import base.BaseTest;
import com.google.errorprone.annotations.Var;
import pages.ClickOnAlrets;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlertsTest extends BaseTest {

    @Test
    public void testJsAlerts(){
        ClickOnAlrets clickOnAlrets =homePage.clickOnAlrets();
        clickOnAlrets.clickOnAcceptAlert();
        clickOnAlrets.acceptAlert();
        var actualResult = clickOnAlrets.validationAcceptAlert();
        var expectedResult = "You successfully clicked an alert";
        assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testDismissJSAlert(){
        ClickOnAlrets clickOnAlrets = homePage.clickOnAlrets();
        clickOnAlrets.clickOnJsConfirmButton();
        clickOnAlrets.dismissAlerts();
        var actualResult = clickOnAlrets.validationAcceptAlert();
        var expectedResult = "You clicked: Cancel";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testInsertKeyForAlert() {
        ClickOnAlrets clickOnAlrets = homePage.clickOnAlrets();
        clickOnAlrets.clickOnJsPromptButton();
        clickOnAlrets.insertToAlerts("hello");
        clickOnAlrets.acceptAlert();
        var actualResult = clickOnAlrets.validationAcceptAlert();
        var expectedResult = "You entered: hello";
        assertEquals(actualResult,expectedResult);
    }

}
