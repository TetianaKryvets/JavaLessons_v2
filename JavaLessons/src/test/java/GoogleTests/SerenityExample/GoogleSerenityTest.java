package GoogleTests.SerenityExample;

/**
 * User: tetiana.kryvets
 * Date: 12/4/2017
 */
import GoogleTests.WebDriverExample.BaseTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoogleSerenityTest extends BaseTests {
    GoogleSerenityPages serenityPages = new GoogleSerenityPages();
    String className, linkToPicture;

    @Test
    public void openFirstPictureTest() {
//        logger.
//        pages.findElementByName("suzuki sx4");
//        linkToPicture = pages.clickOnTheFirstPicture();
//        pictureShouldBeOpened();
//        className = pages.openInNewWindow();
//        pages.switchToNewWindow();

    }

    public void pictureShouldBeOpened() {
        assertEquals("suzuki sx4 - Пошук Google", BaseTests.driver.getTitle());
    }
}
