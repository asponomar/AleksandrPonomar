package hw1;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class DivideTest extends BaseTest {

    @Test(dataProviderClass = CalculatorDataProvider.class, dataProvider = "Divide Data Provider", groups = "MultDivSqrtTest")
    public void divideTest(double a, double b, double expected) {
        double actual = calculator.div(a, b);
        assertEquals(actual, expected);
        System.out.println("Division Test");
    }
}
