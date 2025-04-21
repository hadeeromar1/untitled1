package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodeOf301Page {
    WebDriver driver;
    public StatusCodeOf301Page(WebDriver driver) {this.driver=driver;}

    private final By validationMessage = By.xpath("//div[@id = 'content']");

    public String validationMessage (){
        return driver.findElement(validationMessage).getText();
    }
}
