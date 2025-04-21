package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropdownTest(){
        DropdownPage dropdownPage =homePage.clickOnDropdownLink();
        dropdownPage.selectFromDropdownList("Option 1");
        dropdownPage.selectFromDropdownList("Option 2");
    }
}
