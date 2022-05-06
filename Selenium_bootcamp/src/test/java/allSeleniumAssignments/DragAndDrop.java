package allSeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;



public class DragAndDrop {
WebDriver driver;
@BeforeMethod
public void BeforeMethod() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek.tiwari22\\Drivers\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();

driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
}
@Test
public void Test() throws InterruptedException
{
driver.switchTo().frame(0);
WebElement drag = driver.findElement(By.id("draggable"));
WebElement drop = driver.findElement(By.id("droppable"));
Actions drag_and_drop = new Actions(driver);
drag_and_drop.dragAndDrop(drag, drop);
Thread.sleep(3000);
drag_and_drop.perform();
}

@AfterMethod
public void quit()
{
System.out.println("Test Passed");
//driver.quit();
}




}
