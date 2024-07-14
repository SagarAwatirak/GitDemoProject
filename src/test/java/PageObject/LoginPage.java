package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	WebDriver ldriver;
	//Decleration 
    @FindBy(id="Email")
     WebElement email;
    
    @FindBy(id="Password")
    WebElement password;
    
    @FindBy(xpath="//button[@class='button-1 login-button']")
     WebElement LoginBtn;
    
    @FindBy(linkText="Logout")
    WebElement logout;
    

    //initailazation
    
      public LoginPage(WebDriver rDriver)
    {
    	  ldriver=rDriver;
    	PageFactory.initElements(rDriver,this);
    }
    
    //Usage
    
    public void enteremail(String emailadd)
    {
    	email.clear();
    	email.sendKeys("emailadd");
    }
    public void enterPassword(String pwd)
    {
    	password.clear();
    	password.sendKeys(pwd);
    }
    public void ClickOnLoginbutton()
    {
    	LoginBtn.click();
    }
    public void ClickOnLogoutbutton()
    {
    	logout.click();
    }

    
}


