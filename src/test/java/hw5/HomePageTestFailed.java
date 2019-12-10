package hw5;

import hw3.*;
import hw3.ex1.steps.*;
import org.testng.annotations.*;

public class HomePageTestFailed extends AbstractBaseTest implements TestData {
    private ActionHomePageSteps actionSteps;
    private AssertionHomePageSteps assertSteps;

    @BeforeMethod
    @Override
    public void methodSetUp() {
        super.methodSetUp();
        actionSteps = new ActionHomePageSteps(driver);
        assertSteps = new AssertionHomePageSteps(driver);
    }

    @Test
    public void browserTitleTest() {
        actionSteps.open("HOME_PAGE_URL");
        assertSteps.browserTitleShouldBe(BROWSER_TITLE);
    }

    @Test
    public void loginTest() {
        actionSteps.open(HOME_PAGE_URL);
        actionSteps.login(USER_LOGIN, USER_PASSWORD);
        assertSteps.userNameShouldBe(USER_NAME);
    }

    @Test
    public void browserTitleAfterLoginTest() {
        actionSteps.open(HOME_PAGE_URL);
        actionSteps.login(USER_LOGIN, "Wr0ng P@$$w0rd");
        assertSteps.browserTitleShouldBe(BROWSER_TITLE);
    }

}