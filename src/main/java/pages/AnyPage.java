package pages;

import org.openqa.selenium.WebDriver;

public class AnyPage extends PageGeneralFunctions{

    private WebDriver driver;

    public AnyPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
