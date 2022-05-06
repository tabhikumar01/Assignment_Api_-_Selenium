package allSeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//For Chrome
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek.tiwari22\\Drivers\\chromedriver_win32\\chromedriver.exe");
				WebDriver d = new ChromeDriver();
				
				
				//For Firefox 
				//WebDriver d = new FirefoxDriver();
				//System.setProperty("webdriver.gecko.driver", "");
				
				
				d.get("https://www.techlistic.com/p/selenium-practice-form.html");
				d.manage().window().maximize();
				//Implicit wait
			    d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				//Testing the text
				String msg= d.findElement(By.xpath("//h3[@class='post-title entry-title']")).getText();
				if (msg.equals("Demo Sign-Up Selenium Automation Practice Form")) {
					System.out.println("Test passed");
					
				}
				else
					System.out.println("Test Failed");
				
				
				d.findElement(By.name("firstname")).sendKeys("Abhishek");
				d.findElement(By.name("lastname")).sendKeys("Tiwari");
				d.findElement(By.id("sex-0")).click();
				d.findElement(By.id("datepicker")).sendKeys("23/03/2022");
				d.findElement(By.id("profession-1")).click();
				d.findElement(By.id("tool-2")).click();
				
				 WebElement type=d.findElement(By.id("continents"));
					Select t=new Select(type);
					t.selectByIndex(1);
					
					WebElement type1=d.findElement(By.id("selenium_commands"));
					Select t1=new Select(type1);
					t1.selectByVisibleText("Navigation Commands");
					
					// WebElement type3 =d.findElement(By.className("input-file"));
					// element2.click();
					// element2.sendKeys(""C:\Users\abhishek.tiwari22\seleniumImg.jpg"");

					
					d.findElement(By.linkText("Click here to Download File")).click();
					Thread.sleep(1000);
					d.navigate().back();

					d.findElement(By.id("submit"));
					
				
				
				
				//d.quit();

	}

}
