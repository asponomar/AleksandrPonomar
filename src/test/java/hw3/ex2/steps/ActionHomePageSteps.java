package hw3.ex2.steps;

import hw3.ex2.*;
import hw3.ex2.components.*;
import io.qameta.allure.*;
import org.openqa.selenium.*;

public class ActionHomePageSteps {
    private HomePageComposite homePage;
    private HeaderMenu headerMenu;

    public ActionHomePageSteps(WebDriver driver) {
        this.homePage = new HomePageComposite(driver);
        this.headerMenu = new HeaderMenu(driver);
    }

    @Step("I open '{0}' URL")
    public void open(String url) {
        homePage.open(url);
    }

    @Step("I login as '{0}' with password '{1}'")
    public void login(final String userName, final String userPassword) {
        headerMenu.userIconClick();
        headerMenu.setUserLoginTextField(userName);
        headerMenu.setUserPasswordTextField(userPassword);
        headerMenu.loginButtonClick();
    }

    @Step("I switch to frame on the Home Page")
    public void swithToIFrame() {
        homePage.switchToIFrame();
    }

}
