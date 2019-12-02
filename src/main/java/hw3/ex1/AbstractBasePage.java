package hw3.ex1;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

public abstract class AbstractBasePage {
    protected WebDriver driver;

    @FindBy(css = ".m-l8>li")
    private List<WebElement> headerSectionMenuButtons;

    @FindBy(id = "mCSB_1")
    private WebElement leftSection;

    @FindBy(css = ".footer-bg")
    private WebElement footer;

    protected AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLeftSection() {
        return leftSection;
    }

    public WebElement getFooter() {
        return footer;
    }

    public List<WebElement> getHeaderSectionMenuButtons() {
        return headerSectionMenuButtons;
    }
}
