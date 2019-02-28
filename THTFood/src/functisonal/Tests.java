
package functisonal;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.DriverManager;
import drivermanager.DriverManagerFactory;
import drivermanager.DriverManagerFactory.DriverType;

public class Tests {
	
	DriverManager driverManager;
	WebDriver driver;
	LoginPage loginPage;
	
	@BeforeClass
	public void setUp() {
		driverManager =DriverManagerFactory.getDriverManager(DriverType.CHROME);
		driver = driverManager.getWebDriver();
		driver.get("http://127.0.0.1:8000/admin/auth/login");
	}
	
	@Test
	public void loginTest() {
		loginPage = new LoginPage(driver); 
		loginPage.login("admin", "admin");
		Assert.assertEquals("Admin  | Dashboard", driver.getTitle());
	}
	

}


//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");