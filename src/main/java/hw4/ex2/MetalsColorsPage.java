package hw4.ex2;


import com.codeborne.selenide.*;
import hw4.components.*;
import org.openqa.selenium.support.*;

import java.util.*;

import static com.codeborne.selenide.Selenide.page;

public class MetalsColorsPage {

    //    @FindBy(css = ".info-panel-section .horizontal-group label")
    @FindBy(css = "#summary-block .radio")
    private List<SelenideElement> summaryRadioButtons;

    @FindBy(css = "#elements-checklist label")
    private List<SelenideElement> elementCheckBoxes;

    @FindBy(id = "#colors")
    private SelenideElement ColorsDropDownMenu;

    @FindBy(css = "#colors li")
    private List<SelenideElement> ColorsDropDownMenuItems;

    @FindBy(id = "#metals")
    private SelenideElement MetalsDropDownMenu;

    @FindBy(css = "#metals li")
    private List<SelenideElement> MetalsDropDownMenuItems;

    @FindBy(id = "#vegetables")
    private SelenideElement VegetablesDropDownMenu;

    @FindBy(css = "#vegetables li")
    private List<SelenideElement> VegetablesDropDownMenuItems;

    @FindBy(xpath = "//*[@class='checkbox']//label[contains(text(),'Vegetables')]")
    private SelenideElement VegetablesDropDownMenuVegetableItem;

    @FindBy(id = "#submit-button")
    private SelenideElement submitButton;

    public MetalsColorsPage() {
        page(this);
        RightSection rightSection = new RightSection();
    }

    public List<SelenideElement> getSummaryRadioButtons() {
        return summaryRadioButtons;
    }

    public List<SelenideElement> getElementCheckBoxes() {
        return elementCheckBoxes;
    }

    public SelenideElement getColorsDropDownMenu() {
        return ColorsDropDownMenu;
    }

    public List<SelenideElement> getColorsDropDownMenuItems() {
        return ColorsDropDownMenuItems;
    }

    public SelenideElement getMetalsDropDownMenu() {
        return MetalsDropDownMenu;
    }

    public List<SelenideElement> getMetalsDropDownMenuItems() {
        return MetalsDropDownMenuItems;
    }

    public SelenideElement getVegetablesDropDownMenu() {
        return VegetablesDropDownMenu;
    }

    public List<SelenideElement> getVegetablesDropDownMenuItems() {
        return VegetablesDropDownMenuItems;
    }

    public SelenideElement getVegetablesDropDownMenuVegetableItem() {
        return VegetablesDropDownMenuVegetableItem;
    }

    public SelenideElement getSubmitButton() {
        return submitButton;
    }
}
