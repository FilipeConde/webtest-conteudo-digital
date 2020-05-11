package superiorBarTests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.BlogPage;
import pages.QuemSomosPage;
import pages.SobrePage;

public class SuperiorBarNavigationTest extends BaseTest {
//TODO create these tests based on the FreeTest class

    @Test
    public void mustAccessBtnSobre() {
        SobrePage sobrePage = superiorBarPage.btnSobreClick();
        System.out.println("clicked on btnSobre");
        String webUrl = "https://www.conteudodigital.net.br/sobre/";
        System.out.println(sobrePage.getCurrentUrl());
        System.out.println(sobrePage.getTitle());
        Assert.assertTrue(sobrePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnConteudodigital() {
        superiorBarPage.btnConteudodigitalClick();
        System.out.println("clicked on btnConteudodigital");
        String webUrl = "https://www.conteudodigital.net.br/";
        System.out.println(homePage.getCurrentUrl());
        System.out.println(homePage.getTitle());
        Assert.assertTrue(homePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnQuemSomos() {
        QuemSomosPage quemSomosPage = superiorBarPage.btnQuemSomosClick();
        System.out.println("clicked on btnQuemSomos");
        String webUrl = "https://www.conteudodigital.net.br/quem-somos/";
        //SobrePage sobrePage = new SobrePage(driver);
        System.out.println(quemSomosPage.getCurrentUrl());
        System.out.println(quemSomosPage.getTitle());
        Assert.assertTrue(quemSomosPage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnHome() {
        superiorBarPage.btnHomeClick();
        System.out.println("clicked on btnHome");
        String webUrl = "https://www.conteudodigital.net.br/";
        System.out.println(homePage.getCurrentUrl());
        System.out.println(homePage.getTitle());
        Assert.assertTrue(homePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnBlog() {
        BlogPage blogPage = superiorBarPage.btnBlogClick();
        System.out.println("clicked on btnBlog");
        String webUrl = "https://www.conteudodigital.net.br/blog/";
        System.out.println(blogPage.getCurrentUrl());
        System.out.println(blogPage.getTitle());
        Assert.assertTrue(blogPage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnContato() {
        superiorBarPage.btnContatoClick();
        System.out.println("clicked on btnContato");
        String webUrl = "https://www.conteudodigital.net.br/#contact";
        String webUrl2 = "https://www.conteudodigital.net.br/";
        System.out.println(homePage.getCurrentUrl());
        System.out.println(homePage.getTitle());
        Assert.assertTrue(homePage.getCurrentUrl().equals(webUrl) || homePage.getCurrentUrl().equals(webUrl2));
    }

}
