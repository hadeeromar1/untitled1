package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JSAlertPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JSAlertTests extends BaseTests {
    @Test
    public void testJSAlert (){
       JSAlertPage jsAlertPage = homePage.ClickOnJSAlertLink();
       jsAlertPage.clickOnJSAlertButton();
       jsAlertPage.acceptAlert();
       String expectedResult= "You successfully clicked an alert";
       String actualResult =jsAlertPage.getValidationMessage();
       assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testJSAlertConfirm (){
        JSAlertPage jsAlertPage =homePage.ClickOnJSAlertLink();
        jsAlertPage.ClickOnJSConfirmButton();
        jsAlertPage.dismissAlert();
        String expectedResult ="You clicked: Cancel";
        String actualResult = jsAlertPage.getValidationMessage2();
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testJSAlertPrompt(){
        JSAlertPage jsAlertPage=homePage.ClickOnJSAlertLink();
        jsAlertPage.clickONJSAlertPrompt();
        jsAlertPage.insertMessage();
        jsAlertPage.acceptAlert();
        String expectedResult= "Hello world";
        String actualResult= jsAlertPage.getValidationMessage3();
        assertTrue(actualResult.contains(expectedResult));


    }
}
