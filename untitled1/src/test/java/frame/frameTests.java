package frame;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class frameTests extends BaseTests {

    @Test
    public void testFrame (){
        WysiwygEditorPage wysiwygEditorPage =homePage.ClickOnWYSIWYGEditor();
//        wysiwygEditorPage.clearTest();
        wysiwygEditorPage.insertEditor("Hello World");
        wysiwygEditorPage.clickOnIncreaseIndentButton();


    }
}
