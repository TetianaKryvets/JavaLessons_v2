package GoogleTests.WebDriverExample;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: tetiana.kryvets
 * Date: 12/3/2017
 */
public class GoogleTests extends BaseTests {
    GooglePages pages = new GooglePages();
    String className, firstLink;

    @Test
    public void openFirstPictureTest() {
        pages.findElementByName("qa fest");
        firstLink = pages.clickOnTheFirstPicture();
        linkShouldBeOpened(firstLink);
    }

    @Test
    public void openFirstPictureInNewWindow() {
        pages.findElementByName("qa fest");
        firstLink = pages.openInNewTab();
        //switches to new tab
        pages.switchToNewTab(firstLink);

        // switch back to main screen
//        driver.switchTo().window(tabs.get(0));
//        driver.get("https://www.news.google.com");

        linkShouldBeOpenedInNewWindow(firstLink);
    }

    public void linkShouldBeOpened(String expectedlink) {
        assertEquals(expectedlink, BaseTests.driver.getTitle());
    }

    public void linkShouldBeOpenedInNewWindow(String expectedlink) {
        assertEquals(expectedlink, BaseTests.driver.getCurrentUrl());
    }

}
