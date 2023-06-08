package org.example.lesson5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;

import java.util.concurrent.TimeUnit;

public class AbstractTest {

    private static WebDriver driver;

    private static Long time = 5l;


    @BeforeAll
    static void initiation() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
    @BeforeEach
    void goTo() {
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://www.livejournal.com"),
                "Страница недоступна");
    }

    @AfterAll
    static void close() {
        //driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
