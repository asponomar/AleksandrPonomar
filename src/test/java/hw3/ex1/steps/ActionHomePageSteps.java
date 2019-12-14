package hw3.ex1.steps;

import hw3.ex1.*;
import io.qameta.allure.*;
import org.openqa.selenium.*;

public class ActionHomePageSteps {
    private HomePage homePage;

    public ActionHomePageSteps(WebDriver driver) {
        this.homePage = new HomePage(driver);
    }

    @Step("I open '{0}' URL")
    public void open(String url) {
        homePage.open(url);
    }

    @Step("I login as '{0}' with password '{1}'")
    public void login(final String userName, final String userPassword) {
        homePage.userIconClick();
        homePage.setUserLoginTextField(userName);
        homePage.setUserPasswordTextField(userPassword);
        homePage.loginButtonClick();
    }

    @Step("I switch to frame on the Home Page")
    public void swithToIFrame() {
        homePage.switchToIFrame();
    }

    @Step("I switch to parent frame")
    public void switchToParentFrame() {
        homePage.switchToParentFrame();
    }

}
