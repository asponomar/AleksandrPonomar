package hw3.ex1.steps;

import hw3.ex1.*;
import org.openqa.selenium.*;

import java.util.*;
import java.util.stream.*;

import static org.testng.Assert.*;

public class AssertionHomePageSteps {
    private HomePage homePage;

    public AssertionHomePageSteps(WebDriver driver) {
        this.homePage = new HomePage(driver);
    }

    public void browserTitleShouldBe(String browserTitle) {
        assertEquals(homePage.getPageTitle(), browserTitle);
    }

    public void userNameShouldBe(String userName) {
        assertEquals(homePage.getUserNameText(), userName);
    }

    public void headerSectionMenuButtonsShouldBe(List<String> headerSectionMenuButtons) {
        IntStream.range(0, headerSectionMenuButtons.size()).forEach(i -> {
            assertTrue(homePage.getHeaderSectionMenuButtons().get(i).isDisplayed());
            assertEquals(homePage.getHeaderSectionMenuButtons().get(i).getText(), headerSectionMenuButtons.get(i));
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
        assertTrue(homePage.getLeftSection().isDisplayed());
    }

    public void footerIsDisplayed() {
        assertTrue(homePage.getFooter().isDisplayed());
    }

}
