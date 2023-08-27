package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TwoPage {
    WebDriver driver;
    WebDriverWait wait;
    public TwoPage(WebDriver driver) {
        this.driver=driver;

    }
    private By startButton = By.cssSelector("#start>button");

    public void clickOnStartButton(){

        driver.findElement(startButton).click();
    }

    public  boolean  waitUntilLoadingBarIsdisappeared(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#loading img")));


    }

}
