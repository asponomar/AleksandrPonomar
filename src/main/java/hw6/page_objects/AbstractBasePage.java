package hw6.page_objects;

import hw6.components.HeaderMenu;
import hw6.components.LeftSection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractBasePage {
    protected WebDriver driver;
    protected HeaderMenu headerMenu;
    protected LeftSection leftSection;

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        headerMenu = new HeaderMenu(driver);
        leftSection = new LeftSection(driver);
    }
}
