package org.example.lesson6;

import org.example.lesson6UiAuto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTestsFor6Lesson extends AbstractTest{


    @Test
    void userLoginTest() {
        MyMenu myMenu = new MyMenu(getWebDriver());
        myMenu
                .clickLogin()
                .clickUser()
                .clickPassword()
                .clickActionLogin();
        Assertions.assertEquals("https://www.livejournal.com/", getWebDriver().getCurrentUrl());
    }

    @Test
    void choosingPostAndLike() {
        MyMenu myMenu = new MyMenu(getWebDriver());
        myMenu
                .clickLogin()
                .clickUser()
                .clickPassword()
                .clickActionLogin();


        ChoosePostAndLike choosePostAndLike = new ChoosePostAndLike(getWebDriver());
        choosePostAndLike
                .clickPost()
                .clickAction1()
                .clickAction2();
        Assertions.assertEquals("https://www.livejournal.com/", getWebDriver().getCurrentUrl());
    }

    @Test
    void newPostCreating() {
        MyMenu myMenu = new MyMenu(getWebDriver());
        myMenu
                .clickLogin()
                .clickUser()
                .clickPassword()
                .clickActionLogin();
        Assertions.assertEquals("https://www.livejournal.com/", getWebDriver().getCurrentUrl());



        NewPostCreating newPostCreating = new NewPostCreating(getWebDriver());
        newPostCreating
                .clickAnotherNewPost()
                .clickPostHeader()
                .clickPostBody()
                .clickPublishButton()
                .clickLastOkButton();
    }

    @Test
    void deletingMyPost() {
        MyMenu myMenu = new MyMenu(getWebDriver());
        myMenu
                .clickLogin()
                .clickUser()
                .clickPassword()
                .clickActionLogin();
        Assertions.assertEquals("https://www.livejournal.com/", getWebDriver().getCurrentUrl());



        DeletingMyPost deletingMyPost = new DeletingMyPost(getWebDriver());
        deletingMyPost
                .clickChoosingPost()
                .clickEditingPost()
                .clickEditButton()
                .clickDeleteButton()
                .clickConfirmButton()
                .clickTheLastAction();
    }

    @Test
    void switchingToEnglish() {

        MyMenu myMenu = new MyMenu(getWebDriver());
        myMenu
                .clickLogin()
                .clickUser()
                .clickPassword()
                .clickActionLogin();
        Assertions.assertEquals("https://www.livejournal.com/", getWebDriver().getCurrentUrl());



        SwitchingToEnglish switchingToEnglish = new SwitchingToEnglish(getWebDriver());
        switchingToEnglish
                .clickAction1()
                .clickAction2()
                .scrllDown()
                .clickAction3()
                .clickAction4()
                .clickAction5();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("https://www.livejournal.com/"));
    }

    @Test
    void replacingToRuStore() {
        MyMenu myMenu = new MyMenu(getWebDriver());
        myMenu
                .clickLogin()
                .clickUser()
                .clickPassword()
                .clickActionLogin();
        Assertions.assertEquals("https://www.livejournal.com/", getWebDriver().getCurrentUrl());


        ReplacingToRuStore replacingToRuStore = new ReplacingToRuStore(getWebDriver());
        replacingToRuStore
                .clickOne()
                .clickTwo()
                .clickThree();
        Assertions.assertEquals("https://testforhometask.livejournal.com/17441.html", getWebDriver().getCurrentUrl());
    }
}
