package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OnePage;
import pages.TwoPage;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

    @Test

    public void testExplicitWait() {
        DynamicLoadingPage dynamicLoadingPage =homePage.ClickOnDynamicLoading();
      OnePage onePage = dynamicLoadingPage.clickOnExampleOneClick();
      onePage.clickOnStartButton();
      String expectedText ="Hello World!";
      String actualText= onePage.getValidationMessage();
      assertEquals(expectedText,actualText);
    }

    @Test
    public void testExplicitWait2(){
        DynamicLoadingPage dynamicLoadingPage=homePage.ClickOnDynamicLoading();
        TwoPage twoPage =dynamicLoadingPage.clickOnExampleTwo();
        twoPage.clickOnStartButton();
        String expectedText = "Hello World!";
        String actualText = twoPage.getValidationMessage();
        assertEquals(actualText,expectedText);
    }
}
