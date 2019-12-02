package hw3.ex2;

import hw3.ex2.components.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public abstract class AbstractBasePage {
    protected WebDriver driver;

    private HomePageComposite homePage;
    private HeaderMenu headerMenu;
    private NavigationSideBar navigationSideBar;
    private Footer footer;

    protected AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        headerMenu = new HeaderMenu(driver);
        navigationSideBar = new NavigationSideBar(driver);
        footer = new Footer(driver);
    }
}
