package hw4;

import com.codeborne.selenide.*;
import hw3.*;
import org.testng.annotations.*;

public abstract class AbstractBaseTest implements TestData {

    @BeforeClass
    public void setUp() {
        Configuration.browser = Browsers.CHROME;
        Configuration.timeout = 1000;
        Configuration.startMaximized = true;
    }

}
