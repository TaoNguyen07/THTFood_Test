
package functisonal;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.SetUpDriver;
import functisonal.LoginAdminPage;

public class Tests {
	
	WebDriver driver;
	LoginAdminPage loginPage;
	
	@BeforeClass
	public void setUp() {
		SetUpDriver.iNit();
		driver.get("http://127.0.0.1:8000/admin/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest() {
		LoginAdminPage.login("admin", "admin");
		Assert.assertEquals("Admin  | Dashboard", driver.getTitle());
	}
	

}


//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");