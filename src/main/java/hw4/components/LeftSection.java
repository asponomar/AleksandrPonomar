package hw4.components;

import com.codeborne.selenide.*;
import org.openqa.selenium.support.*;

import java.util.*;

import static com.codeborne.selenide.Selenide.*;

public class LeftSection {

    @FindBy(name = "navigation-sidebar")
    private SelenideElement navigationSideBar;

    @FindBy(css = ".sidebar-menu>li")
    private List<SelenideElement> sideBarMenuItems;

    @FindBy(xpath = "//ul[@class='sidebar-menu']//*[contains(text(), 'Service')]")
    private SelenideElement serviceSideBarMenuItem;

    @FindBy(xpath = "//ul[@class='sidebar-menu']//*[@class='sub']//*[contains(@ui, 'label')]")
    private List<SelenideElement> serviceSideBarMenuItemSubMenu;

    public LeftSection() {
        page(this);
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
