package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodeOf500Page {
    WebDriver diver;
    public StatusCodeOf500Page(WebDriver driver) {this.diver=driver;}

    private final By validationMessage = By.xpath("//div[@id = 'content']");

    public String getValidationMessage (){
        return diver.findElement(validationMessage).getText();
    }
}
