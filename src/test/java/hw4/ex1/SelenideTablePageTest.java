package hw4.ex1;

import hw4.*;
import hw4.components.*;
import org.testng.annotations.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;
import static org.testng.Assert.*;

public class SelenideTablePageTest extends AbstractBaseTest {
    private RightSection rightSection;
    private TablePage tablePage;

    @BeforeMethod
    @Override
    public void beforeMethod() {
        super.beforeMethod();
        this.tablePage = new TablePage();
        this.rightSection = new RightSection();
    }

    @Test
    public void tablePageTest() {
        homePage.login(user);

//        7	Open through the header menu Service -> Table with pages
        headerMenu.getServiceHeaderMenuItem().click();
        headerMenu.getTableWithPagesServiceHeaderMenuItem().click();
        assertEquals(url(), PAGE_WITH_TABLE_URL);

//        8	Check that default value for “Show entries” dropdown is 5
        tablePage.getShowEntriesFiveValue().shouldBe(visible);

//        9	Assert that there is Right Section
        rightSection.getLogSideBar().is(exist);

//        10	Assert that there is Left Section
        leftSection.getNavigationSideBar().is(exist);

//        11	Select new value for the entries in the dropdown list
        tablePage.getShowEntriesDropdown().click();
        tablePage.getShowEntriesTenValue().click();
        tablePage.getShowEntriesTenValue().shouldBe(visible);

//        12	Assert that for the dropdown there is an individual log row and value is corresponded to the value of dropdown.
        rightSection.getLogSideBar().shouldBe(visible);
        rightSection.getLogList().get(0).shouldHave(text("Datatable Events: length, new value=10"));

//        13	Assert that in the table displayed corrected amount of entries
        elements(tablePage.getTableOnTablePageElements()).shouldHaveSize(10);

//        14	Type in “Search” text field
        tablePage.getTableSearchField().setValue("Custom");

//        15	Assert the table contains only records with Search field value
        tablePage.getTableOnTablePageElements()
                .forEach(tableElement -> tableElement.shouldHave(text("Custom")));

        headerMenu.getUserName().click();
        headerMenu.getLogOutButton().click();
    }

}



