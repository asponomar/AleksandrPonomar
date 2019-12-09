package hw4.ex2.steps;

import com.codeborne.selenide.*;
import hw4.builders.*;
import hw4.components.*;

import java.util.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.testng.Assert.assertEquals;

public class AssertSteps extends AbstractBaseSteps {
    protected RightSection rightSection = new RightSection();

    public void checkHomePageTitle() {
        element("title").shouldHave(attribute("text", HOME_PAGE_TITLE));
    }

    public void checkUserName(User user) {
        headerMenu.getUserName().shouldBe(text(user.getUserName()));
    }

    public void checkMetalColorsUrl() {
        assertEquals(url(), METAL_COLORS_URL);
    }

    public void checkResult(TestData testData) {
        List<String> resultList = new ArrayList<>();
        for (SelenideElement result : rightSection.getResultsList()) {
            resultList.add(result.getText());
        }
        assertEquals(resultList, testData.testDataLog());
    }
}
