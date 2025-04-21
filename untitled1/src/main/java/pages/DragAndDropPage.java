package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
    WebDriver driver;

    Actions actions;
    public DragAndDropPage(WebDriver driver) {this.driver=driver;}

    private final By boxA = By.id("column-a");

    private final By boxB = By.id("column-b");

    /// first possible function to drag and drop

    public void dragAndDropElements (){
        actions = new Actions (driver);
        actions.dragAndDrop(driver.findElement(boxA), driver.findElement(boxB)).build().perform();
    }

    /// second type of functions to drag and drop
    public void dragAndDropElements2 (){
        actions= new Actions (driver);
        actions.clickAndHold(driver.findElement(boxA))
                .moveToElement(driver.findElement(boxB)).release(driver.findElement(boxB)).build().perform();
    }
}

