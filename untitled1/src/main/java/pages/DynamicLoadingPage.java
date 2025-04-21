package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver) {this.driver=driver;}

    private final By exampleOneLink = By.xpath("//a[@href ='/dynamic_loading/1']");

    private final By exampleTwoLink = By.xpath("//a[@href='/dynamic_loading/2']");

    public OnePage clickOnExampleOneClick (){
        driver.findElement(exampleOneLink).click();
        return new OnePage (driver);
        }
        public TwoPage clickOnExampleTwo (){
        driver.findElement(exampleTwoLink).click();
        return new TwoPage (driver);
        }
    }

