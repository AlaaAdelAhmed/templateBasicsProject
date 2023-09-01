package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WYSIWYGEditorPage {
    WebDriver driver;
    WebDriverWait wait;
    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver=driver;
    }
    private String  frame = "mce_0_ifr";
    private By textField = By.id("tinymce");

    private By increaseIndent = By.cssSelector("[aria-label='Increase indent']");
    private void switchToFrame(){
        driver.switchTo().frame(frame);
    }
    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void clearText(){
        switchToFrame();
        driver.findElement(textField).clear();
        switchToParentFrame();
    }

    public void insertText(String text){
        switchToFrame();
        driver.findElement(textField).sendKeys(text);
        switchToParentFrame();
    }

    public void clickOnIncreaseIndent(){
        driver.findElement(increaseIndent).click();
    }

    public String ValidateOntextadded(){
        switchToFrame();
        String text = driver.findElement(textField).getText();
        switchToParentFrame();
        return text;


    }

    public void waitUntilTextLoaded(){
        switchToFrame();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(textField)));
        switchToParentFrame();
    }
}
