package hw2.ex1;

import hw2.*;
import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.*;
import java.util.stream.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EpamJdiHomePageTest extends AbstractBaseTest {

    @Test
    public void epamJdiHomePageTest() {
//        1 Open test site by URL
        driver.get("https://epam.github.io/JDI/index.html");

//        2 Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

//        3 Perform login
        driver.findElement(By.id("user-icon")).click();
        driver.findElement(By.id("name")).sendKeys("epam");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("login-button")).click();

//        4	Assert User name in the left-top side of screen that user is loggined
        String expectedUserName = "PITER CHAILOVSKII";
        WebElement actualUserName = driver.findElement(By.id("user-name"));

        assertEquals(actualUserName.getText(), expectedUserName);

//        5 Assert Browser title
        assertEquals(driver.getTitle(), "Home Page");

//        6 Assert that there are 4 items on the header section are displayed and they have proper texts
        List<String> expectedHeaderSectionMenuButtons =
                Arrays.asList("HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS");
        List<WebElement> actualHeaderSectionMenuButtons = driver.findElements(By.cssSelector(".m-l8>li"));

        assertEquals(actualHeaderSectionMenuButtons.size(), expectedHeaderSectionMenuButtons.size());
        IntStream.range(0, actualHeaderSectionMenuButtons.size()).forEach(i -> {
            assertTrue(actualHeaderSectionMenuButtons.get(i).isDisplayed());
            assertEquals(actualHeaderSectionMenuButtons.get(i).getText(), expectedHeaderSectionMenuButtons.get(i));
        });

//        7 Assert that there are 4 images on the Index Page and they are displayed
        List<WebElement> actualImagesOnIndexPage = driver.findElements(By.cssSelector(".icons-benefit"));

        assertEquals(actualImagesOnIndexPage.size(), 4);
        actualImagesOnIndexPage.stream().map(WebElement::isDisplayed).forEach(Assert::assertTrue);

//        8	Assert that there are 4 texts on the Index Page under icons and they have proper text
        List<String> expectedBenefitText = Arrays.asList(
                "To include good practices\n" +
                        "and ideas from successful\n" +
                        "EPAM project",
                "To be flexible and\n" +
                        "customizable",
                "To be multiplatform",
                "Already have good base\n" +
                        "(about 20 internal and\n" +
                        "some external projects),\n" +
                        "wish to get more…");
        List<WebElement> actualBenefitText = driver.findElements(By.cssSelector(".benefit-txt"));

        assertEquals(actualBenefitText.size(), expectedBenefitText.size());
        IntStream.range(0, expectedBenefitText.size())
                .forEach(i -> assertEquals(actualBenefitText.get(i).getText(), expectedBenefitText.get(i)));

//        9	Assert a text of the main headers
        String expectedCentralMainHeader = "EPAM FRAMEWORK WISHES…";
        String expectedCentralMainHeaderText = "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, " +
                "SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. UT ENIM AD MINIM VENIAM, " +
                "QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE " +
                "DOLOR IN REPREHENDERIT IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.";
        WebElement actualCentralMainHeader = driver.findElement(By.name("main-title"));
        WebElement actualCentralMainHeaderText = driver.findElement(By.name("jdi-text"));

        assertTrue(actualCentralMainHeader.isDisplayed() && actualCentralMainHeaderText.isDisplayed());
        assertEquals(actualCentralMainHeader.getText(), expectedCentralMainHeader);
        assertEquals(actualCentralMainHeaderText.getText(), expectedCentralMainHeaderText);

//        10	Assert that there is the iframe in the center of page
        assertTrue(driver.findElement(By.id("iframe")).isDisplayed());

//        11	Switch to the iframe and check that there is Epam logo in the left top conner of iframe
        driver.switchTo().frame("iframe");
        assertTrue(driver.findElement(By.id("epam_logo")).isDisplayed());

//        12	Switch to original window back
        driver.switchTo().defaultContent();

//        13	Assert a text of the sub header
        String expectedSubHeaderText = "JDI GITHUB";
        WebElement actualSubHeaderText = driver.findElement(By.xpath("//*[@class='text-center']"));

        assertTrue(actualSubHeaderText.isDisplayed());
        assertEquals(actualSubHeaderText.getText(), expectedSubHeaderText);

//        14	Assert that JDI GITHUB is a link and has a proper URL
        String expectedSubHeaderLink = "https://github.com/epam/JDI";
        WebElement actualSubHeaderLink = driver.findElement(By.linkText("JDI GITHUB"));

        assertEquals(actualSubHeaderLink.getAttribute("href"), expectedSubHeaderLink);

//        15	Assert that there is Left Section
        assertTrue(driver.findElement(By.id("mCSB_1")).isDisplayed());

//        16	Assert that there is Footer
        assertTrue(driver.findElement(By.cssSelector(".footer-bg")).isDisplayed());

//        17	Close Browser
//      Browser is closing in AbstractBaseTest.java
    }
}

