package hw2.ex2;

import hw2.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import org.testng.asserts.*;

import java.util.*;
import java.util.stream.*;

import static org.testng.Assert.assertEquals;

public class EpamJdiHomePageSoftAssertTest extends AbstractBaseTest {

    @Test
    public void epamJdiHomePageSoftAsserttest() {
        SoftAssert softAssert = new SoftAssert();

        //        1 Open test site by URL
        driver.get("https://epam.github.io/JDI/index.html");

//        2 Assert Browser title
        softAssert.assertEquals(driver.getTitle(), "Home Page");

//        3 Perform login
        driver.findElement(By.id("user-icon")).click();
        driver.findElement(By.id("name")).sendKeys("epam");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("login-button")).click();

//        4	Assert User name in the left-top side of screen that user is loggined
        String expectedUserName = "PITER CHAILOVSKII";
        WebElement actualUserName = driver.findElement(By.id("user-name"));

        softAssert.assertEquals(actualUserName.getText(), expectedUserName);

//        5	Click on "Service" subcategory in the header and check that drop down contains option
        List<String> expectedServiceDropDownMenu =
                Arrays.asList("SUPPORT", "DATES", "SEARCH", "COMPLEX TABLE", "SIMPLE TABLE",
                        "USER TABLE", "TABLE WITH PAGES", "DIFFERENT ELEMENTS", "PERFORMANCE");
        List<WebElement> actualServiceDropdownMenu = driver.findElements(By.cssSelector(".dropdown-menu>li"));

        driver.findElement(By.cssSelector(".dropdown-toggle")).click();
        IntStream.range(0, actualServiceDropdownMenu.size()).forEach(i -> {
            softAssert.assertTrue(actualServiceDropdownMenu.get(i).isDisplayed());
            softAssert.assertEquals(actualServiceDropdownMenu.get(i).getText(), expectedServiceDropDownMenu.get(i));
        });

//        6	Click on Service subcategory in the left section and check that drop down contains options
        List<String> expectedServiceSideBarMenu =
                Arrays.asList("SUPPORT", "DATES", "COMPLEX TABLE", "SIMPLE TABLE", "SEARCH",
                        "USER TABLE", "TABLE WITH PAGES", "DIFFERENT ELEMENTS", "PERFORMANCE");
        List<WebElement> actualServiceSideBarMenu = driver
                .findElement(By.cssSelector(".sidebar-menu"))
                .findElement(By.xpath("//*[contains(text(),'Service')]"))
                .findElements(By.tagName("li"));
        IntStream.range(0, actualServiceSideBarMenu.size()).forEach(i -> {
            System.out.println(actualServiceSideBarMenu.get(i).getText());
            softAssert.assertTrue(actualServiceSideBarMenu.get(i).isDisplayed());
            softAssert.assertEquals(actualServiceSideBarMenu.get(i).getText(), expectedServiceSideBarMenu.get(i));
        });

//        7	Open through the header menu Service -> Different Elements Page
        driver.get("https://epam.github.io/JDI/index.html");
        driver.findElement(By.cssSelector(".dropdown-toggle")).click();
        driver.findElement(By.linkText("DIFFERENT ELEMENTS")).click();
        softAssert.assertEquals(driver.getCurrentUrl(), "https://epam.github.io/JDI/different-elements.html");

//        8	Check interface on Different elements page, it contains all needed elements
//        4 checkboxes, 4 radios, 1 dropdown, 2 buttons
        List<WebElement> actualCheckboxes = driver.findElements(By.className("label-checkbox"));
        softAssert.assertEquals(actualCheckboxes.size(), 4);

        List<WebElement> actualRadios = driver.findElements(By.className("label-radio"));
        softAssert.assertEquals(actualRadios.size(), 4);

        WebElement actualColorsDropDownMenu = driver.findElement(By.className("colors"));
        softAssert.assertTrue(actualColorsDropDownMenu.isDisplayed());

        WebElement actualDefaultButton = driver.findElement(By.name("Default Button"));
        softAssert.assertTrue(actualDefaultButton.isDisplayed());

