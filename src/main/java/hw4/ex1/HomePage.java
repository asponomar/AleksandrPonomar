package hw4.ex1;

import hw4.components.*;
import hw4.builders.*;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private HeaderMenu headerMenu = new HeaderMenu();

    public HomePage() {
        page(this);
    }

    public void login(User user) {
        headerMenu.userIconClick();
        headerMenu.setUserLoginTextField(user.getUserLogin());
        headerMenu.setUserPasswordTextField(user.getUserPassword());
        headerMenu.loginButtonClick();
    }

}
