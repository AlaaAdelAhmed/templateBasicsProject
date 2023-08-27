package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickOnAlrets {
    WebDriver driver;

    private By alretsButton = By.xpath("//button[contains (text(), 'JS Alert')]");
    private By confirmButton= By.xpath("//button[contains (text(), 'Confirm')]");
    private By insertKeyButton = By.xpath("//button[contains (text(), 'JS Prompt')]");
    private By confirmMsgAfterAlert = By.cssSelector("#result");


    public ClickOnAlrets(WebDriver driver) {
        this.driver= driver;

    }

    public void clickOnAcceptAlert(){
        driver.findElement(alretsButton).click();

    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();

    }

    public String validationAcceptAlert(){
        return driver.findElement(confirmMsgAfterAlert).getText();
    }
    public void clickOnJsConfirmButton(){
        driver.findElement(confirmButton).click();
    }
    public void dismissAlerts(){
        driver.switchTo().alert().dismiss();
    }

    public void clickOnJsPromptButton(){
        driver.findElement(insertKeyButton).click();
    }

    public void insertToAlerts (String text){

        driver.switchTo().alert().sendKeys(text);
    }




}

