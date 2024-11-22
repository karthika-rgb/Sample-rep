package testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageobject.Loginpage;

public class TestC_001 extends Baseclass{
	
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(BaseURL);
		Loginpage lp= new Loginpage(driver);
		Baseclass bp= new Baseclass();
		
		String[][] users = {
	            {"admin", "admin"},
	            {"test", "admin"}
	        };
	
		for (String[] user : users) {
            // Login with each user
			lp.login(username, password);

	
	}
	}

	
	//data provider to  store all un & pwd  
@DataProvider(name = "LoginData")
public String[][] getData() {
return new String[][]{
  {"admin", "admin"},
  {"test", "admin"},
  
    };
}
}
}


