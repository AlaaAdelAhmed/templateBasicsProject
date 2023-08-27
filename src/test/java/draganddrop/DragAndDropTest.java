package draganddrop;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTest extends BaseTest {
    @Test
    public void testDragAndDrop(){
        DragAndDropPage dragAndDropPage =  homePage.clickOnDragAndDropLink();
        dragAndDropPage.dragAndDrop();
        dragAndDropPage.dragAndDrop2();
    }
}
