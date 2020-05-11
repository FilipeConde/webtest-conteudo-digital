package base;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FreeTest extends BaseTest {

    //private WebDriver driver;

    @Test
    public void accessBasicPageData() {
        System.out.println(homePage.getTitle());
        System.out.println(homePage.getCurrentUrl());
        superiorBarPage.btnConteudodigitalClick();
    }

}
