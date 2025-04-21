package uploadPhoto;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.UploadFilePage;

import static org.testng.Assert.assertTrue;

public class NewPhoto extends BaseTests {
    @Test
    public void uploadNewPhoto () {
        UploadFilePage uploadFilePage=homePage.clickOnFileUpload();
        uploadFilePage.ClickOnChooseFile("/Users/hadeeromarfathy/IdeaProjects/untitled1/upload/1.png");
        String expectedResult ="File Uploaded!";
        String actualResult=uploadFilePage.getValidationMessage();
        assertTrue(actualResult.contains(expectedResult));

        //driver.findElement(By.linkText("File Upload")).click();
       // String filepath = "/Users/hadeeromarfathy/IdeaProjects/untitled1/upload/1.png";
       // driver.findElement(By.id("file-upload")).sendKeys(filepath);

    }
}
