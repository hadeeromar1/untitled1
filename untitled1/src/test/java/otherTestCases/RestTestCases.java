package otherTestCases;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RestTestCases extends BaseTests {

    @Test
    public void keyPresses () {
        driver.findElement(By.xpath("//a[@href='/key_presses']")).click();
        String expectedResult = "Key Presses";
        String actualResult = driver.findElement(By.xpath("//h3[contains (text(),'Key Presses')]")).getText();
        assertTrue(actualResult.contains(expectedResult));
    }
    @Test
    public void contextMenu (){
        driver.findElement(By.xpath("//a[@href='/context_menu']")).click();
        driver.findElement(By.xpath("//p[contains(text(),'Context menu')]")).getText();
        String expectedResult= "Context menu items are custom additions that appear in the right-click menu.\n\n";
        String actualResult= driver.findElement(By.xpath("//p[contains(text(),'Context menu')]")).getText();
    }
}
