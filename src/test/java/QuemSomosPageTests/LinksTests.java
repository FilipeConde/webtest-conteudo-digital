package QuemSomosPageTests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AnyPage;
import pages.QuemSomosPage;

import java.time.Duration;

public class LinksTests extends BaseTest {

    private QuemSomosPage quemSomosPage = new QuemSomosPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, 7);



    @Before
    public void init() {
        driver.get("https://www.conteudodigital.net.br/quem-somos/");
    }

    @Test
    public void mustAccessCorrectPage() {

        quemSomosPage = new QuemSomosPage(driver);
        String title = "QUEM SOMOS | Conteúdo Digital";
        Assert.assertTrue(quemSomosPage.getTitle().equalsIgnoreCase(title));

    }

    @Test
    public void mustAccessBtnInstagramAlysson() throws InterruptedException {

        AnyPage anyPage = quemSomosPage.btnInstagramAlyssonClick();
        String partialTitle = "@alyfm";
        Thread.sleep(2000);

        anyPage.switchToTab(partialTitle);

        System.out.println(anyPage.getTitle());
        Assert.assertTrue(anyPage.getTitle().contains(partialTitle));

    }

}
