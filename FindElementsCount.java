package seleniumConcetps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsCount {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(2000);
		
		//get the count of all links on the page
		//get the text of each link on the page
		
		List <WebElement> linklist= driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for(int i=0; i<linklist.size(); i++)
			
		{
		String name=  linklist.get(i).getText();
		
		System.out.println(name);
		
		}
			
	}

}
