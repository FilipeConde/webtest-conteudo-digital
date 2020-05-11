package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends PageGeneralFunctions {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }



    //alternative verification
    public void accessGoogle() {
        driver.get("https://www.google.com");
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
