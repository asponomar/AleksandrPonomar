package hw3.ex2.components;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class NavigationSideBar {
    private WebDriver driver;

    @FindBy(id = "mCSB_1")
    private WebElement leftSection;

    public NavigationSideBar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLeftSection() {
        return leftSection;
    }
}
