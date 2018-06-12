package seleniumConcetps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUtilDriverConcept {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();


//Advantages -- Testing is happening behind the scene, no browser launch
//Execution is very fast so it improve performance of script
// We need to download jar files, this is not available from Selenium 3.0
// not suitable for Actions items

		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://freecrm.com");
		
		System.out.println("Before login title is---> :"+ driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("After login title is---> :"+ driver.getTitle());

	}

}
