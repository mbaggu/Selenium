package seleniumConcetps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
	}

}
