package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TwoPage {
    WebDriver driver;
    WebDriverWait wait;
    public TwoPage(WebDriver driver) {this.driver=driver;}

    private final By startButton = By.xpath("//div[@id ='start']");

    private final By catchLoader = By.xpath("//div[@id='loading']");

    private final By validationMessage = By.xpath("//div[@id='finish']");
    public void clickOnStartButton () {
        driver.findElement(startButton).click();
    }
    public String getValidationMessage (){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(catchLoader)));
        return driver.findElement(validationMessage).getText();


    }
}
