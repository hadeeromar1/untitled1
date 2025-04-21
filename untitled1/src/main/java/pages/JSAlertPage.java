package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertPage {
    WebDriver driver;
    public JSAlertPage(WebDriver driver) {this.driver=driver;}

    //first option

    private final By JSAlertButton = By.xpath("//button[contains (text(),'JS Alert')]");

    private final By validationMessage = By.id("result");

    //second option

    private final By JSConfirmButton= By.xpath("//button[contains (text(),'JS Confirm')]");

    private final By validationMessage2= By.xpath("//p[contains (text(),'You clicked')]");

    //third option

    private final By JSAlertPrompt= By.xpath("//button[contains (text(),'Click for JS Prompt')]");

    private final By ValidationMessage3 = By.xpath("//p[contains (text(),'Hello world')]");


    //firs taction

    public void clickOnJSAlertButton (){driver.findElement(JSAlertButton).click();}

public void acceptAlert (){
        driver.switchTo().alert().accept();
}

public String getValidationMessage (){
     return driver.findElement(validationMessage).getText();
}

//second action

public void ClickOnJSConfirmButton (){driver.findElement(JSConfirmButton).click();}

    public void dismissAlert (){ driver.switchTo().alert().dismiss();}

    public String getValidationMessage2 (){ return driver.findElement(validationMessage2).getText();}

    //third action

    public void clickONJSAlertPrompt (){ driver.findElement(JSAlertPrompt).click();}

    public void insertMessage (){ driver.switchTo().alert().sendKeys("Hello world");}

    public void acceptMessage (){driver.switchTo().alert().accept();}

    public String getValidationMessage3 (){return driver.findElement(ValidationMessage3).getText();}




}

