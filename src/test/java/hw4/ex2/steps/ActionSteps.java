package hw4.ex2.steps;

import com.codeborne.selenide.*;
import hw4.builders.*;
import hw4.ex1.*;
import hw4.ex2.*;

import static com.codeborne.selenide.Selenide.refresh;

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
            for (Integer summaryItem : testData.getSummary()) {
                for (SelenideElement summaryRadioButton : metalsColorsPage.getSummaryRadioButtons()) {
                    if (summaryRadioButton.getText()
                            .equals(summaryItem.toString())) {
                        summaryRadioButton.click();
                    }
                }
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
            metalsColorsPage.getColorsDropDownMenu().click();
            metalsColorsPage.getColorsDropDownMenuItems()
                    .stream()
                    .filter(color -> color.innerText()
                            .equals(testData.getColors())).forEach(SelenideElement::click);
        }
    }

    public void chooseMetals(TestData testData) {
        if (testData.getMetals() != null) {
            metalsColorsPage.getMetalsDropDownMenu().click();
            metalsColorsPage.getMetalsDropDownMenuItems()
                    .stream()
                    .filter(metal -> metal.innerText()
                            .equals(testData.getMetals())).forEach(SelenideElement::click);
        }
    }

    public void chooseVegetables(TestData testData) {
        if (testData.getVegetables() != null) {
            metalsColorsPage.getVegetablesDropDownMenu().click();
            testData.getVegetables().forEach(vegetable -> {
                metalsColorsPage.getVegetablesDropDownMenuItems()
                        .stream()
                        .filter(vegetableCheckbox -> vegetableCheckbox.getText()
                                .equals(vegetable)).forEach(SelenideElement::click);
            });
            metalsColorsPage.getVegetablesDropDownMenu().click();
        }
    }

    public void unselectVegetables(TestData testData) {
        if (testData.getVegetables() != null) {
            metalsColorsPage.getVegetablesDropDownMenu().click();
            metalsColorsPage.getVegetablesDropDownMenuVegetableItem().click();
            metalsColorsPage.getVegetablesDropDownMenu().click();
        }
    }

    public void clickSubmitButton() {
        metalsColorsPage.getSubmitButton().click();
    }

    public void refreshPage() {
        refresh();
    }
}
