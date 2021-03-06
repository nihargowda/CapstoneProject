package Test.TestFolder;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
WebDriver driver;
	
	@Test
	@BeforeTest
	public void method1() {
	
	System.setProperty("webdriver.chrome.driver","D:\\simplilearn notes\\project files\\Capstone\\chromedriver.exe");
	
		 driver = new ChromeDriver();
		
		driver.get("http://localhost:4200/");
		driver.manage().timeouts().implicitlyWait(3000 ,TimeUnit.MILLISECONDS);

}
	
	@Test
	public void method2() {
		WebElement login= driver.findElement(By.partialLinkText("Login"));
		
		login.click();
		
		
		
		WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("ema3");
	
		WebDriverWait wait = new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		
		
		WebElement pass= driver.findElement(By.name("pswd"));
		pass.sendKeys("pass3");
		
		WebDriverWait wait1= new WebDriverWait(driver,500);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("pswd")));
		
		
		WebElement LoginUser= driver.findElement(By.cssSelector(".btn:nth-child(5)"));
		
		LoginUser.click();
	
		
	}
@Test
public void method3() {
	
	WebElement product= driver.findElement(By.cssSelector(".col-md-4:nth-child(2) .btn"));
	product.click();
	WebDriverWait wait1= new WebDriverWait(driver,500);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn:nth-child(5)")));

	
	
}


 @AfterTest
public void exit() {
	 driver.quit();
	
	
}




}