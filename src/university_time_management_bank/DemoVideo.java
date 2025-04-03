package university_time_management_bank;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoVideo {
	public WebDriver driver;
	   @BeforeClass
	    public void setup() throws MalformedURLException {
	        String username = "mughdabansal_GvSKk8";
	        String accessKey = "EpKUzsjnDeP1dSUWBTch";

	        // BrowserStack Hub URL
	        String hubURL = "https://mughdabansal_GvSKk8:EpKUzsjnDeP1dSUWBTch@hub-cloud.browserstack.com/wd/hub";

	        // Define capabilities in W3C format
	        DesiredCapabilities caps = new DesiredCapabilities();
	        
	        Map<String, Object> browserstackOptions = new HashMap<>();
	        browserstackOptions.put("browserName", "Chrome");
	        browserstackOptions.put("browserVersion", "latest");
	        browserstackOptions.put("platformName", "Windows 11");
	       

	        caps.setCapability("bstack:options", browserstackOptions);

	        driver = new RemoteWebDriver(new URL(hubURL), caps);
	    }
	   @Test
	    public void f1() throws InterruptedException {
		   
			
			driver.get("https://mayank149.github.io/University-Time-Bank/");
			driver.manage().window().maximize();
			
			// registering user
			driver.findElement(By.cssSelector("#welcome-panel > button:nth-child(4)")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("name")).sendKeys("xyz");
			driver.findElement(By.id("age")).sendKeys("20");
			driver.findElement(By.id("graduation-year")).sendKeys("2026");
			driver.findElement(By.id("reg-no")).sendKeys("12345678");
			driver.findElement(By.id("mobile")).sendKeys("12341234");
			driver.findElement(By.id("password")).sendKeys("xyz1234");
			
			driver.findElement(By.cssSelector("#register-form > div.button-container > button:nth-child(1)")).click();
			System.out.println("register successfully");
			Thread.sleep(3000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(3000);
			
			//log in 
			driver.findElement(By.id("login-reg")).sendKeys("12345678");
			driver.findElement(By.id("login-password")).sendKeys("xyz1234");
			driver.findElement(By.cssSelector("#login-form > button:nth-child(5)")).click();
			Alert alert2 = driver.switchTo().alert();
			alert2.accept();
			Thread.sleep(3000);
			
			//Post Request 
			driver.findElement(By.id("post-request-btn")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("request-title")).sendKeys("cpp programming");
			driver.findElement(By.id("request-description")).sendKeys("inheritence");
			driver.findElement(By.id("request-tc")).sendKeys("2");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#post-request-form > button:nth-child(8)")).click();
			Thread.sleep(1000);
			alert2.accept();
			System.out.println("successfully Posted Request!");
	   }
}
