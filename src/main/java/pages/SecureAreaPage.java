package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;

    private By logoutButton = By.xpath("//a[contains(@class,'button')]");

    public SecureAreaPage(WebDriver driver) {
        this.driver=driver;

    }

    private By loginValidationMessage = By.id("flash");

    public String getValidationMessage(){
        String text = driver.findElement(loginValidationMessage).getText();
        return text;


    }

    public HomePage clickOnLogoutButton(){
        driver.findElement(logoutButton).click();
        return new HomePage(driver);
    }
}
