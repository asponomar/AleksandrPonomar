package hw3.ex2.components;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class Footer {
    protected WebDriver driver;

    @FindBy(css = ".footer-bg")
    private WebElement footer;

    public Footer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getFooter() {
        return footer;
    }
}
