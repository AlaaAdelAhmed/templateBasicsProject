package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;

    }

    private By usernameField = By.id("username");
    private By passwordFIeld = By.id("password");
    private By loginButton = By.className("radius");
    private By validationLogout = By.id("flash");


    public void insertUsername(String username){

        driver.findElement(usernameField).sendKeys(username);
    }

    public void insertPassword(String password){
        driver.findElement(passwordFIeld).sendKeys(password);

    }

    public SecureAreaPage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }




    public String getValidationLogoutMessage(){
        String textLogout = driver.findElement(validationLogout).getText();
        return textLogout;


    }
}

