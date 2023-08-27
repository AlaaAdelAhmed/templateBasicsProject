package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FigureCaption {

    WebElement caption;

    private By username = By.tagName("h5");

    private By profile = By.tagName("a");
    public FigureCaption(WebElement caption) {
        this.caption=caption;

    }
    public String getUsername(){
        return caption.findElement(username).getText();

    }

    public String getProfile(){
        return caption.findElement(profile).getText();
    }
}
