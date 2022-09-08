package seleniumBasicPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserLaunch {

		static WebDriver driver;
		
	public static void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\NWS\\WebDrivers\\Chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void launchFireFox()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\NWS\\WebDrivers\\Firefox driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	
	
	public static void main(String[] args) 
	{
		
		launchChrome();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/");
		
		/*
		 * launchFireFox();
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 * driver.get("http://google.co.in");
		 */
	}

}
