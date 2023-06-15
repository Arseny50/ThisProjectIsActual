package org.example.lesson6UiAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletingMyPost extends AbstractPage {

    @FindBy(xpath = ".//ul[@class='s-do']/li[2]/a/div")
    private WebElement choosingPost;

    @FindBy(xpath = ".//header[@class='entryunit__head']/h3/a")
    private WebElement editingPost;

    @FindBy(xpath = ".//div[@class='morePanel-0-2-1']/button")
    private WebElement editButton;

    @FindBy(xpath = "//div/div/div/div/a/span")
    private WebElement deleteButton;

    @FindBy(xpath = ".//div[@class='inner-0-2-213']/nav/a[1]")
    private WebElement confirmButton;

    @FindBy(xpath = ".//div[@class='content-0-2-157']/button[2]")
    private WebElement theLastAction;

    public DeletingMyPost(WebDriver driver) {
        super(driver);
    }

    public DeletingMyPost clickChoosingPost() {
        choosingPost.click();
        return this;
    }

    public DeletingMyPost clickEditingPost() {
        editingPost.click();
        return this;
    }

    public DeletingMyPost clickEditButton() {
        editButton.click();
        return this;
    }

    public DeletingMyPost clickDeleteButton() {
        deleteButton.click();
        return this;
    }

    public DeletingMyPost clickConfirmButton() {
        confirmButton.click();
        return this;
    }

    public DeletingMyPost clickTheLastAction() {
        theLastAction.click();
        return this;
    }
}
