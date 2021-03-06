package GoogleTests.SerenityExample;

import GoogleTests.WebDriverExample.BaseTests;
import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.WaitForBuilder;

import static org.junit.Assert.assertEquals;

/**
 * User: tetiana.kryvets
 * Date: 12/4/2017
 */
public class GoogleSerenitySteps extends ScenarioSteps{
    private String link;
    public GoogleSerenityPages serenity_pages;

    @Step("Search by enterred value")
    public void search_by_value(String search_value) {
        serenity_pages.searchFor(search_value);
    }

    @Step("Find the first link in search result and return link")
    public String find_the_first_link() {
        return serenity_pages.selectTheFirstLink();
    }

    @Step("Verify that opened link is the first link in Search result")
    public void link_should_be_opened() {
        assertEquals("Opened link is incorrect", find_the_first_link(), BaseTests.driver.getCurrentUrl());
    }
}
