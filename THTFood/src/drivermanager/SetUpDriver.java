package drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpDriver {
	static WebDriver driver;
	
	public static void iNit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/admin/auth/login");
		driver.manage().window().maximize();
	}
}
