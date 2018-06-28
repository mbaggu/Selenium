package seleniumConcetps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("naveenk");
		
		WebElement pwd = driver.findElement(By.name("password"));
		
		pwd.sendKeys("test@123");

}
}