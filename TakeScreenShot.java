package seleniumConcetps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com/");
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("E:\\Selenium\\ScreenShot\\" +System.currentTimeMillis()+ ".png"));		

		//File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//FileHandler.copy(src, new File("E:\\Selenium\\ScreenShot\\" +System.currentTimeMillis()+ ".png" ));

	}

}
