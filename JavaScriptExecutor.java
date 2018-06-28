package seleniumConcetps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.freecrm.com");
				
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type, 'submit')]"));
		
		flash(loginBtn, driver);

	}
	// To highlight a element we need to use the javaScriptExecutor method
	
	public static void flash(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor= element.getCssValue("backgroundColor");
		for(int i=0; i<100; i++) {
			changeColor("rgb(0, 200, 0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
			
		}
		
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(20);
		
		}catch (InterruptedException e) {
		
	}
		
		
	}

}
