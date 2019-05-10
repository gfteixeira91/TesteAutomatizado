package emUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {
	private WebDriver driver;
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "\\Users\\gustavo.teixeira\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://74fe609e.ngrok.io/login");
	}
    public WebDriver getDriver() {
        return driver;
    }

}
