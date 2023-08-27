package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoverPage;
import utils.FigureCaption;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverfigure(){
        HoverPage hoverPage =homePage.clickOnHoverLink();
        FigureCaption figureCaption = hoverPage.hoverOverFigure(2);
        System.out.println(figureCaption.getUsername());
        System.out.println(figureCaption.getProfile());


    }
}
