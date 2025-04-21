package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver ;
    public HomePage (WebDriver driver) {this.driver =driver;}
   private final By formAuthenticationLink = By.xpath("//a[contains (text(),'Form')]");

    private final By forgotPasswordLink = By.xpath("//a[@href='/forgot_password']");

    private final By StatusCodesLink = By.xpath("//a[@href='/status_codes']");

    private final By CheckBoxesLink= By.xpath("//a[@href= '/checkboxes']");

    private final By FileUpload= By.xpath("//a[@href= '/upload']");

    private final By dynamicLoadingLink= By.xpath("//a[@href ='/dynamic_loading']");

    private final By dropDownLink = By.xpath("//a[@href='/dropdown']");

    private final By JSAlertLink= By.xpath("//a[@href='/javascript_alerts']");

    private final By WysiwygEditor = By.linkText("WYSIWYG Editor");

    private final By dragAndDropLink = By.xpath("//a[@href='/drag_and_drop']");

    public LoginPage clickOnFormAuthentication () {
        clickOnLink(formAuthenticationLink);
        return new LoginPage(driver);
}
public ForgotPasswordPage clickOnForgotPassword () {
        clickOnLink(forgotPasswordLink);
        return new ForgotPasswordPage(driver);
}
public StatusCodesPages clickOnStatusCodes (){
        clickOnLink(StatusCodesLink);
        return new StatusCodesPages (driver);
}
public CheckBoxPage clickOnCheckBoxes (){
        clickOnLink(CheckBoxesLink);
        return new CheckBoxPage (driver);
}
public UploadFilePage clickOnFileUpload (){
       clickOnLink(FileUpload);
        return new UploadFilePage (driver);
}
public DynamicLoadingPage ClickOnDynamicLoading(){
        clickOnLink(dynamicLoadingLink);
        return new DynamicLoadingPage (driver);

}
public DropdownPage clickOnDropdownLink (){
        clickOnLink(dropDownLink);
        return new DropdownPage(driver);
}
    public JSAlertPage ClickOnJSAlertLink (){
        clickOnLink (JSAlertLink);
        return new JSAlertPage (driver);
    }
public WysiwygEditorPage ClickOnWYSIWYGEditor (){
        clickOnLink(WysiwygEditor);
        return new WysiwygEditorPage (driver);

}
public DragAndDropPage ClickOnDragaAndDropLink (){
        clickOnLink(dragAndDropLink);
        return new DragAndDropPage (driver);
}

private void clickOnLink(By locator){
        driver.findElement(locator).click();
}
}



