package forgotPassword;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.InternalSeverErrorPage;

import static org.testng.Assert.assertTrue;

public class AccessForgotPassword extends BaseTests {
    @Test
    public void forgotPassword() {
       ForgotPasswordPage forgotPasswordPage= homePage.clickOnForgotPassword();
        forgotPasswordPage.insertEmail("hadeeromar589@yahoo.com");
        InternalSeverErrorPage internalSeverErrorPage = forgotPasswordPage.clickOnRetrievePassword();
      String expectedResult = "Internal Server Error";
        String actualResult = internalSeverErrorPage.errorMessage();
        assertTrue(actualResult.contains(expectedResult));



    }
}