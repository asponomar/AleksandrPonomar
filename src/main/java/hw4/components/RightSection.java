package hw4.components;

import com.codeborne.selenide.*;
import org.openqa.selenium.support.*;

import java.util.*;

import static com.codeborne.selenide.Selenide.*;

public class RightSection {

    @FindBy(name = "log-sidebar")
    private SelenideElement logSideBar;

    @FindBy(xpath = "//*[@class='panel-body-list logs']")
    private List<SelenideElement> logList;

    @FindBy(css = ".results")
    private SelenideElement resultsBar;

    @FindBy(css = ".results li")
    private List<SelenideElement> resultsList;

    public RightSection() {
        page(this);
    }

    public SelenideElement getLogSideBar() {
        return logSideBar;
    }

    public List<SelenideElement> getLogList() {
        return logList;
    }

    public SelenideElement getResultsBar() {
        return resultsBar;
    }

    public List<SelenideElement> getResultsList() {
        return resultsList;
    }

}
