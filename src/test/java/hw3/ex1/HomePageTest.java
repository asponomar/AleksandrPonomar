package hw3.ex1;

import hw3.*;
import hw3.ex1.steps.*;
import hw5.*;
import io.qameta.allure.*;
import io.qameta.allure.testng.*;
import org.testng.annotations.*;

@Listeners({AllureTestNg.class, AttachmentListener.class})
public class HomePageTest extends AbstractBaseTest implements TestData {
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
    @Story("Two passed tests")
    @Test(testName = "Home Page passed steps test")
    @Severity(SeverityLevel.CRITICAL)
    public void homepageTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.browserTitleShouldBe(BROWSER_TITLE);

        actionSteps.login(USER_LOGIN, USER_PASSWORD);
        assertSteps.userNameShouldBe(USER_NAME);

        assertSteps.browserTitleShouldBe(BROWSER_TITLE);

        assertSteps.headerSectionMenuButtonsShouldBe(HEADER_SECTION_MENU_BUTTONS);

        assertSteps.imagesOnHomePageShouldBeDisplayed();
        assertSteps.homePageUnderIconsTextShouldBe(UNDER_ICONS_TEXT);

        assertSteps.centralMainHeaderIsDisplayed();
        assertSteps.centralMainHeaderShouldBe(CENTRAL_MAIN_HEADER);
        assertSteps.centralMainHeaderTextIsDisplayed();
        assertSteps.centralMainHeaderTextShouldBe(CENTRAL_MAIN_HEADER_TEXT);

        actionSteps.swithToIFrame();
        assertSteps.iFrameIsDisplayed();
        assertSteps.epamLogoInIFrameIsDisplayed();
        actionSteps.switchToParentFrame();

        assertSteps.subHeaderTextIsDisplayed();
        assertSteps.subHeaderTextShouldBe(SUB_HEADER_TEXT);
        assertSteps.jDIGitHubLinkShouldBe(JDI_GITHUB_LINK);

        assertSteps.leftSectionIsDisplayed();
        assertSteps.footerIsDisplayed();
    }

}

