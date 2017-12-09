package GoogleTests.WebDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

/**
 * User: tetiana.kryvets
 * Date: 12/8/2017
 */
public class GooglePages {

    public void findElementByName(String findElementByName) {
        WebElement searchField = BaseTests.driver.findElement(By.id("lst-ib"));
        searchField.sendKeys(findElementByName);
        searchField.submit();
    }

    public String clickOnTheFirstPicture() {
        String firstLink;
        WebElement firstItem = BaseTests.driver.findElement(By.xpath("(//div/h3/a)[1]"));
        firstLink = firstItem.getText();
        firstItem.click();
        return firstLink;
    }

    public String openInNewTab() {
        String linkToFirstElement;
        WebElement firstItem = BaseTests.driver.findElement(By.xpath("(//div/h3/a)[1]"));
        linkToFirstElement = firstItem.getAttribute("href");
        //open in a new tab:
        ((JavascriptExecutor)BaseTests.driver).executeScript("window.open()");

        return linkToFirstElement;
        //Case1: it doesn't work
        //BaseTests.driver.findElement(By.xpath("(//div/h3/a)[1]")).sendKeys(Keys.CONTROL +"t");



         //Case2: it doesn't work
//        Actions act = new Actions(BaseTests.driver);
//        act.moveToElement(BaseTests.driver.findElement(By.xpath("(//div/h3/a)[1]")))
//                .contextClick()
//                .keyDown(Keys.COMMAND)
//                .click()
//                .build().perform();

         //Case3: it doesn't work
      //  String selectedLinkIsOpenInNewTab = Keys.chord(Keys.CONTROL,"t");
      //  BaseTests.driver.findElement(By.xpath("(//div/h3/a)[1]")).sendKeys(selectedLinkIsOpenInNewTab);

    }

    public void switchToNewTab(String link) {
        ArrayList<String> tabs = new ArrayList<String> (BaseTests.driver.getWindowHandles());

        BaseTests.driver.switchTo().window(tabs.get(1));
        BaseTests.driver.get(link);
    }

}
