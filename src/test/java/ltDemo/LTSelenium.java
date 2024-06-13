package ltDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LTSelenium {

	
	@Test
	public void loginTest() throws MalformedURLException {
		
		FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("126");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "nandunanda0728");
		ltOptions.put("accessKey", "ICCkKywyzypAq1OKmJMtXiwHJVtFf6YxctE570aqfYS1duTAmP");
		ltOptions.put("project", "Selenium");
		ltOptions.put("w3c", true);
		browserOptions.setCapability("LT:Options", ltOptions);
		
		WebDriver driver=new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		Assert.assertTrue(driver.getTitle().contains("Automation"));
		
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		
		driver.findElement(By.name("password1")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();   
		
	
		driver.quit();
		
		
	}
	
	
}
