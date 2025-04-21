package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage {
    WebDriver driver;

    public UploadFilePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By chooseFile = By.xpath("//input[@id= 'file-upload']");

    private final By uploadFile = By.xpath("//input[@class= 'button']");

    private final By validationMessage = By.tagName("h3");

    public void ClickOnChooseFile(String path) {
        driver.findElement(chooseFile).sendKeys(path);
    }

    public void ClickOnUploadFile() {
        driver.findElement(uploadFile).click();
    }

    public String getValidationMessage() {

        return driver.findElement(validationMessage).getText();
    }

}
