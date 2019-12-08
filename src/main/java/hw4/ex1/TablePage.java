package hw4.ex1;

import com.codeborne.selenide.*;
import hw4.components.*;
import org.openqa.selenium.support.*;

import java.util.*;

import static com.codeborne.selenide.Selenide.page;

public class TablePage {

    @FindBy(name = "table-with-pages_length")
    private SelenideElement showEntriesDropdown;

    @FindBy(css = "#table-with-pages_length [value=\"5\"]")
    private SelenideElement showEntriesFiveValue;

    @FindBy(css = "#table-with-pages_length [value=\"10\"]")
    private SelenideElement showEntriesTenValue;

    @FindBy(css = "#table-with-pages_filter .uui-form-element")
    private SelenideElement tableSearchField;

    @FindBy(css = "#table-with-pages>tbody")
    private SelenideElement TableOnTablePage;

    @FindBy(css = "#table-with-pages>tbody [role=\"row\"]")
    private List<SelenideElement> TableOnTablePageElements;

    public TablePage() {
        page(this);
        RightSection rightSection = new RightSection();
    }

    public SelenideElement getShowEntriesDropdown() {
        return showEntriesDropdown;
    }

    public SelenideElement getShowEntriesFiveValue() {
        return showEntriesFiveValue;
    }

    public SelenideElement getShowEntriesTenValue() {
        return showEntriesTenValue;
    }

    public SelenideElement getTableSearchField() {
        return tableSearchField;
    }

    public SelenideElement getTableOnTablePage() {
        return TableOnTablePage;
    }

    public List<SelenideElement> getTableOnTablePageElements() {
        return TableOnTablePageElements;
    }
}
