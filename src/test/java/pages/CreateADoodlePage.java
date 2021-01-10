package pages;

import helper.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateADoodlePage extends BaseTest {

    By doodleTitle = By.id("d-pollTitle");
    By doodleLocation = By.id("d-pollLocation");
    By doodleLocationZoom = By.cssSelector("[data-popular-option-category=ZOOM]");
    By doodleNote = By.id("d-pollDescription");
    By continueButton = By.className("d-actionButtons");
    By optionsPage = By.id("d-wizardOptionsPage");
    By generalInformationPage = By.id("d-wizardGeneralInformationPage");

    public void insertDoodleTitle(String title) {
        driver.findElement(doodleTitle).sendKeys(title);
    }

    public void clickDoodleLocation() {
        driver.findElement(doodleLocation).click();
    }

    public void chooseDoodleLocationZoom() {
        driver.findElement(doodleLocationZoom).click();
    }

    public void insertDoodleNote(String note) {
        driver.findElement(doodleNote).sendKeys(note);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public Boolean isOptionsPageDisplayed() {
        return driver.findElement(optionsPage).isDisplayed();
    }

    public Boolean isGeneralInfoPageDisplayed() {
        return driver.findElement(generalInformationPage).isDisplayed();
    }

    public String getTextOnOptionsPage() {
        return driver.findElement(optionsPage).getText();
    }

    public String getTextOnGeneralInfoPage() {
        return driver.findElement(generalInformationPage).getText();
    }

    public CreateADoodlePage(WebDriver driver) {
        this.driver = driver;
    }
}
