package testNGExplenation;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import dev.failsafe.Timeout;

public class DemoTestClass {
	
	WebDriver driver; //WebDriver Taking Globaly
	@BeforeMethod
	public void ActitimeLoginfo()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium+Chrome\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/user/submit_tt.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	
	@Test(priority=1,groups="ABC")
	public void verifylogo()
	{
	boolean logo =driver.findElement(By.xpath("//img[@src='/img/default/top_nav/default-logo.png?hash=1106883454']")).isDisplayed();
     if(logo==true)
     {
    	 System.out.println("Log Is Displyaed");
     }
     else
     {
    	 System.out.println("Logo Is Not Displayed");
     }
	}
	@Test(priority=2,groups="ABC")
	public void TaskTab()
	{
	boolean tab =driver.findElement(By.xpath("(//img[@src='/img/default/pixel.gif?hash=1106883454'])[8]")).isDisplayed();
	Assert.assertTrue(tab);
	}
	@Test(priority=3)
	public void verifylogout()
	{
	boolean logout =driver.findElement(By.xpath("//a[@class='logout']")).isDisplayed();
     Assert.assertEquals(logout, true,"Result Is Not True");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
