package hw4;

import java.util.*;

public interface TestDataConstants {
    String PROPERTY_FILE_PATH = "src/test/resources/hw4/user.properties";
    String HOME_PAGE_URL = "https://epam.github.io/JDI/index.html";
    String PAGE_WITH_TABLE_URL = "https://epam.github.io/JDI/table-pages.html";
    String METAL_COLORS_URL = "https://epam.github.io/JDI/metals-colors.html";
    String HOME_PAGE_TITLE = "Home Page";
    List<String> SERVICE_DROPDOWN_MENU =
            Arrays.asList(
                    "SUPPORT",
                    "DATES",
                    "SEARCH",
                    "COMPLEX TABLE",
                    "SIMPLE TABLE",
                    "USER TABLE",
                    "TABLE WITH PAGES",
                    "DIFFERENT ELEMENTS",
                    "PERFORMANCE");

    List<String> SERVICE_LEFTSIDEBAR_MENU =
            Arrays.asList(
                    "Support",
                    "Dates",
                    "Complex Table",
                    "Simple Table",
                    "Search",
                    "User Table",
                    "Table With Pages",
                    "Different elements",
                    "Performance");

}
