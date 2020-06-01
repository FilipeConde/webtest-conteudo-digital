package base;

import org.junit.Test;

public class FreeTest extends BaseTest {

    //private WebDriver driver;

    @Test
    public void accessBasicPageData() {
        System.out.println(homePage.getTitle());
        System.out.println(homePage.getCurrentUrl());
        superiorBar.btnConteudodigitalClick();
    }

}
