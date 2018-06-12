package seleniumConcetps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.spicejet.com/");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Login / Signup')]"))).build().perform();
		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'SpiceCash/SpiceClub Members')]"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Member Login")).click();
	
		
	}

}
