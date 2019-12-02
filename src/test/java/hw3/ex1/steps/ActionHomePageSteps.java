package hw3.ex1.steps;

import hw3.ex1.*;
import org.openqa.selenium.*;

public class ActionHomePageSteps {
    private HomePage homePage;

    public ActionHomePageSteps(WebDriver driver) {
        this.homePage = new HomePage(driver);
    }

    public void open(String url) {
        homePage.open(url);
    }

    public void login(final String userName, final String userPassword) {
        homePage.userIconClick();
        homePage.setUserLoginTextField(userName);
        homePage.setUserPasswordTextField(userPassword);
        homePage.loginButtonClick();
    }

    public void swithToIFrame() {
        homePage.switchToIFrame();
    }

}
