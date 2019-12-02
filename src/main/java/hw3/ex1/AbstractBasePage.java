package hw3.ex1;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public abstract class AbstractBasePage {
    protected WebDriver driver;

    protected AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
