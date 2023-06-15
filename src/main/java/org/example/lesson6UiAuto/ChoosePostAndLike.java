package org.example.lesson6UiAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChoosePostAndLike extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[1]/div/div/div/div[1]/div[1]/div[2]/div/article/a")
    private WebElement post;

    @FindBy(xpath = ".//div[@class='aentry-post__socials aentry-post__socials--top']/div/div/span/div/button")
    private WebElement action1;

    @FindBy(xpath = ".//div[@class='s-logo']/a/span")
    private WebElement action2;

    public ChoosePostAndLike(WebDriver driver) {
        super(driver);
    }

    public ChoosePostAndLike clickPost() {
        post.click();
        return this;
    }

    public ChoosePostAndLike clickAction1() {
        action1.click();
        return this;
    }

    public ChoosePostAndLike clickAction2() {
        action2.click();
        return this;
    }

}
