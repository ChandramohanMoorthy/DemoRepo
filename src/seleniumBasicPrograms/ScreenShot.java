package seleniumBasicPrograms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	static WebDriver driver;

	public static void launchChrome() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\NWS\\WebDrivers\\Chrome driver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	//Screenshot using TakesScreenshot interface
	public static void takeScreenShot() throws IOException {

		TakesScreenshot src = (TakesScreenshot) driver;
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\Screenshots\\Ex1.png");// ".\\" -Represents current project "Screenshots"
															// -Represents Folder name "Ex1.png" - Filename

		FileHandler.copy(srcFile, destFile);

	}
	
	//Screenshot using Web element

	public static void takeScreenShot2() throws IOException {

		WebElement src=driver.findElement(By.xpath("//*[@id='j_idt133']"));// Section of web page
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".\\Screenshots\\Ex2.png");
		FileHandler.copy(srcFile, destFile);

	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		launchChrome();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		
		takeScreenShot();
		takeScreenShot2();
		
		System.out.println("Screenshot taken");
		
		//driver.close();

	}

}
