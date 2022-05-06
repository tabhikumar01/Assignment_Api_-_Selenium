package allSeleniumAssignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {

		WebDriver d; // Driver Object for Interface
// Read properties file
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\abhishek.tiwari22\\eclipse-workspace\\Selenium_bootcamp\\src\\test\\java\\day7\\config.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek.tiwari22\\Drivers\\chromedriver_win32\\chromedriver.exe"); // Setting the browser name,Setting
																					// the path of the webdriver
			d = new ChromeDriver();

		}

	}
}
