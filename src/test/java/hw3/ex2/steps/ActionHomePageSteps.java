package hw3.ex2.steps;

import hw3.ex2.*;
import hw3.ex2.components.*;
import org.openqa.selenium.*;

public class ActionHomePageSteps {
    private HomePageComposite homePage;
    private HeaderMenu headerMenu;

    public ActionHomePageSteps(WebDriver driver) {
        this.homePage = new HomePageComposite(driver);
        this.headerMenu = new HeaderMenu(driver);
    }

    public void open(String url) {
        homePage.open(url);
    }

    public void login(final String userName, final String userPassword) {
        headerMenu.userIconClick();
        headerMenu.setUserLoginTextField(userName);
        headerMenu.setUserPasswordTextField(userPassword);
        headerMenu.loginButtonClick();
    }

    public void swithToIFrame() {
        homePage.switchToIFrame();
    }

}
