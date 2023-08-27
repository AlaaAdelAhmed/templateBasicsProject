package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {

    WebDriver driver;

    public StatusCodePage(WebDriver driver){
        this.driver=driver;
    }

    private By link200 = By.linkText("200");

    public Status200Page clickOn200Link(){
        driver.findElement(link200).click();
        return new Status200Page(driver);

    }


}
