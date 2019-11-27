package hw1;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class SubstractTest extends BaseTest {

    @Test(dataProviderClass = CalculatorDataProvider.class, dataProvider = "Substract Data Provider", groups = "AddSubTest")
    public void substractTest(double a, double b, double expected) {
        double actual = calculator.sub(a, b);
        assertEquals(actual, expected);
        System.out.println("Substract Test");
    }
}
