package GoogleTests.SerenityExample;

import GoogleTests.WebDriverExample.BaseTests;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User: tetiana.kryvets
 * Date: 12/4/2017
 */
public class GoogleSerenityPages {

    @FindBy(id = "sfdiv")
    WebElementFacade searchField;

    public void findElementByName(String entityName) {

        searchField.then().click();

        By searchLocator = By.id("sfdiv");
        WebElement searchField = BaseTests.driver.findElement(searchLocator);

        Actions actions = new Actions(BaseTests.driver);
        actions.moveToElement(searchField);
        actions.click();
        actions.sendKeys(entityName);
        actions.build().perform();
        actions.sendKeys(Keys.ENTER);
        actions.build().perform();
        //searchField.sendKeys();

        WebElement pictureButton;
        pictureButton = (new WebDriverWait(BaseTests.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/a[text()='Зображення']")));
        pictureButton.click();
    }

    public String clickOnTheFirstPicture() {
        WebElement firstPictureButton = BaseTests.driver.findElement(By.xpath("(//div[@class='rg_bx rg_di rg_el " +
                "ivg-i']/a[@class='rg_l'])[1]"));
        firstPictureButton.click();
        return firstPictureButton.getAttribute("href");
    }

    public String openInNewWindow() throws InterruptedException {
        WebElement firstPictureButton = BaseTests.driver.findElement(By.xpath("(//div[@class='rg_bx rg_di rg_el " +
                "ivg-i']/a[@class='rg_l'])[1]"));

        Actions newAction = new Actions(BaseTests.driver);
        newAction.keyDown(Keys.SHIFT).click(firstPictureButton).keyUp(Keys.SHIFT).build().perform();

        String classValue = firstPictureButton.getAttribute("href");
        return classValue;
    }

    public void switchToNewWindow() {
        // Store the current window handle
        String winHandleBefore = BaseTests.driver.getWindowHandle();
        // Perform the click operation that opens new window

        // Switch to new window opened
        for(String winHandle : BaseTests.driver.getWindowHandles()){
            BaseTests.driver.switchTo().window(winHandle);
        }

        // Perform the actions on new window

    }
}
