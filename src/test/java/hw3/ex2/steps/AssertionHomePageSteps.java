package hw3.ex2.steps;

import hw3.ex2.*;
import hw3.ex2.components.*;
import org.openqa.selenium.*;

import java.util.*;
import java.util.stream.*;

import static org.testng.Assert.*;

public class AssertionHomePageSteps {
    private HomePageComposite homePage;
    private HeaderMenu headerMenu;
    private NavigationSideBar navigationSideBar;
    private Footer footer;

    public AssertionHomePageSteps(WebDriver driver) {
        this.homePage = new HomePageComposite(driver);
        this.headerMenu = new HeaderMenu(driver);
        this.navigationSideBar = new NavigationSideBar(driver);
        this.footer = new Footer(driver);
    }

    public void browserTitleShouldBe(String browserTitle) {
        assertEquals(homePage.getPageTitle(), browserTitle);
    }

    public void userNameShouldBe(String userName) {
        assertEquals(headerMenu.getUserNameText(), userName);
    }

    public void headerSectionMenuButtonsShouldBe(List<String> headerSectionMenuButtons) {
        IntStream.range(0, headerSectionMenuButtons.size()).forEach(i -> {
            assertTrue(headerMenu.getHeaderSectionMenuButtons().get(i).isDisplayed());
            assertEquals(headerMenu.getHeaderSectionMenuButtons().get(i).getText(), headerSectionMenuButtons.get(i));
        });
    }

    public void imagesOnHomePageShouldBeDisplayed() {
        assertEquals(homePage.getHomePageImages().size(), 4);
        for (WebElement element : homePage.getHomePageImages()) {
            assertTrue(element.isDisplayed());
        }
    }

    public void homePageUnderIconsTextShouldBe(List<String> underIconsText) {
        IntStream.range(0, underIconsText.size())
                .forEach(i -> assertEquals(homePage.getBenefitText().get(i).getText(), underIconsText.get(i)));
    }

    public void centralMainHeaderIsDisplayed() {
        assertTrue(homePage.getCentralMainHeader().isDisplayed());
    }

    public void centralMainHeaderTextIsDisplayed() {
        assertTrue(homePage.getCentralMainHeaderText().isDisplayed());
    }

    public void centralMainHeaderShouldBe(String centralMainHeader) {
        assertEquals(homePage.getCentralMainHeader().getText(), centralMainHeader);
    }

    public void centralMainHeaderTextShouldBe(String centralMainHeaderText) {
        assertEquals(homePage.getCentralMainHeaderText().getText(), centralMainHeaderText);
    }

    public void iFrameIsDisplayed() {
        assertTrue(homePage.getIFrame().isDisplayed());
    }

    public void epamLogoInIFrameIsDisplayed() {
        assertTrue(homePage.getEpamLogo().isDisplayed());
    }

    public void subHeaderTextIsDisplayed() {
        assertTrue(homePage.getSubHeaderText().isDisplayed());
    }

    public void subHeaderTextShouldBe(String subHeaderText) {
        assertEquals(homePage.getSubHeaderText().getText(), subHeaderText);
    }

    public void jDIGitHubLinkShouldBe(String link) {
        assertEquals(homePage.getEpamJdiGitHubLink().getAttribute("href"), link);
    }

    public void leftSectionIsDisplayed() {
        assertTrue(navigationSideBar.getLeftSection().isDisplayed());
    }

    public void footerIsDisplayed() {
        assertTrue(footer.getFooter().isDisplayed());
    }

}
