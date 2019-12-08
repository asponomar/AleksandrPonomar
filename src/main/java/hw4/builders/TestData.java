package hw4.builders;

import java.util.*;

public class TestData {
    private List<Integer> summary;
    private List<String> elements;
    private String colors;
    private String metals;
    private List<String> vegetables;

    private TestData(List<Integer> summary, List<String> elements, String colors, String metals, List<String> vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.colors = colors;
        this.metals = metals;
        this.vegetables = vegetables;
    }

    public List<Integer> getSummary() {
        return summary;
    }

    public List<String> getElements() {
        return elements;
    }

    public String getColors() {
        return colors;
    }

    public String getMetals() {
        return metals;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public static TestDataBuilder testDataBuilder() {
        return new TestDataBuilder();
    }

    public static class TestDataBuilder {
        private List<Integer> summary;
        private List<String> elements;
        private String colors;
        private String metals;
        private List<String> vegetables;

        private TestDataBuilder() {
        }

        public TestDataBuilder setSummary(List<Integer> summary) {
            this.summary = summary;
            return this;
        }

        public TestDataBuilder setElements(List<String> elements) {
            this.elements = elements;
            return this;
        }

        public TestDataBuilder setColors(String colors) {
            this.colors = colors;
            return this;
        }

        public TestDataBuilder setMetals(String metals) {
            this.metals = metals;
            return this;
        }

        public TestDataBuilder setVegetables(List<String> vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public TestData build() {
            return new TestData(this.summary, this.elements, this.colors, this.metals, this.vegetables);
        }
    }
}
