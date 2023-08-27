package wait;

import base.BaseTest;
import pages.OnePage;
import org.testng.annotations.Test;
import pages.TwoPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicLoadingTests extends BaseTest {

    @Test
    public void testDynamicLoading(){

        var dynamicLoadinfTests = homePage.clickOnDynamicLoadingLink();
        OnePage onePage = dynamicLoadinfTests.clickOnExampleOneLink();
        onePage.clickOnStartButton();

        String actualResult = onePage.getValidationMessage();
        String expectedResult="Hello World!";
        assertEquals(actualResult,expectedResult);


    }

    @Test
    public void testDynamicLoadingExampleTwo(){
        var dynamicLoadinfTests = homePage.clickOnDynamicLoadingLink();
        TwoPage twoPage = dynamicLoadinfTests.clickOnExampleTwoLink();
        twoPage.clickOnStartButton();
        assertTrue( twoPage.waitUntilLoadingBarIsdisappeared());

    }

}
