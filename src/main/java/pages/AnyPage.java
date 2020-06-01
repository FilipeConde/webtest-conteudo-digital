package pages;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class AnyPage extends PageGeneralFunctions{

    private WebDriver driver;

    public AnyPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void switchToTab(String tabTitle) {
        Set<String> windows = driver.getWindowHandles();

        for(String window : windows) {
            driver.switchTo().window(window);
            if(driver.getTitle().contains(tabTitle)) {
                break;
            }
        }
    }

}

