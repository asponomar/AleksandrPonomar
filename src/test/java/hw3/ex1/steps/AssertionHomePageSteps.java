package hw3.ex1.steps;

import hw3.ex1.*;
import io.qameta.allure.*;
import org.openqa.selenium.*;

import java.util.*;
import java.util.stream.*;

import static org.testng.Assert.*;

public class AssertionHomePageSteps {
    private HomePage homePage;

    public AssertionHomePageSteps(WebDriver driver) {
        this.homePage = new HomePage(driver);
    }

    @Step("Browser title should be '{0}' on the Home Page")
    public void browserTitleShouldBe(String browserTitle) {
        assertEquals(homePage.getPageTitle(), browserTitle);
    }

    @Step("Username should be '{0}'")
    public void userNameShouldBe(String userName) {
        assertEquals(homePage.getUserNameText(), userName);
    }

    @Step("Header menu buttons should be '{0}'")
    public void headerSectionMenuButtonsShouldBe(List<String> headerSectionMenuButtons) {
        IntStream.range(0, headerSectionMenuButtons.size()).forEach(i -> {
            assertTrue(homePage.getHeaderSectionMenuButtons().get(i).isDisplayed());
            assertEquals(homePage.getHeaderSectionMenuButtons().get(i).getText(), headerSectionMenuButtons.get(i));
        });
    }

    @Step("Images should be displayed on the Home Page")
    public void imagesOnHomePageShouldBeDisplayed() {
        assertEquals(homePage.getHomePageImages().size(), 4);
        for (WebElement element : homePage.getHomePageImages()) {
            assertTrue(element.isDisplayed());
        }
    }

    @Step("Text under icons should be '{0}' on the Home Page")
    public void homePageUnderIconsTextShouldBe(List<String> underIconsText) {
        IntStream.range(0, underIconsText.size())
                .forEach(i -> assertEquals(homePage.getBenefitText().get(i).getText(), underIconsText.get(i)));
    }

    @Step("Central main header should be displayed on the Home Page")
    public void centralMainHeaderIsDisplayed() {
        assertTrue(homePage.getCentralMainHeader().isDisplayed());
    }

    @Step("Text under main header should be displayed on the Home Page")
    public void centralMainHeaderTextIsDisplayed() {
        assertTrue(homePage.getCentralMainHeaderText().isDisplayed());
    }

    @Step("Central main header should be '{0}' on the Home Page")
    public void centralMainHeaderShouldBe(String centralMainHeader) {
        assertEquals(homePage.getCentralMainHeader().getText(), centralMainHeader);
    }

    @Step("Text under main header should be '{0}' on the Home Page")
    public void centralMainHeaderTextShouldBe(String centralMainHeaderText) {
        assertEquals(homePage.getCentralMainHeaderText().getText(), centralMainHeaderText);
    }

    @Step("Frame should be displayed on the Home Page")
    public void iFrameIsDisplayed() {
        assertTrue(homePage.getIFrame().isDisplayed());
    }

    @Step("EPAM logo shoulde be displayed in the frame on the Home Page")
    public void epamLogoInIFrameIsDisplayed() {
        assertTrue(homePage.getEpamLogo().isDisplayed());
    }

    @Step("Subheader text should be displayed on the Home Page")
    public void subHeaderTextIsDisplayed() {
        assertTrue(homePage.getSubHeaderText().isDisplayed());
    }

    @Step("Subheader text should be '{0}' on the Home Page")
    public void subHeaderTextShouldBe(String subHeaderText) {
        assertEquals(homePage.getSubHeaderText().getText(), subHeaderText);
    }

    @Step("JDI Github link should be '{0}' on the Home Page")
    public void jDIGitHubLinkShouldBe(String link) {
        assertEquals(homePage.getEpamJdiGitHubLink().getAttribute("href"), link);
    }

    @Step("Left section should be displayed on the Home Page")
    public void leftSectionIsDisplayed() {
        assertTrue(homePage.getLeftSection().isDisplayed());
    }

    @Step("Footer should be displayed on the Home Page")
    public void footerIsDisplayed() {
        assertTrue(homePage.getFooter().isDisplayed());
    }

}
