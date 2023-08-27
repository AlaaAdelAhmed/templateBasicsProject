package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;

    }

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By addRemoveElements = By.linkText("Add/Remove Elements");

    private By Checkboxes = By.linkText("Checkboxes");

    private By dynamicLoadLink = By.linkText("Dynamic Loading");

    private By dropdownLink = By.linkText("Dropdown");

    private By jsAlretsLink = By.linkText("JavaScript Alerts");

    private By forgetPasswordLink = By.linkText("Forgot Password");
    private By statusCodeLink = By.linkText("Status Codes");

    private By fileUploadLink = By.linkText("File Upload");

    private By entryAdLink = By.linkText("Entry Ad");
    private By wysiwygEditor= By.linkText("WYSIWYG Editor");

    private By dragAndDropLink =  By.linkText("Drag and Drop");

    private By hoverLink = By.linkText("Hovers");

    private void click(By locator){
        driver.findElement(locator).click();
    }

    public LoginPage clickOnFormAuthenticationLink(){

        click(formAuthenticationLink);
        return new LoginPage(driver);
    }


    public AddRemoveElementsPage clickOnAddRemoveElement(){

        click(addRemoveElements);
        return new AddRemoveElementsPage(driver);
    }

    public CheckBoxesPage selectUnselectBox(){
        click(Checkboxes);
        return new CheckBoxesPage(driver);


    }

    public  DynamicLoadingPage clickOnDynamicLoadingLink(){

        click(dynamicLoadLink);
        return new DynamicLoadingPage(driver);
    }

    public DropDownPage ClickOnDropDownLink(){
        click(dropdownLink);
        return new DropDownPage(driver);

    }

    public ClickOnAlrets clickOnAlrets(){
        click(jsAlretsLink);
        return new ClickOnAlrets(driver);

    }

    public ForgetPasswordPage clickOnForgetPassword(){
        click(forgetPasswordLink);
        return new ForgetPasswordPage(driver);
    }

    public StatusCodePage clickOnStatusCode(){
        click(statusCodeLink);
        return new StatusCodePage(driver);
    }

    public  UploadImqPage clickOnUploadFileUpload(){
        click(fileUploadLink);
        return new UploadImqPage(driver);
    }

    public EntryAdPage clickOnEntryAdModal(){
        click(entryAdLink);
        return new EntryAdPage(driver);
    }
    public WYSIWYGEditorPage clickOnWYSIWYGEditorLink(){
        click(wysiwygEditor);
        return new WYSIWYGEditorPage(driver);
    }

    public HoverPage clickOnHoverLink(){
        click(hoverLink);
        return new HoverPage(driver);
    }
    public DragAndDropPage clickOnDragAndDropLink(){
        click(dragAndDropLink);
        return new DragAndDropPage(driver);
    }
}
