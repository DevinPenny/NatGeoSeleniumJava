/**
 * Created by Devin Penny on 1/4/17.
 */
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageObjects {

    WebDriver driver;

    //selectors for page objects that do not have to be in the method

    By Sel_textFromPage = By.xpath(".//*[@id='flash']/div");
    By Sel_clickOnElement = By.cssSelector(".flash.alert_danger");
    By Sel_EnterTextOnPage = By.cssSelector(".flash.alert_danger");


    public PageObjects(WebDriver driver){
         this.driver = driver;
    }

    public void ClickOnElement(){
        driver.findElement(Sel_clickOnElement).click();

        //wait for half a second before continuing with other steps
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ie){
            System.out.println("computer cant sleep, must be insomnia");
        }
    }

    public void EnterEmailAddress(String email) {
        driver.findElement(Sel_EnterTextOnPage).sendKeys(email);
    }

    public String GetTextFromPage() {
        String textFromPage = driver.findElement(Sel_textFromPage).getText();
        return textFromPage;
    }


    public String VerifyPageTitle() {

        String pageTitle = driver.getTitle();
        return pageTitle;
    }



}