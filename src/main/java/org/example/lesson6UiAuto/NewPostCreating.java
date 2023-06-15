package org.example.lesson6UiAuto;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class NewPostCreating extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[4]/a/span[1]")
    private WebElement anotherNewPost;

    @FindBy(xpath = ".//textarea")
    private WebElement postHeader;

    @FindBy(xpath = ".//div[@data-contents='true']")
    private WebElement postBody;

    @FindBy(xpath = ".//div[@class='inner-0-2-213']/div/div[2]/div[2]/button")
    private WebElement publishButton;

    @FindBy(xpath = ".//div[@class='inner-0-2-213']/div/div[2]/div[2]/div/footer/div/button")
    private WebElement lastOkButton;

    public NewPostCreating(WebDriver driver) {
        super(driver);
    }

    public NewPostCreating clickAnotherNewPost() {
        anotherNewPost.click();
        return this;
    }

    public NewPostCreating clickPostHeader() {
        postHeader.click();
        postHeader.sendKeys("Header for my post");
        return this;
    }

    public NewPostCreating clickPostBody() {
        postBody.click();
        postBody.sendKeys("Text for my post");
        return this;
    }

    public NewPostCreating clickPublishButton() {
        publishButton.click();
        return this;
    }

    public NewPostCreating clickLastOkButton() {
        lastOkButton.click();
        return this;
    }






}
