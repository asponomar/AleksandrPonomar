package hw4.ex2.steps;

import hw4.builders.TestData;
import hw4.builders.User;
import hw4.ex2.MetalsColorsPage;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertEquals;

public class AssertSteps extends AbstractBaseSteps {
    private MetalsColorsPage metalsColorsPage = new MetalsColorsPage();

    public void checkHomePageTitle() {
        element("title").shouldHave(attribute("text", HOME_PAGE_TITLE));
    }

    public void checkUserName(User user) {
        headerMenu.getUserName().shouldBe(text(user.getUserName()));
    }

    public void checkMetalColorsUrl() {
        assertEquals(url(), METAL_COLORS_URL);
    }

    public List<String> resultLog() {
        List<String> result = new ArrayList<>();
        if (!metalsColorsPage.getSummRes().getText().equals("Summary: 3"))
            result.add(metalsColorsPage.getSummRes().getText());
        if (metalsColorsPage.getElemRes().exists())
            result.add(metalsColorsPage.getElemRes().getText());
        if (!metalsColorsPage.getColRes().getText().equals("Color: Colors"))
            result.add(metalsColorsPage.getColRes().getText());
        if (!metalsColorsPage.getMetRes().getText().equals("Metal: Metals"))
            result.add(metalsColorsPage.getMetRes().getText());
        if (!metalsColorsPage.getSalRes().getText().equals("Vegetables: Vegetables"))
            result.add(metalsColorsPage.getSalRes().getText());
        return result;
    }

    public void checkResult(TestData testData) {
        assertEquals(resultLog(), testData.testDataLog());
    }
}
