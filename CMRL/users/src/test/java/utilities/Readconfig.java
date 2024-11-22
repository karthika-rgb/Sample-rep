package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
Properties	pro;
	
	public Readconfig()
	{
		File src= new File("./Configuration/config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
				pro=new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			System.out.println("Exception is" +e.getMessage());
		}
		
		
	}

	public String BaseURL()
	{
		String url = pro.getProperty("BaseURL");
		return url;
	}
	
	
	public String username()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	
	public String password()
	{
		String password = pro.getProperty("password");
		return password;
	}
	public String chromepath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	

}
