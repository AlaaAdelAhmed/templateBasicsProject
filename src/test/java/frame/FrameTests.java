package frame;

import base.BaseTest;
import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {

    @Test
    public void testFrame(){
        var wysiwygEditorPage = homePage.clickOnWYSIWYGEditorLink();
        wysiwygEditorPage.waitUntilTextLoaded();
        wysiwygEditorPage.clearText();
        wysiwygEditorPage.insertText("text");
        wysiwygEditorPage.clickOnIncreaseIndent();
        wysiwygEditorPage.insertText("222");
        var expectedText = wysiwygEditorPage.ValidateOntextadded();
        var actualText = "text222";
        assertEquals(expectedText,actualText);


    }
}
