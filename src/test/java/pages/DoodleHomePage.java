package pages;

import helper.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoodleHomePage extends BaseTest {

    By createDoodleButton = By.className("CreatePollMenu-createMenuLabel");

    public String getCreateDoodleButtonText() {
        return driver.findElement(createDoodleButton).getText();
    }

    public void clickCreateDoodleButton() {
        driver.findElement(createDoodleButton).click();
    }

    public DoodleHomePage(WebDriver driver) {
        this.driver = driver;
    }
}
