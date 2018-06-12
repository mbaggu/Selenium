package seleniumConcetps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
	
		/*System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://github.com/mozilla/geckodriver/releases");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		*/
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentURL);
		String ps=driver.getPageSource();
		System.out.println(ps);
		
		if(title.equals("Google")) {
			System.out.println("Expected == Actual");
		}
		else
		{
			System.out.println("Expected != Actual");
		}
		
		driver.close();

	}

}
