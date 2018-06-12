package seleniumConcetps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
	
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct");
		}
		else {
			System.out.println("in-correct");
		}
		
		alert.accept();
		
	

	}

}
