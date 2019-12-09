package hw4.ex2;

import hw4.builders.*;
import org.testng.annotations.*;

import java.util.*;

public class MetalColorsTestDataProvider {

    @DataProvider(name = "MetalColorsTestDataProvider")
    public Object[][] MetalColorsDataProvider() {
        return new Object[][]{
                {TestData.testDataBuilder()
                        .setElements(Arrays.asList("Earth"))
                        .setColors("Yellow")
                        .setMetals("Gold")
                        .build()},

                {TestData.testDataBuilder()
                        .setSummary(Arrays.asList("3", "8"))
                        .setVegetables(Arrays.asList("Cucumber", "Tomato"))
                        .build()},

                {TestData.testDataBuilder()
                        .setSummary(Arrays.asList("3", "2"))
                        .setElements(Arrays.asList("Wind", "Fire", "Water"))
                        .setMetals("Bronze")
                        .setVegetables(Arrays.asList("Onion"))
                        .build()},

                {TestData.testDataBuilder()
                        .setSummary(Arrays.asList("6", "5"))
                        .setElements(Arrays.asList("Water"))
                        .setColors("Green")
                        .setMetals("Selen")
                        .setVegetables(Arrays.asList("Cucumber", "Tomato", "Onion", "Vegetables"))
                        .build()},

                {TestData.testDataBuilder()
                        .setElements(Arrays.asList("Fire"))
                        .setColors("Blue")
                        .setVegetables(Arrays.asList("Cucumber", "Tomato", "Vegetables"))
                        .build()},
        };

    }
}