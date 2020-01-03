package hw6.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import hw6.WebDriverSingleton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CucumberHooks {

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverSingleton.INSTANCE.setDriver(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(7000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(9000, TimeUnit.MILLISECONDS);
    }

    @After
    public void tearDown() {
        WebDriverSingleton.INSTANCE.getDriver().close();
    }
}
