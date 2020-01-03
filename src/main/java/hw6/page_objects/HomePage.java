package hw6.page_objects;

import hw4.builders.User;
import hw4.components.HeaderMenu;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.page;

public class HomePage extends AbstractBasePage {
    private HeaderMenu headerMenu = new HeaderMenu();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void login(User user) {
        headerMenu.userIconClick();
        headerMenu.setUserLoginTextField(user.getUserLogin());
        headerMenu.setUserPasswordTextField(user.getUserPassword());
        headerMenu.loginButtonClick();
    }

    public void logout() {
        headerMenu.getUserName().click();
        headerMenu.getLogOutButton().click();
    }

}
