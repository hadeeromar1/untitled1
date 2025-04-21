package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessLogin() {
        //driver.findElement(By.partialLinkText("Form")).click();
       LoginPage loginPage =homePage.clickOnFormAuthentication();
        //driver.findElement(By.id("username")).sendKeys("tomsmith");
        loginPage.insertUserName("tomsmith");
       // driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        loginPage.insertPassword("SuperSecretPassword!");
        //driver.findElement(By.className("radius")).click();
        SecureAreaPage secureAreaPage =loginPage.clickOnLoginButton();
        String expectedResult = "You logged into a secure area!";
        //String actualResult = driver.findElement(By.id("flash")).getText();
        String actualResult =secureAreaPage.getValidationMessage();
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testInvalidUsername() {
       // driver.findElement(By.partialLinkText("Form")).click();
        LoginPage loginPage =homePage.clickOnFormAuthentication();
       // driver.findElement(By.id("username")).sendKeys("hello");
        loginPage.insertUserName("hello");
       // driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        loginPage.insertPassword("SuperSecretPassword!");
       // driver.findElement(By.className("radius")).click();
        SecureAreaPage secureAreaPage=loginPage.clickOnLoginButton();
       String actualResult =secureAreaPage.getValidationMessage();
       String expectedResult = "Your username is invalid!";
       // String actualResult = driver.findElement(By.id("flash")).getText();
        //String actualResult= SecureAreaPage.
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void testInvalidPassword() {
       // driver.findElement(By.partialLinkText("Form")).click();
        LoginPage loginPage=homePage.clickOnFormAuthentication();
       // driver.findElement(By.id("username")).sendKeys("tomsmith");
        loginPage.insertUserName("tomsmith");
       // driver.findElement(By.id("password")).sendKeys("hello1234!");
        loginPage.insertPassword("hello1234");
        SecureAreaPage secureAreaPage=loginPage.clickOnLoginButton();
        //driver.findElement(By.className("radius")).click();
        String expectedResult = "Your password is invalid!";
        String actualResult=secureAreaPage.getValidationMessage();
       // String actualResult = driver.findElement(By.id("flash")).getText();
        assertTrue(actualResult.contains(expectedResult));
    }

    }


