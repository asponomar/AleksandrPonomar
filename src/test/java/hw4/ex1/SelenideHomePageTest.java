package hw4.ex1;

import com.codeborne.selenide.*;
import hw4.*;
import org.testng.annotations.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideHomePageTest extends AbstractBaseTest {

    @Test
    public void selenideHomePageTest() {

//        1	Open test site by URL
//        2	Assert Browser title
        element("title").shouldHave(attribute("text", HOME_PAGE_TITLE));

//        3	Perform login
        homePage.login(user);

//        4	Assert User name in the left-top side of screen that user is loggined
        headerMenu.getUserName().shouldBe(text(user.getUserName()));

//        5	Click on "Service" subcategory in the header and check that drop down contains options
        headerMenu.getServiceHeaderMenuItem().click();
        elements(headerMenu.getServiceHeaderDropdownMenu())
                .shouldHave(CollectionCondition.texts(SERVICE_DROPDOWN_MENU));

//        6	Click on Service subcategory in the left section and check that drop down contains options
        leftSection.getServiceSideBarMenuItem().click();
        elements(leftSection.getServiceSideBarMenuItemSubMenu())
                .shouldHave(CollectionCondition.texts(SERVICE_LEFTSIDEBAR_MENU));

        headerMenu.getUserName().click();
        headerMenu.getLogOutButton().click();
    }
}