package hw4.ex2.steps;

import hw4.*;
import hw4.components.*;

public class AbstractBaseSteps implements TestDataConstants {
    protected HeaderMenu headerMenu;
    protected LeftSection leftSection;

    public AbstractBaseSteps() {
        this.headerMenu = new HeaderMenu();
        this.leftSection = new LeftSection();
    }
}
