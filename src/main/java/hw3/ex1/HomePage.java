package hw3.ex1;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

public class HomePage extends AbstractBasePage {

    @FindBy(id = "user-icon")
    private WebElement userIcon;

    @FindBy(id = "name")
    private WebElement userLoginTextField;

    @FindBy(id = "password")
    private WebElement userPasswordTextField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(css = ".m-l8>li")
    private List<WebElement> headerSectionMenuButtons;

    @FindBy(css = ".icons-benefit")
    private List<WebElement> homePageImages;

    @FindBy(css = ".benefit-txt")
    private List<WebElement> benefitText;

    @FindBy(name = "main-title")
    private WebElement centralMainHeader;

    @FindBy(name = "jdi-text")
    private WebElement centralMainHeaderText;

    @FindBy(id = "iframe")
    private WebElement iFrame;

    @FindBy(id = "epam_logo")
    private WebElement epamLogo;

    @FindBy(xpath = "//*[@class='text-center']")
    private WebElement subHeaderText;

    @FindBy(linkText = "JDI GITHUB")
    private WebElement epamJdiGitHubLink;

    @FindBy(id = "mCSB_1")
    private WebElement leftSection;

    @FindBy(css = ".footer-bg")
    private WebElement footer;


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void open(String url) {
        driver.get(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
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

    public String getUserNameText() {
        return userName.getText();
    }

    public List<WebElement> getHeaderSectionMenuButtons() {
        return headerSectionMenuButtons;
    }

    public List<WebElement> getHomePageImages() {
        return homePageImages;
    }

    public List<WebElement> getBenefitText() {
        return benefitText;
    }

    public WebElement getCentralMainHeader() {
        return centralMainHeader;
    }

    public WebElement getCentralMainHeaderText() {
        return centralMainHeaderText;
    }

    public WebElement getIFrame() {
        return iFrame;
    }

    public WebElement getEpamLogo() {
        return epamLogo;
    }

    public WebElement getSubHeaderText() {
        return subHeaderText;
    }

    public WebElement getEpamJdiGitHubLink() {
        return epamJdiGitHubLink;
    }

    public WebElement getLeftSection() {
        return leftSection;
    }

    public WebElement getFooter() {
        return footer;
    }

    public void switchToIFrame() {
        driver.switchTo().frame(iFrame);
    }
}
