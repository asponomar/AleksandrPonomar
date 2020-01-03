package hw6.page_objects;

import hw6.components.RightSection;
import org.openqa.selenium.WebDriver;

public class DifferentElementsPage extends AbstractBasePage {
    private RightSection rightSection;
    

    public DifferentElementsPage(WebDriver driver) {
        super(driver);
        rightSection = new RightSection(driver);
    }
}
