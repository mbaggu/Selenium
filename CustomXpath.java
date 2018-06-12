package seleniumConcetps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(2000);
		
//		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone"); 
//			
//		driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("iphone");
//		
//		//starts-with
//		
//		//id = test_123
//		//id = test_3455
//		
//		driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).click();
//		
//		
//		//ends-with
//		
//		//id =123_test
//		//id =8789_test
//		
//		driver.findElement(By.xpath("//input[ends-with(@id, '_test')]")).click();
//		
//		//xpath for links
		
		driver.findElement(By.xpath("//a[contains(text(), 'Daily Deals')]")).click();
	
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
		
		driver.findElement(By.xpath("//input[contains(@type, 'text')]")).sendKeys("");
		
	}
}
