package seleniumConcetps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarByJs {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		driver.get("http://www.spicejet.com/");
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dataVal = "20/08";
		
		selectCalendar(driver, date, dataVal);

	}

	public static void selectCalendar(WebDriver driver, WebElement element, String dataVal) {
		
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value', '"+dataVal+"')", element);
	}
}


