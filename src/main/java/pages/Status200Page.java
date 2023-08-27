package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Status200Page {

    WebDriver driver;

    public Status200Page(WebDriver driver){
        this.driver=driver;

    }

    private By getMsgAfterClick200= By.className("example");

    public String getMsgAfterClick200(){
        String msgAfterClick200 = driver.findElement(getMsgAfterClick200).getText();
        return msgAfterClick200;
    }

}


