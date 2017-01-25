package SeleniumTests;

import CommonComponents.CommonObjects;
import PageObjects.PageObjects;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by dpenny on 1/24/17.
 * The purpose of this test is to prove that the national geographic page title is "National Geographic"
 * it is a simple demonstration of a java selenium framework using page object pattern.
 */

public class NationalGeographicSandbox extends CommonObjects{

    @Test
    public void VerifyPageTitle() {

        ExtentTest extentTest = extent.startTest("Verify NatGeo Page Title");

        PageObjects MainPage = new PageObjects(driver);


        logger.info("Verify page tittle to prove application page loaded");
        String strPageTitle = MainPage.VerifyPageTitle();
        logger.info("Verify that the Page Title is: National Geographic ");



        try{
            Assert.assertTrue(strPageTitle.equalsIgnoreCase("National Geographic asdf"));
            extentTest.log(LogStatus.PASS, "Selenium found page title to be: " + strPageTitle);

        }
        catch(AssertionError e){
            logger.severe("Page is missing page title!");
            extentTest.log(LogStatus.FAIL, "Selenium found page title is not National Geographic " );

        }

        extent.endTest(extentTest);
        extent.flush();
    }

}
