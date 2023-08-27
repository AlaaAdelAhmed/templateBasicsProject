package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadedPage {
    WebDriver driver;
    public FileUploadedPage(WebDriver driver) {
        this.driver=driver;
    }
    private By imqUploadedSucessMsg = By.id("uploaded-files");

    public String getImqUploadedMsg(){
        String imqUploaded = driver.findElement(imqUploadedSucessMsg).getText();
        return imqUploaded;

    }

}
