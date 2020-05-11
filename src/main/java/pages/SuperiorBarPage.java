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
    private By btnHome = By.cssSelector("#menu-item-63");
    private By btnSobre = By.cssSelector("#menu-item-71");
    private By btnQuemSomos = By.cssSelector("#menu-item-72");
    private By btnBlog = By.cssSelector("#menu-item-116");
    private By btnContato = By.cssSelector("#menu-item-191");

    public SuperiorBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void btnConteudodigitalClick() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
        driver.findElement(btnConteudodigital).click();
        System.out.println("just clicked on btnConteudodigital");
    }

    public void btnHomeClick() {
        driver.findElement(btnHome).click();
    }

    public SobrePage btnSobreClick() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnSobre)));
        driver.findElement(btnSobre).click();
        System.out.println("just clicked on btnSobre");
        return new SobrePage(driver);
    }

    public QuemSomosPage btnQuemSomosClick() {

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnQuemSomos)));
        driver.findElement(btnQuemSomos).click();
        System.out.println("just clicked on btnQuemSomos");
        return new QuemSomosPage(driver);
    }

    public BlogPage btnBlogClick() {

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnBlog)));
        driver.findElement(btnBlog).click();
        System.out.println("just clicked on btnBlog");
        return new BlogPage(driver);
    }

    public void btnContatoClick() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(btnContato)));
        driver.findElement(btnContato).click();
        System.out.println("just clicked on btnContato");
    }
}