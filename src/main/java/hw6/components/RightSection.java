package hw6.components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selenide.page;

public class RightSection {
    private WebDriver driver;

    @FindBy(name = "log-sidebar")
    private SelenideElement logSideBar;

    @FindBy(xpath = "//*[@class='panel-body-list logs']")
    private List<SelenideElement> logList;

    @FindBy(css = ".results")
    private SelenideElement resultsBar;

    @FindBy(css = ".results li")
    private List<SelenideElement> resultsList;

    public RightSection(WebDriver driver) {
        this.driver = driver;
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
