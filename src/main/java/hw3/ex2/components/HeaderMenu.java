package hw3.ex2.components;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

public class HeaderMenu {
    private WebDriver driver;

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

    public HeaderMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
}
