package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalServerErrorPage {
    WebDriver driver;
    public InternalServerErrorPage(WebDriver driver) {

        this.driver=driver;

    }

    private By pageText = By.xpath("//*[contains(text(),'Internal Server Error')]");


    public String getPageText(){
        String text = driver.findElement(pageText).getText();
        return text ;

    }

}
