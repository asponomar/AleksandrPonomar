package hw6.components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.jws.WebResult;
import java.util.List;

import static com.codeborne.selenide.Selenide.page;

public class LeftSection {
    private WebDriver driver;

    @FindBy(name = "navigation-sidebar")
    private SelenideElement navigationSideBar;

    @FindBy(css = ".sidebar-menu>li")
    private List<SelenideElement> sideBarMenuItems;

    @FindBy(xpath = "//ul[@class='sidebar-menu']//*[contains(text(), 'Service')]")
    private SelenideElement serviceSideBarMenuItem;

    @FindBy(xpath = "//ul[@class='sidebar-menu']//*[@class='sub']//*[contains(@ui, 'label')]")
    private List<SelenideElement> serviceSideBarMenuItemSubMenu;

    public LeftSection(WebDriver driver) {
        this.driver = driver;
    }

    public SelenideElement getNavigationSideBar() {
        return navigationSideBar;
    }

    public List<SelenideElement> getSideBarMenuItems() {
        return sideBarMenuItems;
    }

    public SelenideElement getServiceSideBarMenuItem() {
        return serviceSideBarMenuItem;
    }

    public List<SelenideElement> getServiceSideBarMenuItemSubMenu() {
        return serviceSideBarMenuItemSubMenu;
    }
}
