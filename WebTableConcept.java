package seleniumConcetps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
	//	/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/form[1]/table[1]/tbody[1]/tr[10]/td[2]/a[1]
		//*id[='vContactsForm']/table/tbody/tr[4]td[2]/a
		//*id[='vContactsForm']/table/tbody/tr[5]td[2]/a
		//*id[='vContactsForm']/table/tbody/tr[6]td[2]/a
		//*id[='vContactsForm']/table/tbody/tr[7]td[2]/a

		String beforeXpath = "/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/form[1]/table[1]/tbody[1]/tr[";
		String afterXpath = "]/td[2]/a[1]";
		
		for(int i =4; i<=10; i++)
		{
			String name = driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			System.out.println(name);
			if(name.contains("Ankit joe")) {
		//		/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/form[1]/table[1]/tbody[1]/tr[6]/td[1]/input[1]
				driver.findElement(By.xpath("/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/form[1]/table[1]/tbody[1]/tr[" + i + "]/td[1]/input[1]")).click();
			}
		}

		//Method 2 :
			
			driver.findElement(By.xpath("//a[contains(text(), 'Ankit joe')]/parent::td/preceding-sibling::td//input[@name='contact_id']")).click();

}
}

