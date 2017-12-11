package GoogleTests.SerenityExample;

/**
 * User: tetiana.kryvets
 * Date: 12/4/2017
 */
import GoogleTests.WebDriverExample.BaseTests;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.github.webdriverextensions.WebDriverExtensionsContext.getDriver;
import static org.junit.Assert.assertEquals;

@RunWith(SerenityRunner.class)
public class GoogleSerenityTest {
    
    @Managed
    WebDriver driver;

    String className, firstLink;


    @Steps
    GoogleSerenitySteps serenity_steps;

    @Test
    @Title("Open the first founded link and check that link is correct")
    public void openFirstLinkTest() {
        serenity_steps.search_by_value("qa fest");
        firstLink = serenity_steps.find_the_first_link();
        serenity_steps.link_should_be_opened();

    }


}
