package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageGeneralFunctions {

    private WebDriver driver;


    public PageGeneralFunctions(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void loaderWait() {
        WebDriverWait loaderWait = new WebDriverWait(driver, 15);
        loaderWait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("preloader")));
    }

}
