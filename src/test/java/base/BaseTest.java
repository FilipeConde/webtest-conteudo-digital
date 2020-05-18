package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.SuperiorBarPage;

public class BaseTest {

    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static SuperiorBarPage superiorBarPage;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        superiorBarPage = new SuperiorBarPage(driver);
        //driver.get("https://www.conteudodigital.net.br/");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("quit tests");
        driver.quit();
    }

}
