package hw1;

import org.testng.annotations.*;

public class CalculatorDataProvider {

    @DataProvider(name = "Sum Data Provider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {2, 2, 4},
                {5, 0.2d, 5.2d},
                {10, -8, 2}
        };
    }

    @DataProvider(name = "Substract Data Provider")
    public Object[][] substractDataProvider() {
        return new Object[][]{
                {2, 2, 0},
                {5, 0, 5},
                {10, -8, 18}
        };
    }

    @DataProvider(name = "Multiply Data Provider")
    public Object[][] multiplyDataProvider() {
        return new Object[][]{
                {2, 2, 4},
                {5, 0, 0},
                {10, -8, -80}
        };
    }

    @DataProvider(name = "Divide Data Provider")
    public Object[][] divideDataProvider() {
        return new Object[][]{
                {2, 2, 1},
                {0, 5, 0},
                {-20.2d, 10.1d, -2.0d}
        };
    }

    @DataProvider(name = "Sqrt Data Provider")
    public Object[][] sqrtDataProvider() {
        return new Object[][]{
                {4, 2},
                {0, 0},
                {36, 6}
        };
    }
}
