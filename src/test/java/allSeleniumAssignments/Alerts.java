package allSeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Alerts {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhishek.tiwari22\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
//simple alert
		driver.findElement(By.id("accept")).click();
		Alert simple = driver.switchTo().alert();
		Thread.sleep(2000);
		simple.accept();
//Confirm alert
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
//Prompt alert
		driver.findElement(By.id("prompt")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Abhi");
		prompt.accept();
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
