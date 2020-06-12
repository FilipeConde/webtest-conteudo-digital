package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuemSomosPage extends PageGeneralFunctions {

    private WebDriver driver;

//atributes

    private By btnInstagramAlysson = By.cssSelector("a[href='https://www.instagram.com/alyfm_/'");
    private By btnInstagramStephanie = By.cssSelector("a[href='https://www.instagram.com/espindolasteph/'");


//methods

    public QuemSomosPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public AnyPage btnInstagramAlyssonClick() {
        loaderWait();
        driver.findElement(btnInstagramAlysson).click();
        return new AnyPage(driver);
    }

    public AnyPage btnInstagramStephanieClick() {
        loaderWait();
        driver.findElement(btnInstagramAlysson).click();
        return new AnyPage(driver);
    }


}
