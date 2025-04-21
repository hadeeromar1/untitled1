package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalSeverErrorPage {

    WebDriver driver;
    public InternalSeverErrorPage(WebDriver driver) {this.driver = driver;}

    private final By errorMessage =By.tagName("h1");

    public String errorMessage ()
    {
        return driver.findElement(errorMessage).getText();}
    }

