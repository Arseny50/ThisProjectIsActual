package org.example.lesson5;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeTask5Tests {
    static WebDriver driver;

    @BeforeAll
    static void initiation(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    /*Это был первый тест-кейс на авторизацию пользователя. Добавил авторизацию перед каждым тестом, потому что
    главное условие - авторизация пользователя
    */
    @BeforeEach
    void getPageAndAuthority() {
        driver.get("https://www.livejournal.com");
        WebElement webElement1 = driver.findElement(By.xpath(".//nav[@role='presentation']/ul/li[2]/a"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.id("user"));
        webElement2.click();
        webElement2.sendKeys("Testforhometask");
        WebElement webElement3 = driver.findElement(By.name("password"));
        webElement3.click();
        webElement3.sendKeys("Tester#22");
        WebElement webElement4 = driver.findElement(By.name("action:login"));
        webElement4.click();
        Assertions.assertEquals("Главное — ЖЖ", driver.getTitle(),"Wrong page");
    }

    @AfterAll
    static void close() {
        //driver.quit();
    }

    //Выбор поста и лайк
    @Test
    void chooseAndLike() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[1]/div/div/div/div[1]/div[1]/div[2]/div/article/a")).click();
        driver.findElement(By.xpath(".//div[@class='aentry-post__socials aentry-post__socials--top']/div/div/span/div/button")).click();
        driver.findElement(By.xpath(".//div[@class='s-logo']/a/span")).click();
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://www.livejournal.com"),
                "Страница недоступна");
    }

    //Создание нового поста
    @Test
    void creatingNewPost() throws InterruptedException {
        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[4]/a/span[1]"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath(".//textarea"));
        webElement2.click();
        webElement2.sendKeys("Header for my post");
        WebElement webElement3 = driver.findElement(By.xpath(".//div[@data-contents='true']"));
        webElement3.click();
        webElement3.sendKeys("Text for my post");
        WebElement webElement4 = driver.findElement(By.xpath(".//div[@class='inner-0-2-213']/div/div[2]/div[2]/button"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.xpath(".//div[@class='inner-0-2-213']/div/div[2]/div[2]/div/footer/div/button"));
        webElement5.click();
        Assertions.assertEquals("New entry",driver.getTitle(),"Post not created");
    }

    //Удаление своего поста
    @Test
    void deleteOfOwnPost() throws InterruptedException {
        driver.findElement(By.xpath(".//ul[@class='s-do']/li[2]/a/div")).click();
        driver.findElement(By.xpath(".//header[@class='entryunit__head']/h3/a")).click();
        driver.findElement(By.xpath(".//div[@class='morePanel-0-2-1']/button")).click();
        driver.findElement(By.xpath("//div/div/div/div/a/span")).click();
        driver.findElement(By.xpath(".//div[@class='inner-0-2-213']/nav/a[1]")).click();
        driver.findElement(By.xpath(".//div[@class='content-0-2-157']/button[2]")).click();
        Assertions.assertEquals("Edit entry",driver.getTitle(),"Post not deleted");
    }

    //Переключение языка на английский
    @Test
    void switchLanguageToEng() throws InterruptedException {
        driver.findElement(By.xpath(".//ul[@class='s-do']/li[2]/a/div")).click();
        driver.findElement(By.xpath(".//header[@class='entryunit__head']/h3/a")).click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath(".//b[@class='button']")).click();
        driver.findElement(By.xpath(".//div[@class='b-selectus-scroll']/ul/li")).click();
        driver.findElement(By.xpath(".//div[@class='s-logo']/a/span")).click();
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://www.livejournal.com"),
                "Страница недоступна");
    }

    //Переход в РуСтор для скачивания приложения на Android
    @Test
    void replaceToRuStore() throws InterruptedException {
        driver.findElement(By.xpath(".//ul[@class='s-do']/li[2]/a/div")).click();
        driver.findElement(By.xpath(".//header[@class='entryunit__head']/h3/a")).click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath(".//a[@class='main-footer__apps-link main-footer__apps-link--rustore']")).click();
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        String secondTab = windowHandles.get(1);
        driver.switchTo().window(secondTab);
        Assertions.assertEquals("LiveJournal – скачать приложение для Android – Каталог RuStore",driver.getTitle(),"Wrong Page");
    }
}
