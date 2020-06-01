package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private By carouselToLeft = By.cssSelector(".left");
    private By carouselToRight = By.cssSelector(".right");

//    private By carouselVisiblePosts = By.cssSelector(".item.active");

    private By btnEnviar = By.cssSelector("#pirate-forms-contact-submit");
    private By inputSeuNome = By.cssSelector("#pirate-forms-contact-name");
    private By inputSeuEmail = By.cssSelector("#pirate-forms-contact-email");
    private By inputAssunto = By.cssSelector("#pirate-forms-contact-subject");
    private By inputMessage = By.cssSelector("#pirate-forms-contact-message");
    private By msgSentResponse = By.cssSelector(".col-xs-12.pirate_forms_thankyou_wrap");
    private By btnFacebookCD = By.cssSelector(".fa.fa-facebook");
    private By btnInstagramCD = By.cssSelector(".fa.fa-instagram");

//    private By btnFacebookAlysson = By.cssSelector("a[href='https://www.facebook.com/alysson.mainieri']");
//    private By btnLinkedInAlysson = By.cssSelector(".fa.fa-linkedin");
    private By btnFacebookStephanie = By.cssSelector("#zerif_team-widget-8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");
//    private By btnLinkedInStephanie = By.cssSelector("#zerif_team-widget-8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1) > i:nth-child(2)");

    private By btnSaibaMais = By.cssSelector(".col-md-3 .red-btn");
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
*/
/*
    public AnyPage btnLinkedInAlyssonClick() {
        loaderWait();
        driver.findElement(btnLinkedInAlysson).click();
        return new AnyPage(driver);
    }
*/
    public AnyPage btnFacebookStephanieClick() {
        loaderWait();
        driver.findElement(btnFacebookStephanie).click();
        return new AnyPage(driver);
    }
/*
    public AnyPage btnLinkedInStephanieClick() {
        loaderWait();
        driver.findElement(btnLinkedInStephanie).click();
        return new AnyPage(driver);
    }
    */

    public QuemSomosPage btnSaibaMaisClick() {
        loaderWait();
        driver.findElement(btnSaibaMais).click();
        return new QuemSomosPage(driver);
    }
//check later
    public void carouselToLeftClick() {
        loaderWait();
        driver.findElement(carouselToLeft);
    }
//check later
    public void carouselToRightClick() {
        loaderWait();
        driver.findElement(carouselToRight);
    }
    //TODO create this method
/*
    public List getCarouselVisiblePostList() {
        loaderWait();
        List carouselVisiblePostList = driver.findElements(carouselVisiblePosts);
        return carouselVisiblePostList;
    }
*/

    public void sendMessage() {
        loaderWait();
        //DateFormat dateFormat =  //new DateFormat("dd/MM/yyy HH:mm:ss");
        //Date date = new Date();
        //String dateString = dateFormat.format(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyy HH:mm");
        Date date = new Date();
        String dateString = simpleDateFormat.format(date);
        try {
            driver.findElement(inputSeuNome).sendKeys("TestBot Ada");
            driver.findElement(inputSeuEmail).sendKeys("tatata@gmail.com");
            driver.findElement(inputAssunto).sendKeys("Teste bot mensagem via HomePage");
            driver.findElement(inputMessage).sendKeys("Teste de envio de mensagem pela HomePage;" + Keys.ENTER + dateString);
            driver.findElement(btnEnviar).click();
        } catch (Exception e) {
            System.out.println("Não foi possível enviar mensagem. Verifique quantidade de " +
                    "execuções anteriores e configurações de segurança do site");
        }
    }

    public String getSentEmailResponse() {
        return driver.findElement(msgSentResponse).getText();
    }

    public AnyPage btnFacebookCDClick() {
        loaderWait();
        driver.findElement(btnFacebookCD).click();
        return new AnyPage(driver);
    }

    public AnyPage btnInstagramCDClick() {
        loaderWait();
        driver.findElement(btnInstagramCD).click();
        return new AnyPage(driver);
    }
}
