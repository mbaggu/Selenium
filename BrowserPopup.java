package seleniumConcetps;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopup {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	 // Max wait to load the page	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		Set <String> handler = driver.getWindowHandles();
		Iterator <String> it = handler.iterator();
		
		String parentWindow = it.next();		
		System.out.println(parentWindow);
		
		String childWindow = it.next();		
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);		
		System.out.println("Child Window Title :" +driver.getTitle() );		
		driver.close();
		
		driver.switchTo().window(parentWindow);		
		System.out.println("Parent Window Title :" +driver.getTitle());
		driver.close();
	}

}
