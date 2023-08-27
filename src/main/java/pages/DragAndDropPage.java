package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDropPage {
    WebDriver driver;
    Actions actions;
    private By boxA= By.cssSelector("#column-a");
    private By boxB = By.cssSelector("#column-b");

    public DragAndDropPage(WebDriver driver) {
        this.driver=driver;
    }

    public void dragAndDrop(){
        actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(boxA),driver.findElement(boxB)).perform();

    }
    public void dragAndDrop2(){
        actions=new Actions(driver);
        actions.clickAndHold(driver.findElement(boxB)).moveToElement(driver.findElement(boxA)).release().build().perform();

    }

}
