package hw3.ex2;

import hw3.*;
import hw3.ex2.steps.*;
import org.testng.annotations.*;

public class HomePageCompositeTest extends AbstractBaseTest implements TestData {
    private ActionHomePageSteps actionSteps;
    private AssertionHomePageSteps assertSteps;

    @BeforeMethod
    @Override
    public void methodSetUp() {
        super.methodSetUp();
        actionSteps = new ActionHomePageSteps(driver);
        assertSteps = new AssertionHomePageSteps(driver);
    }

    //        2 Assert Browser title
    @Test
    public void BrowserTitleTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.browserTitleShouldBe(BROWSER_TITLE);
    }

    @Test
    public void loginTest() {
        actionSteps.open(HOME_PAGE_URL);
        actionSteps.login(USER_LOGIN, USER_PASSWORD);
        assertSteps.userNameShouldBe(USER_NAME);
    }

    @Test
    public void BrowserTitleAfterLoginTest() {
        actionSteps.open(HOME_PAGE_URL);
        actionSteps.login(USER_LOGIN, USER_PASSWORD);
        assertSteps.browserTitleShouldBe(BROWSER_TITLE);
    }

    @Test
    public void headerSectionMenuButtonsTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.headerSectionMenuButtonsShouldBe(HEADER_SECTION_MENU_BUTTONS);
    }

    @Test
    public void homePageTestImages() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.imagesOnHomePageShouldBeDisplayed();
    }

    @Test
    public void homePageUnderIconsTextTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.homePageUnderIconsTextShouldBe(UNDER_ICONS_TEXT);
    }

    @Test
    public void centralMainHeaderIsDisplayed() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.centralMainHeaderIsDisplayed();
    }

    @Test
    public void centralMainHeaderTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.centralMainHeaderShouldBe(CENTRAL_MAIN_HEADER);
    }

    @Test
    public void centralMainHeaderTextIsDisplayed() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.centralMainHeaderTextIsDisplayed();
    }

    @Test
    public void centralMainHeaderTextTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.centralMainHeaderTextShouldBe(CENTRAL_MAIN_HEADER_TEXT);
    }

    @Test
    public void iframeIsDisplayedTest() {
        actionSteps.open(HOME_PAGE_URL);
        actionSteps.login(USER_LOGIN, USER_PASSWORD);
        actionSteps.swithToIFrame();
        assertSteps.iFrameIsDisplayed();
    }

    @Test
    public void epamLogoInIFrameIsDisplayedTest() {
        actionSteps.open(HOME_PAGE_URL);
        actionSteps.login(USER_LOGIN, USER_PASSWORD);
        actionSteps.swithToIFrame();
        assertSteps.epamLogoInIFrameIsDisplayed();
    }

    @Test
    public void subHeaderTextIsDisplayedTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.subHeaderTextIsDisplayed();
    }

    @Test
    public void subHeaderTextShouldBe() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.subHeaderTextShouldBe(SUB_HEADER_TEXT);
    }

    @Test
    public void jDIGitHubIsALinkTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.jDIGitHubLinkShouldBe(JDI_GITHUB_LINK);
    }

    @Test
    public void leftSectionIsDisplayedTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.leftSectionIsDisplayed();
    }

    @Test
    public void footerIsDisplayedTest() {
        actionSteps.open(HOME_PAGE_URL);
        assertSteps.footerIsDisplayed();
    }

}

