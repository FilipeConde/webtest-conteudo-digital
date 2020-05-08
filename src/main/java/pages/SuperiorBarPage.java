package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class SuperiorBarPage {

    private WebDriver driver;

    private By btnConteudodigital = By.className("custom-logo");
    private By btnHome = By.linkText("https://www.conteudodigital.net.br");
    private By btnSobre = By.linkText("https://www.conteudodigital.net.br/sobre/");
    private By btnQuemSomos = By.linkText("https://www.conteudodigital.net.br/quem-somos/");
    private By btnBlog = By.linkText("https://www.conteudodigital.net.br/blog/");
    private By btnContato = By.linkText("https://www.conteudodigital.net.br/#contact");

    public SuperiorBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void btnConteudodigitalClick() {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnConteudodigital)));
        driver.findElement(btnConteudodigital).click();
        System.out.println("just clicked on btnConteudodigital");
    }

    public void btnHomeClick() {
        driver.findElement(btnHome).click();
    }

    public void btnSobreClick() {
        driver.findElement(btnSobre).click();
    }

    public void btnQuemSomosClick() {
        driver.findElement(btnQuemSomos).click();
    }

    public void btnBlogClick() {
        driver.findElement(btnBlog).click();
    }

    public void btnContatoClick() {
        driver.findElement(btnContato).click();
    }
}
