package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPages {
    WebDriver driver;
    public StatusCodesPages(WebDriver driver) {this.driver=driver;}

    private final By ClickOn200 = By.xpath("//a[@href='status_codes/200']");

    private final By ClickOn301 = By.xpath("//a[@href='status_codes/301']");

    private  final By ClickOn404 = By.xpath("//a[@href='status_codes/404']");

    private final By ClickOn500 = By.xpath("//a[@href='status_codes/500']");

    public StatusCodeOf200Page ClickOn200Code(){
        driver.findElement(ClickOn200).click();
        return new StatusCodeOf200Page(driver);
    }
    public StatusCodeOf301Page ClickOn301Code (){
        driver.findElement(ClickOn301).click();
        return new StatusCodeOf301Page(driver);
    }
    public StatusCodeOf404 ClickOn404Code() {
        driver.findElement(ClickOn404).click(); {
            return new StatusCodeOf404(driver);
        }
    }
    public StatusCodeOf500Page ClickOn500Code (){
        driver.findElement(ClickOn500).click();
        return new StatusCodeOf500Page (driver);
    }
    }


