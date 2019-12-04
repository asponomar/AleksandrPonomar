package hw4.ex1;

import com.codeborne.selenide.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;
import java.util.logging.*;

import static com.codeborne.selenide.Selenide.page;

public abstract class AbstractBasePage {
    protected WebDriver driver;

    @FindBy(css = ".m-l8>li")
    private List<SelenideElement> headerSectionMenuButtons;

    @FindBy(id = "mCSB_1")
    private SelenideElement leftSection;

    @FindBy(css = ".footer-bg")
    private SelenideElement footer;

    @FindBy(xpath = "//a[contains(text(),'Service')]")
    private SelenideElement serviceDropdownButton;

    @FindBy(css = ".dropdown-menu>li")
    private List<SelenideElement> serviceDropdownMenu;

//    @FindBy
//    private List

    protected AbstractBasePage() {
        page(this);
    }

    public SelenideElement getLeftSection() {
        return leftSection;
    }

    public SelenideElement getFooter() {
        return footer;
    }

    public List<SelenideElement> getHeaderSectionMenuButtons() {
        return headerSectionMenuButtons;
    }

    public SelenideElement getServiceDropdownButton() {
        return serviceDropdownButton;
    }

    public List<SelenideElement> getServiceDropdownMenu() {
        return serviceDropdownMenu;
    }
}
