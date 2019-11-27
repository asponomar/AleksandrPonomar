package hw1;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class SumTest extends BaseTest {

    @Test(dataProviderClass = CalculatorDataProvider.class, dataProvider = "Sum Data Provider", groups = "AddSubTest")
    public void sumTest(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        assertEquals(actual, expected);
        System.out.println("Sum Test");
    }
}
