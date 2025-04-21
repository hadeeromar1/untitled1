package checkBoxes;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

import static org.testng.Assert.assertTrue;

public class CheckBox extends BaseTests {
    @Test
    public void checkbox () {
        CheckBoxPage checkBoxPage=homePage.clickOnCheckBoxes();
        checkBoxPage.clickCheckBox1();
        checkBoxPage.clickCheckBox2();


    }
}
