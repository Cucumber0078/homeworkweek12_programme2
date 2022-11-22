package TestSuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp () {
        openBroswer(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        sendTextElement(By.name("username"),"Admin");
        sendTextElement(By.name("password"),"admin123");
        clickOnElement(By.xpath("//button[@type='submit']"));

        String expectedMessage = "Dashboard";

        String actualMessage = getTextFromElement(By.xpath("//h6[text() = 'Dashboard']"));

        Assert.assertEquals("Dashboard is not opening", expectedMessage, actualMessage);
    }
}
