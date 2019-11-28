package hw2.ex2;

import hw2.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.testng.asserts.*;

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

//        5	Click on "Service" subcategory in the header and check that drop down contains options
        driver.findElement(By.cssSelector(".dropdown-toggle")).click();
        List<WebElement>


    }
}
