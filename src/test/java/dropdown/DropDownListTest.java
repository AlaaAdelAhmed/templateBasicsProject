package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDownListTest extends BaseTest {
    @Test
    public void testDroplist(){
        String VisableText = "Option 2";
        var dropDownLists = homePage.ClickOnDropDownLink();
        dropDownLists.selectFromDropDown(VisableText);


    }

}
