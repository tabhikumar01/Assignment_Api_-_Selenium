package allSeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrameHandles {

	WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek.tiwari22\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//d.get("http://10.82.181.42/Automation/DemoApps/FrameExample.aspx");
		d.get("https://demoqa.com/frames");
		d.manage().window().maximize();
		//Implicit wait
	    d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
    
    @AfterClass
    public void afterClass() {
    	//d.quit();
    }
    @Test
    public void test() throws Exception {
  /*  driver.switchTo().frame("center");
    Thread.sleep(1000);
    String msg1=driver.findElement(By.xpath("//frame[@name='center']")).getText();
    Thread.sleep(1000);
    System.out.println(msg1);

    driver.switchTo().parentFrame();

    driver.switchTo().frame("left");
    Thread.sleep(1000);
    String msg2=driver.findElement(By.xpath("//frame[@name='left']")).getText();
    Thread.sleep(1000);
    System.out.println(msg2);*/
    	
    	driver.switchTo().frame(driver.findElement(By.id("frame1")));
    	Thread.sleep(5000);
    	driver.switchTo().defaultContent();
    	Thread.sleep(5000);
    	driver.switchTo().frame(driver.findElement(By.id("frame2")));
    	Thread.sleep(3000);
    	driver.switchTo().parentFrame(); //it switches to parent frame


    }
}
