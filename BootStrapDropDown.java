package seleniumConcetps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("menu1")).click();
		
		List <WebElement> linklist = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
		for (int i=0; i<linklist.size(); i++) {
			
		WebElement element = linklist.get(i);
		
		String name = element.getAttribute("innerHTML");
		
		if(name.equals("JavaScript")) {
			
			element.click();
			break;
		}
		
		System.out.println(driver.getTitle());
		driver.quit();
	
		}
		
		driver.quit();

	}

}
