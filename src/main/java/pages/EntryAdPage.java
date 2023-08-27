package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {
    WebDriver driver;
    WebDriverWait wait;

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;

    }

    private By modalWindow = By.className("modal");

    private By closeModalButton = By.xpath("//p[contains(text(),'Close')]");

    private By titleAfterModalClosed = By.xpath("//p[contains(text(),'Displays')]");

    public boolean validateModalvisble() {
        return driver.findElement(modalWindow).isDisplayed();
    }

    public WebElement waitUntilModalIsDisplayed() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalWindow)));
    }

    public void clickOnCloseModalButton(){
        driver.findElement(closeModalButton).click();
    }
    public String ValidateModalClosed(){
        return  driver.findElement(titleAfterModalClosed).getText();
    }
}