package pages;

import org.openqa.selenium.WebDriver;

public class PortfolioConteudoPage extends PageGeneralFunctions {

    private WebDriver driver;

    public PortfolioConteudoPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
