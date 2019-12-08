package hw4;

import com.codeborne.selenide.*;
import hw4.builders.*;
import hw4.components.*;
import hw4.ex1.*;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public abstract class AbstractBaseTest implements TestDataConstants {
    protected HomePage homePage;
    protected HeaderMenu headerMenu;
    protected LeftSection leftSection;
    protected User user;

    @BeforeTest
    public void setUp() {
        Configuration.browser = Browsers.CHROME;
        Configuration.timeout = 1000;
        Configuration.startMaximized = true;
    }

    @BeforeMethod
    public void beforeMethod() {
        open(HOME_PAGE_URL);
        this.homePage = new HomePage();
        this.headerMenu = new HeaderMenu();
        this.leftSection = new LeftSection();
        user = User.createUserFromPropertyFile(PROPERTY_FILE_PATH);
    }

}
