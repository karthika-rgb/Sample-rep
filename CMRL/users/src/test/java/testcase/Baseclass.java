package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;



public class Baseclass {
	
	 
	
	public String BaseURL= "https://ganeshvana-cmrl-july-staging-14471524.dev.odoo.com/en_IN/web/login";
	public String username= "admin";
	public String password= "admin";
	public static WebDriver driver; 
	
	
	//common method in project
		@BeforeClass
		public void setup()
		{
			System.getProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Driver\\chromedriver-win64\\chromedriver.exe");	
			driver=new ChromeDriver();
	

}
}
