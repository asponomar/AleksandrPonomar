package hw1;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class SqrtTest extends BaseTest {

    @Test(dataProviderClass = CalculatorDataProvider.class, dataProvider = "Sqrt Data Provider", groups = "MultDivSqrtTest")
    public void sqtrTest(double a, double expected) {
        double actual = calculator.sqrt(a);
        assertEquals(actual, expected);
        System.out.println("Sqrt Test");
    }
}