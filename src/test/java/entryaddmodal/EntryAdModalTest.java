package entryaddmodal;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.EntryAdPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EntryAdModalTest extends BaseTest {

    @Test
    public void testModal(){

        EntryAdPage entryAdPage = homePage.clickOnEntryAdModal();
        entryAdPage.waitUntilModalIsDisplayed();
        boolean expectedResult = entryAdPage.validateModalvisble();
        assertTrue(expectedResult);
        entryAdPage.clickOnCloseModalButton();
        String expectedResult2 =  entryAdPage.ValidateModalClosed();
        assertEquals(expectedResult2,"Displays an ad on page load.");
    }
}
