package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    WebDriver driver;
    public ForgetPasswordPage(WebDriver driver){

        this.driver=driver;
    }

    private By forgetPasswordSubmitButton = By.id("form_submit");
    private By emailToSendPassword = By.cssSelector("input[type='text']");

    public InternalServerErrorPage clickOnForgetPassword(){
        driver.findElement(forgetPasswordSubmitButton).click();
        return new InternalServerErrorPage(driver);

    }
    public void InsertEMailToSendPassword(String email){
        driver.findElement(emailToSendPassword).sendKeys(email);

    }

}
