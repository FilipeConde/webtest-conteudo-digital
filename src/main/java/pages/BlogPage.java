package pages;

import org.openqa.selenium.WebDriver;

public class BlogPage extends PageGeneralFunctions {

    private WebDriver driver;

    public BlogPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
