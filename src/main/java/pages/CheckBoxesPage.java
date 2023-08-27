package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage {

    static WebDriver driver;
    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
    }
    private static By isSelected1 = By.xpath("//input[@type='checkbox'][1]");
    private static By isunSelected2 = By.xpath("//input[@type='checkbox'][2]");


    public void checkBoxClick() {
        driver.findElement(isSelected1).click();

    }
    public static Boolean checkboxSelect() {
        Boolean selected = driver.findElement(isSelected1).isSelected();
        return selected;
    }

    public void checkBoxUncliked() {
        driver.findElement(isunSelected2).click();
    }
    public static Boolean checkboxUnselect() {
        Boolean unselected = driver.findElement(isunSelected2).isSelected();
        return unselected;
    }

}
