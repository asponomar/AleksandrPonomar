package hw1;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class MultiplyTest extends BaseTest {

    @Test(dataProviderClass = CalculatorDataProvider.class, dataProvider = "Multiply Data Provider", groups = "MultDivSqrtTest")
    public void multiplyTest(double a, double b, double expected) {
        double actual = calculator.mult(a, b);
        assertEquals(actual, expected);
        System.out.println("Multiply Test");
    }
}
