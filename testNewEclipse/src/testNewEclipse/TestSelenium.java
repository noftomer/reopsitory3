package testNewEclipse;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	static WebDriver driver;
	@BeforeClass
	public static void start() {//
		System.out.println("start");
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver_original.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void t1() {
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
	}
	@AfterClass
	public static void end() {
		driver.quit();
		System.out.println("end");
	}
}
