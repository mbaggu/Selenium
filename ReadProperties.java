package seleniumConcetps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\mbaggu\\eclipse-workspace\\MyProject\\src\\seleniumConcetps\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name")); // We need to pass the exact value used in Config.properties
		System.out.println(prop.getProperty("age")); // This property is commented. So it will return NULL value
		String url = prop.getProperty("URL");
		
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
				
		} 
		
		else if(browsername.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		driver.get(url);
		}
		
		}
