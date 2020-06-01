package homepageTests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LinksTests extends BaseTest {

    @Before
    public void init() {
        driver.get("https://www.conteudodigital.net.br/");
    }
    //head section
    @Test
    public void mustAccessBtnConhecaOSite() {
        SobrePage sobrePage = homePage.btnConhecaOSiteClick();
        String webUrl = "https://www.conteudodigital.net.br/sobre/";
        Assert.assertTrue(sobrePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnLeiaOsArtigos() {
        BlogPage blogPage = homePage.btnLeiaOsArtigosClick();
        String webUrl = "https://www.conteudodigital.net.br/blog/";
        Assert.assertTrue(blogPage.getCurrentUrl().equals(webUrl));

    }

    //clients section
    @Test
    public void mustAccessBtnBradesco() {
        PortfolioConteudoPage portfolioConteudoPage = homePage.btnBradescoClick();
        String webUrl = "https://www.conteudodigital.net.br/portfolio-conteudo/";
        Assert.assertTrue(portfolioConteudoPage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnColombo() {
        PortfolioStephaniePage portfolioStephaniePage = homePage.btnColomboClick();
        String webUrl = "https://www.conteudodigital.net.br/stephanie/";
        Assert.assertTrue(portfolioStephaniePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnCorello() {
        PortfolioStephaniePage portfolioStephaniePage = homePage.btnCorelloClick();
        String webUrl = "https://www.conteudodigital.net.br/stephanie/";
        Assert.assertTrue(portfolioStephaniePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnCorinthians() {
        PortfolioMobileMarketingPage portfolioMobileMarketingPage = homePage.btnCorinthiansClick();
        String webUrl = "https://www.conteudodigital.net.br/portfolio-mobile-marketing/";
        Assert.assertTrue(portfolioMobileMarketingPage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnClubeDoChoroDeBrasilia() {
        PortfolioConteudoStephaniePage portfolioConteudoStephaniePage = homePage.btnClubeDoChoroClick();
        String webUrl = "https://www.conteudodigital.net.br/portfolio-conteudo-stephanie/";
        Assert.assertTrue(portfolioConteudoStephaniePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnGrupoRBS() {
        PortfolioStephaniePage portfolioStephaniePage = homePage.btnGrupoRBSClick();
        String webUrl = "https://www.conteudodigital.net.br/stephanie/";
        Assert.assertTrue(portfolioStephaniePage.getCurrentUrl().equals(webUrl));
    }

    @Test
    public void mustAccessBtnPalmeiras() {
        PortfolioMobileMarketingPage portfolioMobileMarketingPage = homePage.btnPalmeirasClick();
        String webUrl = "https://www.conteudodigital.net.br/portfolio-mobile-marketing/";
        Assert.assertTrue(portfolioMobileMarketingPage.getCurrentUrl().equals(webUrl));
    }

    //team members section
    //@Test
    //public void mustAccessBtnFacebokAlysson() {
    //
    //}
/*
    @Test
    public void mustAccessBtnLinkedInAlysson() throws InterruptedException {
        AnyPage anyPage = homePage.btnLinkedInAlyssonClick();
        String title = "Alysson Mainieri";
        System.out.println(anyPage.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        anyPage.switchToTab(title);

        Assert.assertTrue(anyPage.getTitle().contains(title));
    }
*/
//TODO solve the new tab problem

    @Test
    public void mustAccessBtnFacebookStephanie() throws InterruptedException {
        AnyPage anyPage = homePage.btnFacebookStephanieClick();
        String webUrl = "https://www.facebook.com/espindolasteph";
        Thread.sleep(4000);
        anyPage.switchToTab("Stephanie Espindola");
        System.out.println(homePage.getCurrentUrl());
        System.out.println(anyPage.getCurrentUrl());
        Assert.assertTrue(anyPage.getCurrentUrl().equals(webUrl));
    }


/*
    @Test
    public void mustAccessBtnLinkedInStephanie() throws InterruptedException {
        AnyPage anyPage = homePage.btnLinkedInStephanieClick();
        String webUrl = "https://www.linkedin.com/in/espindolasteph";
        Thread.sleep(4000);
        anyPage.switchToTab("Stephanie Espindola");
        System.out.println(homePage.getCurrentUrl());
        System.out.println(anyPage.getCurrentUrl());
        Assert.assertTrue(anyPage.getCurrentUrl().equals(webUrl));
    }
*/
/*
    //saiba mais section
    @Test
    public void mustAccessBtnSaibaMais() {

    }

    //blog section (on home page)
//Set of tests for the
//
//

    //footer section (CD for Conteúdo Digital)

    @Test
    public void mustAccessBtnFacebookCD() {

    }

    @Test
    public void mustAccessBtnInstagramCD() {

    }
    */
    @Test
    public void mustAccessBtnSaibaMais() {
        QuemSomosPage quemSomosPage = homePage.btnSaibaMaisClick();
        String webUrl = "https://www.conteudodigital.net.br/quem-somos/";
        Assert.assertTrue(quemSomosPage.getCurrentUrl().equals(webUrl));
    }

    //TODO create this test
/*
    @Test
    public void blogCarouselNavigation() throws InterruptedException {
        List carouselPosts = homePage.getCarouselVisiblePostList();
        homePage.carouselToLeftClick();
        Thread.sleep(4000);
        //Assert.assertTrue(homePage.getCarouselVisiblePostList() != carouselPosts);
        homePage.carouselToRightClick();
        Thread.sleep(4000);
        Assert.assertTrue(homePage.getCarouselVisiblePostList() == carouselPosts);
    }


    @Test
    public void mustAccessBtnFacebookCD() {
        AnyPage anyPage = homePage.btnFacebookCDClick();
        String partialTitle = "Conteúdo Digital - Home";
        Assert.assertTrue(anyPage.getTitle().contains(partialTitle));
    }
*/
    @Test
    public void mustAccessBtnInstagramCD() {
        AnyPage anyPage = homePage.btnInstagramCDClick();
        String partialTitle = "@conteudodigitalnetbr";
        Assert.assertTrue(anyPage.getTitle().contains(partialTitle));
    }
}
