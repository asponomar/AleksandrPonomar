package hw6.components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderMenu {
    private WebDriver driver;

    @FindBy(id = "user-icon")
    private SelenideElement userIcon;

    @FindBy(id = "name")
    private SelenideElement userLoginTextField;

    @FindBy(id = "password")
    private SelenideElement userPasswordTextField;

    @FindBy(id = "login-button")
    private SelenideElement loginButton;

    @FindBy(id = "user-name")
    private SelenideElement userName;

    @FindBy(xpath = "//span[contains(text(),'Logout')]")
    private SelenideElement logOutButton;

    @FindBy(css = ".m-l8>li")
    private List<SelenideElement> headerSectionMenuButtons;

    @FindBy(css = ".m-l8>li>.dropdown-toggle")
    private SelenideElement serviceHeaderMenuItem;

    @FindBy(css = ".dropdown-menu>li")
    private List<SelenideElement> serviceHeaderDropdownMenu;

    @FindBy(xpath = "//*[@class='uui-header dark-gray']//*[contains(text(),'Table with pages')]")
    private SelenideElement tableWithPagesServiceHeaderMenuItem;

    @FindBy(xpath = "//*[@class='dropdown-menu']//*[contains(text(),'Different elements')]")
    private SelenideElement differentElementsLinkInDropdownMenu;

    @FindBy(xpath = "//ul[@class='uui-navigation nav navbar-nav m-l8']//*[contains(text(),'Metals & Colors')]")
    private SelenideElement metalsColorsLinkInDropdownMenu;


    public HeaderMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void userIconClick() {
        userIcon.click();
    }

    public void setUserLoginTextField(String userLogin) {
        userLoginTextField.sendKeys(userLogin);
    }

    public void setUserPasswordTextField(String userPassword) {
        userPasswordTextField.sendKeys(userPassword);
    }

    public void loginButtonClick() {
        loginButton.click();
    }

    public SelenideElement getUserIcon() {
        return userIcon;
    }

    public SelenideElement getUserLoginTextField() {
        return userLoginTextField;
    }

    public SelenideElement getUserPasswordTextField() {
        return userPasswordTextField;
    }

    public SelenideElement getLoginButton() {
        return loginButton;
    }

    public SelenideElement getUserName() {
        return userName;
    }

    public SelenideElement getLogOutButton() {
        return logOutButton;
    }

    public List<SelenideElement> getHeaderSectionMenuButtons() {
        return headerSectionMenuButtons;
    }

    public SelenideElement getServiceHeaderMenuItem() {
        return serviceHeaderMenuItem;
    }

    public List<SelenideElement> getServiceHeaderDropdownMenu() {
        return serviceHeaderDropdownMenu;
    }

    public SelenideElement getTableWithPagesServiceHeaderMenuItem() {
        return tableWithPagesServiceHeaderMenuItem;
    }

    public SelenideElement getDifferentElementsLinkInDropdownMenu() {
        return differentElementsLinkInDropdownMenu;
    }

    public SelenideElement getMetalsColorsLinkInDropdownMenu() {
        return metalsColorsLinkInDropdownMenu;
    }
}
