package tests;

import helper.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DoodleHomePage;


public class HomePageTests extends BaseTest {

    DoodleHomePage doodleHomePage;

    @Test
    public void shouldCheckHomePageTitle() {
        doodleHomePage = new DoodleHomePage(driver);
        String title = driver.getTitle();
        Assertions.assertEquals("Free online meeting scheduling tool | Doodle", title);
    }
}
