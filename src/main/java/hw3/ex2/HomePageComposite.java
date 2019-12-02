package hw3.ex2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

public class HomePageComposite extends AbstractBasePage {

    @FindBy(css = ".icons-benefit")
    private List<WebElement> homePageImages;

    @FindBy(css = ".benefit-txt")
    private List<WebElement> benefitText;

    @FindBy(name = "main-title")
    private WebElement centralMainHeader;

    @FindBy(name = "jdi-text")
    private WebElement centralMainHeaderText;

    @FindBy(id = "iframe")
    private WebElement iFrame;

    @FindBy(id = "epam_logo")
    private WebElement epamLogo;

    @FindBy(xpath = "//*[@class='text-center']")
    private WebElement subHeaderText;

    @FindBy(linkText = "JDI GITHUB")
    private WebElement epamJdiGitHubLink;


    public HomePageComposite(WebDriver driver) {
        super(driver);
    }


    public void open(String url) {
        driver.get(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public List<WebElement> getHomePageImages() {
        return homePageImages;
    }

    public List<WebElement> getBenefitText() {
        return benefitText;
    }

    public WebElement getCentralMainHeader() {
        return centralMainHeader;
    }

    public WebElement getCentralMainHeaderText() {
        return centralMainHeaderText;
    }

    public WebElement getIFrame() {
        return iFrame;
    }

    public WebElement getEpamLogo() {
        return epamLogo;
    }

    public WebElement getSubHeaderText() {
        return subHeaderText;
    }

    public WebElement getEpamJdiGitHubLink() {
        return epamJdiGitHubLink;
    }

    public void switchToIFrame() {
        driver.switchTo().frame(iFrame);
    }
}
