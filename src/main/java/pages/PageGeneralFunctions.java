package pages;

import org.openqa.selenium.WebDriver;

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

}
