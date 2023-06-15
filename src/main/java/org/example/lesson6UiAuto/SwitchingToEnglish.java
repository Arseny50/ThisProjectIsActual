package org.example.lesson6UiAuto;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwitchingToEnglish extends AbstractPage {

    @FindBy(xpath = ".//ul[@class='s-do']/li[2]/a/div")
    private WebElement action1;

    @FindBy(xpath = ".//header[@class='entryunit__head']/h3/a")
    private WebElement action2;

    @FindBy(xpath = ".//b[@class='button']")
    private WebElement action3;

    @FindBy(xpath = ".//div[@class='b-selectus-scroll']/ul/li")
    private WebElement action4;

    @FindBy(xpath = ".//div[@class='s-logo']/a/span")
    private WebElement action5;

    public SwitchingToEnglish(WebDriver driver) {
        super(driver);
    }

    public SwitchingToEnglish clickAction1() {
        action1.click();
        return this;
    }

    public SwitchingToEnglish clickAction2() {
        action2.click();
        return this;
    }

    public SwitchingToEnglish scrllDown() {
        JavascriptExecutor js = ((JavascriptExecutor) getDriver());
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        return this;
    }

    public SwitchingToEnglish clickAction3() {
        action3.click();
        return this;
    }

    public SwitchingToEnglish clickAction4() {
        action4.click();
        return this;
    }

    public SwitchingToEnglish clickAction5() {
        action5.click();
        return this;
    }

}
