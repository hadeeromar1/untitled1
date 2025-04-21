package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodeOf200Page {
    WebDriver driver;
    public StatusCodeOf200Page(WebDriver driver) {this.driver=driver;}

    private final By validationMessage = By.xpath("//div[ @id = 'content']");

    public String getValidationMessage (){
        return driver.findElement(validationMessage).getText();
    }
}
