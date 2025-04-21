package dragAndDrop;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.DropdownPage;
import pages.HomePage;

public class DragAndDropTests extends BaseTests {

    @Test
    public void testDragAndDrop() {
        DragAndDropPage dragAndDropPage = homePage.ClickOnDragaAndDropLink();
        dragAndDropPage.dragAndDropElements();

    }

    @Test
    public void testDragAndDrop2() {
        DragAndDropPage dragAndDropPage = homePage.ClickOnDragaAndDropLink();
        dragAndDropPage.dragAndDropElements2();
    }
}
