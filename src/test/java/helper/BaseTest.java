package helper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static helper.TestConstants.*;

public class BaseTest {

    public WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty(geckoDriver, geckoDriverPath);
        System.setProperty(chromeDriver, chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void teardown() {
        driver.close();
    }

    public BaseTest() {
    }
}
