package hw4;

import com.codeborne.selenide.*;
import hw3.*;
import hw4.ex1.*;
import org.testng.annotations.*;

import java.util.stream.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest extends AbstractBaseTest implements TestData {

    @Test
    public void browserTitleTest() {
        element("title").shouldHave(attribute("text", BROWSER_TITLE));
    }

    @Test
    public void loginTest() {
        open(HOME_PAGE_URL);
        HomePage homePage = new HomePage();
        homePage.login(USER_LOGIN, USER_PASSWORD);
        element(homePage.getUserName().shouldBe(text(USER_NAME)));
    }

    @Test
    public void serviceDropdownMenuOptionsTest() {
        open(HOME_PAGE_URL);
        HomePage homePage = new HomePage();
        homePage.login(USER_LOGIN, USER_PASSWORD);
        element(homePage.getServiceDropdownButton()).click();
        IntStream.range(0, homePage.getServiceDropdownMenu().size())
                .forEach(i -> homePage.getServiceDropdownMenu().get(i).getText()
                        .equals(SERVICE_DROPDOWN_MENU.get(i)));

    }


}
