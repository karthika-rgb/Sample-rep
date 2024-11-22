package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver ldriver;
	
	public  Loginpage(WebDriver rdriver)
{
ldriver=rdriver;	
PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="login")
	WebElement txtUserName;
	
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	 @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	 WebElement txtsubmit;
	 
	 @FindBy(how = How.XPATH, using = "//button[@class='o_notification_close btn']")
	 WebElement popup;
	
	 
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"result_app_6\"]")
	 WebElement subscription;
	
	 
	 //action method
	
	 public void login(String uname, String pwd) {
		 
		 txtUserName.sendKeys("admin");
		 txtPassword.sendKeys("admin");
		 
				}
	 

	 
	 public void submit()
	 {
		 txtsubmit.click();
	 }

	 public void popup()
		{
			popup.click();
		}
		 
		 
		 public void sub()
		 {
			subscription.click();
		 }
}
