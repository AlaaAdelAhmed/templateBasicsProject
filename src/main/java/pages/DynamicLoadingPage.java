package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver driver;
    private By exampleOneLink = By.xpath("//a[contains(text(),'Example 1')]");

    private By exampleTwoLink = By.xpath("//a[contains(text(),'Example 2')]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver= driver;
    }

    public OnePage clickOnExampleOneLink(){
        driver.findElement(exampleOneLink).click();
        return new OnePage(driver);

    }

    public TwoPage clickOnExampleTwoLink(){
        driver.findElement(exampleTwoLink).click();
        return  new TwoPage(driver);
    }
}
