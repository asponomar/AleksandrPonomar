package hw5;

import hw3.*;
import hw3.ex1.steps.*;
import io.qameta.allure.*;
import io.qameta.allure.testng.*;
import org.testng.annotations.*;

@Listeners({AllureTestNg.class, AttachmentListener.class})
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

    @Feature("Home page tests")
    @Story("And one failed test")
    @Test(testName = "Home Page failed test")
    @Severity(SeverityLevel.BLOCKER)
    public void browserTitleTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.browserTitleShouldBe(BROWSER_TITLE);

        actionSteps.login(USER_LOGIN, "Wr0ng P@$$w0rd");
        assertSteps.userNameShouldBe(USER_NAME);
        assertSteps.browserTitleShouldBe(BROWSER_TITLE);
    }

}