        WebElement actualButton = driver.findElement(By.xpath("//input[@class='uui-button']"));
        softAssert.assertTrue(actualButton.isDisplayed());

//        9	Assert that there is Right Section
        WebElement rightSection = driver.findElement(By.name("log-sidebar"));
        softAssert.assertTrue(rightSection.isDisplayed());

//        10	Assert that there is Left Section
        WebElement leftSection = driver.findElement(By.cssSelector("#mCSB_1"));
        softAssert.assertTrue(leftSection.isDisplayed());

//        11	Select checkboxes Water, Wind
        WebElement waterCheckbox = driver.findElement(By.cssSelector(".label-checkbox:nth-child(1)>input:nth-child(1)"));
        WebElement windCheckbox = driver.findElement(By.cssSelector(".label-checkbox:nth-child(3)>input:nth-child(1)"));
        waterCheckbox.click();
        windCheckbox.click();

//        12	Assert that for each checkbox there is an individual log row and value is corresponded to the status of checkbox.
        softAssert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Wind: condition changed to true')]")).isDisplayed());
        softAssert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Water: condition changed to true')]")).isDisplayed());
        softAssert.assertTrue(waterCheckbox.isSelected());
        softAssert.assertTrue(windCheckbox.isSelected());


//        13	Select radio	Selen
        WebElement selenRadioButton = driver.findElement(By.cssSelector(".label-radio:nth-child(4)>input:nth-child(1)"));
        selenRadioButton.click();

//        14	Assert that for radiobutton there is a log row and value is corresponded to the status of radiobutton.
        softAssert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'metal: value changed to  Selen')]")).isDisplayed());
        softAssert.assertTrue(selenRadioButton.isSelected());

//        15	Select in dropdown	Yellow
        actualColorsDropDownMenu.click();
        actualColorsDropDownMenu.findElement(By.xpath("//*[contains(text(),'Yellow')]")).click();
        actualColorsDropDownMenu.click();

//        16	Assert that for dropdown there is a log row and value is corresponded to the selected value.
        softAssert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Colors: value changed to Yellow')]")).isDisplayed());

        Select selectColor = new Select(driver.findElement(By.xpath("//select[@class='uui-form-element']")));
        softAssert.assertEquals(selectColor.getFirstSelectedOption().getText(), "Yellow");

//        17	Unselect and assert checkboxes	Water, Wind
        waterCheckbox.click();
        windCheckbox.click();
        softAssert.assertFalse(waterCheckbox.isSelected());
        softAssert.assertFalse(windCheckbox.isSelected());

//        18	Assert that for each checkbox there is an individual log row and value is corresponded to the status of checkbox.
        List<WebElement> logRow = new ArrayList<>();
        List<WebElement> checkboxRow = driver.findElements(By.className("label-checkbox"));

//        Actually I don't like this part and will think how to refactor it but not today
        IntStream.range(0, checkboxRow.size()).forEach(i -> {
            int elementNumber = i + 1;
            String elementNumberSelector = ".label-checkbox:nth-child(" + elementNumber + ")>input";

            checkboxRow.get(i).click();
            softAssert.assertTrue(driver.findElement(By.cssSelector(elementNumberSelector)).isSelected());

            logRow.add(driver.findElement(By.xpath("//*[contains(text(),'condition changed to')]")));
            softAssert.assertTrue(logRow.get(logRow.size() - 1).getText()
                    .contains(checkboxRow.get(i).getText())
                    && logRow.get(logRow.size() - 1).getText().contains("true"));

            checkboxRow.get(i).click();
            softAssert.assertFalse(driver.findElement(By.cssSelector(elementNumberSelector)).isSelected());

            logRow.add(driver.findElement(By.xpath("//*[contains(text(),'condition changed to')]")));
            softAssert.assertTrue(logRow.get(logRow.size() - 1).getText()
                    .contains(checkboxRow.get(i).getText())
                    && logRow.get(logRow.size() - 1).getText().contains("false"));
        });

        softAssert.assertAll();
    }
}
