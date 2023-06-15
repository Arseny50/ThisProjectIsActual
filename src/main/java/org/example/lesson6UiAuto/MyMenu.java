package org.example.lesson6UiAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyMenu extends AbstractPage {

    @FindBy(xpath = ".//nav[@role='presentation']/ul/li[2]/a")
    private WebElement login;

    @FindBy(id = "user")
    private WebElement user;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "action:login")
    private WebElement actionLogin;

    public MyMenu(WebDriver driver) {
        super(driver);
    }

    public MyMenu clickLogin() {
        login.click();
        return this;
    }

    public MyMenu clickUser() {
        user.click();
        user.sendKeys("Testforhometask");
        return this;
    }

    public MyMenu clickPassword() {
        password.click();
        password.sendKeys("Tester#22");
        return this;
    }

    public MyMenu clickActionLogin() {
        actionLogin.click();
        return this;
    }


}
