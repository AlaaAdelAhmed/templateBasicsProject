package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.FigureCaption;

public class HoverPage {
    WebDriver driver;
    Actions actions;

    private By figure = By.cssSelector(".figure");
    private By figureBox = By.cssSelector(".figcaption");
    public HoverPage (WebDriver driver){
        this.driver=driver;
    }
    public FigureCaption hoverOverFigure(int index){
        actions = new Actions(driver);
        WebElement figureImage = driver.findElements(figure).get(index-1);
        actions.moveToElement(figureImage).perform();
        return new FigureCaption(figureImage.findElement(figureBox));

    }



}
