package hw4.ex1;

import com.codeborne.selenide.*;
import org.openqa.selenium.support.*;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.page;

public class HomePage extends AbstractBasePage {

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


    public HomePage() {
        page(this);
    }

    public void login(final String username, final String password) {
        userIcon.click();
        userLoginTextField.sendKeys(username);
        userPasswordTextField.sendKeys(password);
        loginButton.click();
    }

    public SelenideElement getUserName() {
        return userName;
    }
}
