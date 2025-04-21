package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {this.driver = driver;}
    private final By userNameFiled = By.xpath("//input[@id='username']");
    private final By passwordField = By.xpath("//input[@id='password']");

    private final By loginButton =By.xpath("//button[@class='radius']");

    public void insertUserName (String username){
        driver.findElement(userNameFiled).sendKeys(username);
    }
    public void  insertPassword (String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickOnLoginButton (){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}

