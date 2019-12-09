package hw4.ex2;

import hw4.*;
import hw4.builders.*;
import hw4.ex2.steps.*;
import org.testng.annotations.*;

public class MetalColorsPageTest extends AbstractBaseTest {

    private ActionSteps actionSteps;
    private AssertSteps assertSteps;

    @BeforeMethod
    @Override
    public void beforeMethod() {
        super.beforeMethod();
        actionSteps = new ActionSteps();
        assertSteps = new AssertSteps();
    }

    @Test(dataProviderClass = MetalColorsTestDataProvider.class, dataProvider = "MetalColorsTestDataProvider")
    public void metalColorsPageTest(TestData testData) {

        assertSteps.checkHomePageTitle();

        actionSteps.login(user);
        assertSteps.checkUserName(user);

        actionSteps.goToMetalColorsPage();
        assertSteps.checkMetalColorsUrl();

        actionSteps.chooseSummaryItems(testData);
        actionSteps.chooseElements(testData);
        actionSteps.chooseColors(testData);
        actionSteps.chooseMetals(testData);
        actionSteps.unselectVegetables();
        actionSteps.chooseVegetables(testData);
        actionSteps.clickSubmitButton();
        assertSteps.checkResult(testData);

        actionSteps.logout();
    }
}
