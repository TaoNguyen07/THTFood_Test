package functisonal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class LoginAdminPage {
//	
//	static WebDriver driver;
//	
//
//	public static void login(String userName, String password) {
//		setUserName(userName);
//		setPassword(password);
//		clickLogin();
//	}
//
//
//	public static void setUserName(String userName) {
//		driver.findElement(By.xpath("/html/body/div[1]/div/form/div[1]/input")).sendKeys(userName);
//		System.out.print(userName);
//	}
//
//
//	public static void setPassword(String password) {
//		driver.findElement(By.xpath("//form//input[@name='password']")).sendKeys(password);
//	}
//	
//	private static void clickLogin() {
//		driver.findElement(By.xpath("//form/div//button[@type='submit']")).click();
//	}
//	
//	public static void main(String[] args) {
//		SetUpDriver.iNit();
////		login("admin", "admin");
//		setUserName("cunguyendev");
//	}
//
//}



public class LoginAdminPage {

	
	static WebDriver driver;
	
//	Create an instance of the driver
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
//	Navigate to a Railway and Maximize the browser
	public static void NavigateRailway() {				
		driver.get("http://127.0.0.1:8000/admin/auth/login");
		driver.manage().window().maximize();
	}
	

	
//  Register	
	public static void Login(String username, String password) {
	    driver.findElement(By.xpath("//form//input[@name='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//form//input[@name='password']")).sendKeys(password);

	    driver.findElement(By.xpath("//form/div//button[@type='submit']")).click();}
	    
	public static void main(String[] args) {
		init();
		NavigateRailway();
		Login("admin", "admin");
	}
}
