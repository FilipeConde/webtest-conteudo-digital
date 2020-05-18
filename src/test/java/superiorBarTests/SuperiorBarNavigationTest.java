package superiorBarTests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;

public class SuperiorBarNavigationTest extends BaseTest {
//TODO create these tests based on the FreeTest class

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        superiorBarPage = new SuperiorBarPage(driver);
        driver.get("https://www.conteudodigital.net.br/");
    }

    @Test
    public void mustAccessBtnSobre() {
        SobrePage sobrePage = superiorBarPage.btnSobreClick();
        String webUrl = "https://www.conteudodigital.net.br/sobre/";
        Assert.assertTrue(sobrePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnConteudodigital() {
        superiorBarPage.btnConteudodigitalClick();
        String webUrl = "https://www.conteudodigital.net.br/";
        Assert.assertTrue(homePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnQuemSomos() {
        QuemSomosPage quemSomosPage = superiorBarPage.btnQuemSomosClick();
        String webUrl = "https://www.conteudodigital.net.br/quem-somos/";
        Assert.assertTrue(quemSomosPage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnHome() {
        superiorBarPage.btnHomeClick();
        String webUrl = "https://www.conteudodigital.net.br/";
        Assert.assertTrue(homePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnBlog() {
        BlogPage blogPage = superiorBarPage.btnBlogClick();
        String webUrl = "https://www.conteudodigital.net.br/blog/";
        Assert.assertTrue(blogPage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnContato() {
        superiorBarPage.btnContatoClick();
        String webUrl = "https://www.conteudodigital.net.br/#contact";
        String webUrl2 = "https://www.conteudodigital.net.br/";
        Assert.assertTrue(homePage.getCurrentUrl().equals(webUrl) || homePage.getCurrentUrl().equals(webUrl2));
    }

}
