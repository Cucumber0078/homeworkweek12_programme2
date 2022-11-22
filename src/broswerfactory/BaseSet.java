package broswerfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSet {

    public static WebDriver driver;


    public void openBroswer(String baseUrl){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //Lanch the Url
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBroswer(){
        driver.quit();
    }
}
