package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.LoginPage;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Scanner;


public class StepDef {

	public WebDriver ldriver;
	public LoginPage loginpg;
	WebDriver driver;
	
	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		loginpg =new LoginPage(driver);	
	}

	@When("User operns URL {string}")
	public void user_operns_url(String Url) 
	{
	   driver.get(Url);
	}
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String Password)
	{
		loginpg.enteremail(emailadd);
		loginpg.enterPassword(Password);
	}
	@When("Click on Login")
	public void click_on_login()
	{
		loginpg.ClickOnLoginbutton();
	}
	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedtitle) 
	{
	   String actualtitle =driver.getCurrentUrl();
	   if(actualtitle==(expectedtitle));
	   {
		 
	   }
	  
	   
	}
	@When("User click on Log out link")
	public void user_click_on_log_out_link()
	{
	    
	}
	@Then("close browser")
	public void close_browser() 
	{
	  driver.close();
	  driver.quit();
	}
}
