package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.QuemSomosPage;
import utils.SuperiorBar;

public class BaseTest {

    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static SuperiorBar superiorBar;
    protected static QuemSomosPage quemSomosPage;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        superiorBar = new SuperiorBar(driver);
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("quit tests");
        driver.quit();
    }

}
