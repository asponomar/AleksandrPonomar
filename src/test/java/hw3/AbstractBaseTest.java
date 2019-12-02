package hw3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public abstract class AbstractBaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void suiteSetUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void methodSetUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        driver.manage().timeouts().pageLoadTimeout(7000, TimeUnit.MILLISECONDS);
//        driver.manage().timeouts().setScriptTimeout(9000, TimeUnit.MILLISECONDS);
    }


    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
