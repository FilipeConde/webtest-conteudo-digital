package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class HomePage extends PageGeneralFunctions {

    private WebDriver driver;
    private By btnConhecaOSite = By.linkText("CONHEÇA O SITE");
    private By btnLeiaOsArtigos = By.linkText("LEIA OS ARTIGOS");
    private By btnBradesco = By.cssSelector("#zerif_clients-widget-1");
    private By btnColombo = By.cssSelector("#zerif_clients-widget-2");
    private By btnCorello = By.cssSelector("#zerif_clients-widget-3");
    private By btnCorinthians = By.cssSelector("#zerif_clients-widget-4");
    private By btnClubeDoChoro = By.cssSelector("#zerif_clients-widget-5");
    private By btnGrupoRBS = By.cssSelector("#zerif_clients-widget-10");
    private By btnPalmeiras = By.cssSelector("#zerif_clients-widget-9");

    private By btnFacebookAlysson = By.cssSelector("a[href='https://www.facebook.com/alysson.mainieri']");
    private By btnLinkedInAlysson = By.cssSelector(".fa.fa-linkedin");
    private By btnFacebookStephanie = By.cssSelector("#zerif_team-widget-8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");
    //private By btnLinkedInStephanie = By.cssSelector();

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public SobrePage btnConhecaOSiteClick() {
        loaderWait();
        driver.findElement(btnConhecaOSite).click();
        return new SobrePage(driver);
    }

    public BlogPage btnLeiaOsArtigosClick() {
        loaderWait();
        driver.findElement(btnLeiaOsArtigos).click();
        return new BlogPage(driver);
    }

    public PortfolioConteudoPage btnBradescoClick() {
        loaderWait();
        driver.findElement(btnBradesco).click();
        return new PortfolioConteudoPage(driver);
    }

    public PortfolioStephaniePage btnColomboClick() {
        loaderWait();
        driver.findElement(btnColombo).click();
        return new PortfolioStephaniePage(driver);
    }

    public PortfolioStephaniePage btnCorelloClick() {
        loaderWait();
        driver.findElement(btnCorello).click();
        return new PortfolioStephaniePage(driver);
    }

    public PortfolioMobileMarketingPage btnCorinthiansClick() {
        loaderWait();
        driver.findElement(btnCorinthians).click();
        return new PortfolioMobileMarketingPage(driver);
    }

    public PortfolioConteudoStephaniePage btnClubeDoChoroClick() {
        loaderWait();
        driver.findElement(btnClubeDoChoro).click();
        return new PortfolioConteudoStephaniePage(driver);
    }

    public PortfolioStephaniePage btnGrupoRBSClick() {
        loaderWait();
        driver.findElement(btnGrupoRBS).click();
        return new PortfolioStephaniePage(driver);
    }

    public PortfolioMobileMarketingPage btnPalmeirasClick() {
        loaderWait();
        driver.findElement(btnPalmeiras).click();
        return new PortfolioMobileMarketingPage(driver);
    }
//TODO solve the new tab problem
/*
    public void btnFacebookAlyssonClick() {
        loaderWait();
        driver.findElement(btnFacebookAlysson).click();
    }

    public AnyPage btnLinkedInAlyssonClick() {
        loaderWait();
        driver.findElement(btnLinkedInAlysson).click();
        return new AnyPage(driver);
    }

    public AnyPage btnFacebookStephanieClick() {
        loaderWait();
        driver.findElement(btnFacebookStephanie).click();
        driver.switchTo().window();
        return new AnyPage(driver);
    }*/
}
