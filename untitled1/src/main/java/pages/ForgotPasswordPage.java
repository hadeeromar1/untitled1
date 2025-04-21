package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;

    public ForgotPasswordPage (WebDriver driver) {this.driver=driver;}

    private final By emailField=By.xpath("//input[@id='email']");

    private final By retrievePassword= By.xpath("//button[@type='submit']");

    public void insertEmail (String Email) {driver.findElement(emailField).sendKeys(Email);}
    public InternalSeverErrorPage clickOnRetrievePassword (){
        driver.findElement(retrievePassword).click();
     return new InternalSeverErrorPage(driver);
    }
}
