package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WysiwygEditorPage {
    WebDriver driver;

    WebDriverWait wait;
    public WysiwygEditorPage(WebDriver driver) {this.driver=driver;}

    private final String frame = "mce_0_ifr";

    private final By editor = By.id("tinymce");

    private final By increaseIndentButton = By.cssSelector("[aria-label='Increase indent']");

    private void switchToFrame(){
        driver.switchTo().frame(frame);

    }
    private void switchToParent (){
        driver.switchTo().parentFrame();

    }
    public void insertEditor (String text ){
        driver.findElement(editor).sendKeys(text);
    }
public void clearTest(){
        switchToFrame();
driver.findElement(editor).clear();
 wait= new WebDriverWait(driver, Duration.ofSeconds(10));
 wait.until(ExpectedConditions.textToBe(editor,"Your content goes here."));
 driver.findElement(editor).clear();
 switchToParent();
 }
    public void clickOnIncreaseIndentButton (){
        driver.findElement(editor).click();
    }
}
