package statusCode;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class CheckStatusCodeTests extends BaseTests {
    @Test
    public void error200 () {
        StatusCodesPages statusCodesPages=homePage.clickOnStatusCodes();
        StatusCodeOf200Page statusCodeOf200Page=statusCodesPages.ClickOn200Code();
        String actualResult = statusCodeOf200Page.getValidationMessage();
        String expectedResult = "This page returned a 200 status code.";
        assertTrue(actualResult.contains(expectedResult));
       // driver.findElement(By.linkText("Status Codes")).click();
        //driver.findElement(By.linkText("200")).click();
      // String expectedResult = "This page returned a 200 status code.";
       // String actualResult = driver.findElement(By.xpath("//p[contains(text(),'200')]")).getText();
      // assertTrue(actualResult.contains(expectedResult));
    }
    @Test
    public void error301 () {
        StatusCodesPages statusCodesPages=homePage.clickOnStatusCodes();
        StatusCodeOf301Page statusCodeOf301Page=statusCodesPages.ClickOn301Code();
        String actualResult = statusCodeOf301Page.validationMessage();
        String expectedResult = "This page returned a 301 status code.";
        assertTrue(actualResult.contains(expectedResult));
    }

        @Test
                public void error404 (){
            StatusCodesPages statusCodesPages=homePage.clickOnStatusCodes();
            StatusCodeOf404 statusCodeOf404=statusCodesPages.ClickOn404Code();
            String actualResult=statusCodeOf404.getValidationMessage();
            String expectedResult = "This page returned a 404 status code.";
            assertTrue(actualResult.contains(expectedResult));

        }
@Test
    public void error500(){
        StatusCodesPages statusCodesPages=homePage.clickOnStatusCodes();
    StatusCodeOf500Page statusCodeOf500Page=statusCodesPages.ClickOn500Code();
    String actualResult=statusCodeOf500Page.getValidationMessage();
    String expectedResult= "This page returned a 500 status code.";
    assertTrue(actualResult.contains(expectedResult));
    }



    }





