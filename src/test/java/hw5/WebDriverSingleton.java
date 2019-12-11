package hw5;

import org.openqa.selenium.*;

public enum WebDriverSingleton {

    INSTANCE;

    private WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

}
