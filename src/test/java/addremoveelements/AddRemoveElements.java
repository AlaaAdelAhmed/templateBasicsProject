package addremoveelements;

import base.BaseTest;
import pages.AddRemoveElementsPage;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddRemoveElements extends BaseTest {

    @Test (priority = 1)
    public void checkButtonIsDisplayed(){
        AddRemoveElementsPage  addRemoveElementsPage= homePage.clickOnAddRemoveElement();
        addRemoveElementsPage.clickOnAddElementButton();
        var DeleteButtonDisplayed = addRemoveElementsPage.validateButtonIsDispalyed();
        assertEquals(DeleteButtonDisplayed,true);
        addRemoveElementsPage.clickOnDeleteButton();

    }

}

