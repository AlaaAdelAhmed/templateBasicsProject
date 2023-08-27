package pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;


public class AddRemoveElementsPage {
    static WebDriver driver;

    public AddRemoveElementsPage(WebDriver driver){
        this.driver=driver;

    }

    private By AddRemoveElementsButton = By.cssSelector("button[onclick='addElement()']");
    private static By DeleteButtonDisplayedButton = By.cssSelector(".added-manually");



    public void clickOnAddElementButton()
    {
        driver.findElement(AddRemoveElementsButton).click();

    }
    public static boolean validateButtonIsDispalyed(){

        boolean displayed = driver.findElement(DeleteButtonDisplayedButton).isDisplayed();
        return displayed;

    }

    public void clickOnDeleteButton(){
        driver.findElement(DeleteButtonDisplayedButton).click();

    }


}
