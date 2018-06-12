package seleniumConcetps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWaitConcept {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	 // Max wait to load the page	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // To load all the elements in the page
		
	}

}
