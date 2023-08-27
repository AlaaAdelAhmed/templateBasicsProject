package checkbox;

import base.BaseTest;
import pages.CheckBoxesPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Checkboxes extends BaseTest {

    @Test(priority = 1)
    public void checkBoxSelect() {
        CheckBoxesPage checkboxes= homePage.selectUnselectBox();
        checkboxes.checkBoxClick();
        var ISselectedbox= checkboxes.checkboxSelect();
        assertTrue(ISselectedbox);
    }
    @Test(priority = 2)
    public void checkBoxUnSelect () {
        CheckBoxesPage checkboxes= homePage.selectUnselectBox();
        checkboxes.checkBoxUncliked();
        var ISUnselectedbox= checkboxes.checkboxUnselect();
        assertFalse(ISUnselectedbox);
    }
}
