package hw5;

import io.qameta.allure.*;
import org.openqa.selenium.*;
import org.testng.*;

public class AttachmentListener extends TestListenerAdapter {

    @Attachment(value = "{0}", fileExtension = "png", type = "image/png")
    public static byte[] makeScreenshot(String name) {
        byte[] array = null;
        try {
            System.out.println("Make " + name + " screenshot");
            array = ((TakesScreenshot) WebDriverSingleton.INSTANCE
                    .getDriver())
                    .getScreenshotAs(OutputType.BYTES);
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        return array;
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        makeScreenshot(tr.getName());
    }
}
