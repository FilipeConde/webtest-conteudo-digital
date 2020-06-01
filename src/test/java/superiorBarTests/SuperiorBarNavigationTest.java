package superiorBarTests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;
import utils.SuperiorBar;

public class SuperiorBarNavigationTest extends BaseTest {
//TODO create these tests based on the FreeTest class

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        superiorBar = new SuperiorBar(driver);
        driver.get("https://www.conteudodigital.net.br/");
    }

    @Test
    public void mustAccessBtnSobre() {
        SobrePage sobrePage = superiorBar.btnSobreClick();
        String webUrl = "https://www.conteudodigital.net.br/sobre/";
        Assert.assertTrue(sobrePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnConteudodigital() {
        superiorBar.btnConteudodigitalClick();
        String webUrl = "https://www.conteudodigital.net.br/";
        Assert.assertTrue(homePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnQuemSomos() {
        QuemSomosPage quemSomosPage = superiorBar.btnQuemSomosClick();
        String webUrl = "https://www.conteudodigital.net.br/quem-somos/";
        Assert.assertTrue(quemSomosPage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnHome() {
        superiorBar.btnHomeClick();
        String webUrl = "https://www.conteudodigital.net.br/";
        Assert.assertTrue(homePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnBlog() {
        BlogPage blogPage = superiorBar.btnBlogClick();
        String webUrl = "https://www.conteudodigital.net.br/blog/";
        Assert.assertTrue(blogPage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnContato() {
        superiorBar.btnContatoClick();
        String webUrl = "https://www.conteudodigital.net.br/#contact";
        String webUrl2 = "https://www.conteudodigital.net.br/";
        Assert.assertTrue(homePage.getCurrentUrl().equals(webUrl) || homePage.getCurrentUrl().equals(webUrl2));
    }

}
