package hw4.ex2.steps;

import com.codeborne.selenide.*;
import hw4.builders.*;
import hw4.ex1.*;
import hw4.ex2.*;

public class ActionSteps extends AbstractBaseSteps {
    private HomePage homePage = new HomePage();
    private MetalsColorsPage metalsColorsPage = new MetalsColorsPage();


    public void login(User user) {
        homePage.login(user);
    }

    public void logout() {
        homePage.logout();
    }

    public void goToMetalColorsPage() {
        headerMenu.getMetalsColorsLinkInDropdownMenu().click();
    }

    public void chooseSummaryItems(TestData testData) {
        if (testData.getSummary() != null) {
            for (String summaryItem : testData.getSummary()) {
                metalsColorsPage.getSummaryRadioButtons()
                        .stream()
                        .filter(summaryRadioButton -> summaryRadioButton.getText()
                                .equals(summaryItem)).forEach(SelenideElement::click);
            }
        }
    }

    public void chooseElements(TestData testData) {
        if (testData.getElements() != null) {
            testData.getElements().forEach(elementItem -> {
                metalsColorsPage.getElementCheckBoxes()
                        .stream()
                        .filter(elementCheckbox -> elementCheckbox.getText()
                                .equals(elementItem)).forEach(SelenideElement::click);
            });
        }
    }

    public void chooseColors(TestData testData) {
        if (testData.getColors() != null) {
            metalsColorsPage.getColorsDropDownMenuItems()
                    .stream()
                    .filter(color -> color.getText()
                            .equals(testData.getColors())).forEach(SelenideElement::click);
        }
    }

    public void chooseMetals(TestData testData) {
        if (testData.getMetals() != null) {
            metalsColorsPage.getMetalsDropDownMenuItems()
                    .stream()
                    .filter(metal -> metal.getText()
                            .equals(testData.getMetals())).forEach(SelenideElement::click);
        }
    }

    public void chooseVegetables(TestData testData) {
        if (testData.getVegetables() != null) {
            testData.getVegetables().forEach(vegetable -> {
                metalsColorsPage.getVegetablesDropDownMenuItems()
                        .stream()
                        .filter(vegetableCheckbox -> vegetableCheckbox.getText()
                                .equals(vegetable)).forEach(SelenideElement::click);
            });
        }
    }

    public void unselectVegetables() {
        for (SelenideElement dropdownMenuElement : metalsColorsPage.getVegetablesDropDownMenuItems()) {
            if (dropdownMenuElement.isSelected()) dropdownMenuElement.click();
        }
    }

    public void clickSubmitButton() {
        metalsColorsPage.getSubmitButton().click();
    }
}
