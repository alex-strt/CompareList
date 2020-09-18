package configuration;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class TestConfiguration {

    private final String baseURL = "https://rozetka.com.ua/";

    @BeforeMethod
    public void beforeMethod() {
        isChrome();
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        open(baseURL);

    }
}
