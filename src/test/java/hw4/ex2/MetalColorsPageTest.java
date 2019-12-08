package hw4.ex2;

import hw4.*;
import hw4.components.*;
import org.testng.annotations.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;
import static org.testng.Assert.*;

public class MetalColorsPageTest extends AbstractBaseTest {
    private RightSection rightSection;
    private MetalsColorsPage metalsColorsPage;

    @BeforeMethod
    @Override
    public void beforeMethod() {
        super.beforeMethod();
        this.rightSection = new RightSection();
        this.metalsColorsPage = new MetalsColorsPage();
    }

    @Test(dataProviderClass = MetalColorsTestDataProvider.class, dataProvider = "MetalColorsTestDataProvider")
    public void metalColorsPageTest() {

        element("title").shouldHave(attribute("text", HOME_PAGE_TITLE));

        homePage.login(user);
        headerMenu.getUserName().shouldBe(text(user.getUserName()));

        headerMenu.getMetalsColorsLinkInDropdownMenu().click();
        assertEquals(url(), METAL_COLORS_URL);


    }
}
