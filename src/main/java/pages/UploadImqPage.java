package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadImqPage {
    WebDriver driver;
    public UploadImqPage(WebDriver driver){
        this.driver=driver;
    }

    private By chooseImqButton = By.cssSelector("input[id='file-upload']");
    private By clickOnUploadButton = By.cssSelector(".button");

    public void clickOnChooseImq (String URL){
        driver.findElement(chooseImqButton).sendKeys(URL);
    }

    public FileUploadedPage clickOnUploadButton(){
        driver.findElement(clickOnUploadButton).click();
        return new FileUploadedPage(driver);
    }

}
