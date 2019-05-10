import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("deprecation")
public class Login {
	

	private WebDriver driver;
	
	@Before 
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "\\Users\\gustavo.teixeira\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://74fe609e.ngrok.io/login");
					
	}
	
	@After
	public void finaliza() {
	//driver.quit();
	}
	
	
	@Test 
	public void LoginPositivo() throws Throwable {
		driver.get("https://74fe609e.ngrok.io/login");
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("requestLogin")).click();
				
	}
	
	@Test 
	public void LoginNegativo() throws Throwable {
		driver.get("https://74fe609e.ngrok.io/login");
		driver.findElement(By.id("email")).sendKeys("admin@admin.com.br");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("requestLogin")).click();
				
	}
	
	

}
