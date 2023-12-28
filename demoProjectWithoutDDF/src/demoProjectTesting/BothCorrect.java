package demoProjectTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothCorrect {

	@Test
	@Parameters({"username","password"})
	public void LoginWithCorrectCredentials(String uName, String pWord) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\WebDrivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		WebElement userName=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		userName.sendKeys(uName);
		
		WebElement passWord=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		passWord.sendKeys(pWord);
		
		WebElement LoginButton=driver.findElement(By.xpath("//button"));
		LoginButton.click();
		
	}
}
