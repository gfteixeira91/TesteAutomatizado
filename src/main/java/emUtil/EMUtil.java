package emUtil;

import org.openqa.selenium.By;

import emUtil.Util;

public class EMUtil {
	 private Util util;
	    
	 public EMUtil(Util util) {
	        this.util = util;
}
	
	public void abrirPagina() {
        this.util.getDriver().get("https://74fe609e.ngrok.io/login");
	}
	public void realizarLoginSiteEM() throws Exception {
	       this.abrirPagina();
	       this.util.getDriver().findElement(By.id("email")).sendKeys("admin@admin.com");
	       this.util.getDriver().findElement(By.id("password")).sendKeys("123456");
	       this.util.getDriver().findElement(By.id("requestLogin")).click();
			//driver.quit();
	}
}
	         	     