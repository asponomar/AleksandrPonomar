package hw4.builders;

import java.util.*;

public class TestData {
    private List<String> summary;
    private List<String> elements;
    private String colors;
    private String metals;
    private List<String> vegetables;

    private TestData(List<String> summary, List<String> elements, String colors, String metals, List<String> vegetables) {
        this.summary = summary;
        this.elements = elements;
        this.colors = colors;
        this.metals = metals;
        this.vegetables = vegetables;
    }

    public List<String> getSummary() {
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

    public List<String> testDataLog() {
        List<String> result = new ArrayList<>();
        if (summary != null) {
            int summaryResult = summary.stream().mapToInt(Integer::getInteger).sum();
            result.add("Summary: " + summaryResult);
        }
        if (elements != null) {
            StringBuilder elementsResult = new StringBuilder();
            for (String el : elements) elementsResult.append(el).append(" ");
            elementsResult.toString().trim().replace(" ", ", ");
            result.add("Elements: " + elementsResult);
        }
        if (colors != null) result.add("Color: " + colors);
        if (metals != null) result.add("Metal: " + metals);
        if (vegetables != null) {
            StringBuilder vegetablesResult = new StringBuilder();
            for (String veg : vegetables) vegetablesResult.append(veg).append(" ");
            vegetablesResult.toString().trim().replace(" ", ", ");
            result.add("Vegetables: " + vegetablesResult);
        }
        return result;
    }

    public static class TestDataBuilder {
        private List<String> summary;
        private List<String> elements;
        private String colors;
        private String metals;
        private List<String> vegetables;

        private TestDataBuilder() {
        }

        public TestDataBuilder setSummary(List<String> summary) {
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
