package hw1;

import com.epam.tat.module4.*;
import org.testng.annotations.*;

public class BaseTest {
    protected Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        this.calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        calculator = null;
    }
}
