package seleniumConcetps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisiblity {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.freecrm.com/register/");
		
		// isDisplayed method
		
		boolean b = driver.findElement(By.id("submitButton")).isDisplayed();

		if(b==true)
		{
			
			System.out.println("Submit button is displayed");
		}
		else {
			
			System.out.println("Submit button is not displayed");
		}
		
		boolean b1 =driver.findElement(By.id("submitButton")).isEnabled();
		
		System.out.println(b1);
		
	}

}
