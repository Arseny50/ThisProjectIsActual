package org.example.lesson6UiAuto;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReplacingToRuStore extends AbstractPage {
   @FindBy(xpath = ".//ul[@class='s-do']/li[2]/a/div")
   private WebElement click1;

   @FindBy(xpath = ".//header[@class='entryunit__head']/h3/a")
   private WebElement click2;

   @FindBy(xpath = ".//a[@class='main-footer__apps-link main-footer__apps-link--rustore']")
   private WebElement click3;

   public ReplacingToRuStore (WebDriver driver) {
      super(driver);
   }

   public ReplacingToRuStore clickOne() {
      click1.click();
      return this;
   }

   public ReplacingToRuStore clickTwo() {
      click2.click();
      return this;
   }

   public ReplacingToRuStore scrllDown() {
      JavascriptExecutor js = ((JavascriptExecutor) getDriver());
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      return this;
   }

      public ReplacingToRuStore clickThree() {
      click3.click();
      return this;
   }
}
