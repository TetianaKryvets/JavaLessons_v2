package GoogleTests.WebDriverExample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * User: tetiana.kryvets
 * Date: 12/3/2017
 */
public class BaseTests {
    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
