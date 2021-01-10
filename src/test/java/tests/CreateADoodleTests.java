package tests;

import helper.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CreateADoodlePage;
import pages.DoodleHomePage;

public class CreateADoodleTests extends BaseTest {

    DoodleHomePage doodleHomePage;
    CreateADoodlePage createADoodlePage;

    @DisplayName("Should check valid input in step 1 gets user to Step 2")
    @Test
    public void shouldCheckStepOneWithValidInput() {
        doodleHomePage = new DoodleHomePage(driver);
        createADoodlePage = new CreateADoodlePage(driver);

        doodleHomePage.clickCreateDoodleButton();
        createADoodlePage.insertDoodleTitle("Test title");
        createADoodlePage.clickDoodleLocation();
        createADoodlePage.chooseDoodleLocationZoom();
        createADoodlePage.insertDoodleNote("Test note");
        createADoodlePage.clickContinue();

        Assertions.assertTrue(createADoodlePage.isOptionsPageDisplayed());
        Assertions.assertTrue(createADoodlePage.getTextOnOptionsPage().contains("STEP 2 OF 4"));
        Assertions.assertTrue(createADoodlePage.getTextOnOptionsPage().contains("What are the options?"));
    }
}
