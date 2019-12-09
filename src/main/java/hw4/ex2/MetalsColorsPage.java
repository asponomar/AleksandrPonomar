package hw4.ex2;


import com.codeborne.selenide.*;
import hw4.components.*;
import org.openqa.selenium.support.*;

import java.util.*;

import static com.codeborne.selenide.Selenide.page;

public class MetalsColorsPage {

    @FindBy(css = "#summary-block .radio")
    private List<SelenideElement> summaryRadioButtons;

    @FindBy(css = "#elements-checklist label")
    private List<SelenideElement> elementCheckBoxes;

    @FindBy(id = "colors")
    private SelenideElement ColorsDropDownMenu;

    @FindBy(css = ".colors .text")
    private List<SelenideElement> ColorsDropDownMenuItems;

    @FindBy(xpath = "//div[@id='metals']//span[@class='caret']")
    private SelenideElement MetalsDropDownMenu;

    @FindBy(css = ".metals .text")
    private List<SelenideElement> MetalsDropDownMenuItems;

    @FindBy(id = "vegetables")
    private SelenideElement VegetablesDropDownMenu;

    @FindBy(css = "#vegetables .checkbox")
    private List<SelenideElement> VegetablesDropDownMenuItems;

    @FindBy(xpath = "//*[@class='checkbox']//label[contains(text(),'Vegetables')]")
    private SelenideElement VegetablesDropDownMenuVegetableItem;

    @FindBy(id = "submit-button")
    private SelenideElement submitButton;

    @FindBy(css = ".summ-res")
    private SelenideElement summRes;

    @FindBy(css = ".elem-res")
    private SelenideElement elemRes;

    @FindBy(css = ".col-res")
    private SelenideElement colRes;

    @FindBy(css = ".met-res")
    private SelenideElement metRes;

    @FindBy(css = ".sal-res")
    private SelenideElement salRes;

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

    public SelenideElement getSummRes() {
        return summRes;
    }

    public SelenideElement getElemRes() {
        return elemRes;
    }

    public SelenideElement getColRes() {
        return colRes;
    }

    public SelenideElement getMetRes() {
        return metRes;
    }

    public SelenideElement getSalRes() {
        return salRes;
    }
}
