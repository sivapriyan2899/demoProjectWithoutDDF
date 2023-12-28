package demoProjectTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothInCorrect {
	
	@Test
	@Parameters({"username","password"})
	public void LoginWithInCorrectCredentials(String uName, String pWord) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\WebDrivers\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(3000);
	
	WebElement userName=driver.findElement(By.name("username"));
	userName.sendKeys(uName);
	
	WebElement passWord=driver.findElement(By.name("password"));
	passWord.sendKeys(pWord);
	
	WebElement LoginButton=driver.findElement(By.xpath("//button"));
	LoginButton.click();

	}
	
}
