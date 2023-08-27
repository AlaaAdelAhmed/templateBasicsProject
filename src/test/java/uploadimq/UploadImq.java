package uploadimq;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUploadedPage;
import pages.UploadImqPage;

import static org.testng.Assert.assertEquals;

public class UploadImq extends BaseTest {

    @Test
    public void FileUpload(){

        UploadImqPage uploadImqPage =  homePage.clickOnUploadFileUpload();
        uploadImqPage.clickOnChooseImq("C:\\Users\\alaa.abdelghafar\\Downloads\\imq.png");
        FileUploadedPage fileUploadedPage =  uploadImqPage.clickOnUploadButton();
        String imqUploaded = fileUploadedPage.getImqUploadedMsg();
        assertEquals(imqUploaded,"imq.png");
    }
}
