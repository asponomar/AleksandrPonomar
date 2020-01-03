package hw6.steps;

import hw6.WebDriverSingleton;
import hw6.page_objects.DifferentElementsPage;
import hw6.page_objects.HomePage;
import hw6.page_objects.UserTablePage;
import org.openqa.selenium.WebDriver;

class AbstractBaseStep {

    protected HomePage homePage;
    protected DifferentElementsPage differentElementsPage;
    protected UserTablePage userTablePage;

    AbstractBaseStep() {
        WebDriver driver = WebDriverSingleton.INSTANCE.getDriver();
        homePage = new HomePage(driver);
        differentElementsPage = new DifferentElementsPage(driver);
        userTablePage = new UserTablePage(driver);
    }
}
