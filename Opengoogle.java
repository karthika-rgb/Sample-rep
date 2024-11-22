package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {

	
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("Webdriver.chrome.driver", "C:\\Software\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ganeshvana-keimed2905-staging-13422382.dev.odoo.com/web/login");

		driver.manage().window().maximize();


		//String array[][]= { {"admin","admin"} , {"admin","admin"} };

		//for(int i=0; i<array.length-1 ; i++){




		//login
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//sales

		driver.findElement(By.xpath("//a[@data-menu-xmlid='sale.sale_menu_root']")).click();

		Thread.sleep(1000);

		//new

		driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();

		//dropdown

		WebElement dd =driver.findElement(By.id("partner_id_0"));
		dd.click();

		driver.findElement(By.xpath("(//a[@class='dropdown-item ui-menu-item-wrapper text-truncate'])[1]")).click();


		//add product
		driver.findElement(By.linkText("Add a product")).click();

		//[59] product

		WebElement prod = driver.findElement(By.xpath("//div[@name='product_template_id']"));
		prod.click();
		driver.findElement(By.xpath("(//li[@class='o-autocomplete--dropdown-item ui-menu-item d-block'])[2]")).click();

		Thread.sleep(1000);

		//save
		driver.findElement(By.xpath("//*[@class='fa fa-cloud-upload fa-fw']")).click();

		Thread.sleep(1000);

		//confirm
		driver.findElement(By.name("action_confirm")).click();
		Thread.sleep(1000);
		//delivery
		driver.findElement(By.name("delivery_count")).click();
		Thread.sleep(1000);

		//1st entry
		driver.findElement(By.xpath("//*[@data-tooltip='WH/Stock']")).click();
		Thread.sleep(1000);



		//qty edit
		WebElement edit=driver.findElement(By.xpath("//td[@class='o_data_cell cursor-pointer o_field_cell o_list_number']"));
		edit.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement qty = driver.findElement(By.xpath("//input[@inputmode='decimal']"));
		qty.click();
		qty.clear();
		qty.sendKeys("1");


		//validate
		WebElement validateButton=driver.findElement(By.name("button_validate"));
		validateButton.click();

		Thread.sleep(1000);

		//prev btn
		driver.findElement(By.xpath("//button[@class='oi oi-chevron-left btn btn-secondary o_pager_previous px-2 rounded-start']")).click();

		WebElement validateButton1=driver.findElement(By.name("button_validate"));
		validateButton1.click();

		driver.findElement(By.xpath("//button[@class='oi oi-chevron-left btn btn-secondary o_pager_previous px-2 rounded-start']")).click();

		Thread.sleep(1000);

		//1/3
		WebElement edit1=driver.findElement(By.xpath("//td[@class='o_data_cell cursor-pointer o_field_cell o_list_number']"));
		edit1.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement qty1 = driver.findElement(By.xpath("//input[@inputmode='decimal']"));
		qty1.click();
		qty1.clear();
		qty1.sendKeys("1");

		Thread.sleep(1000);

		WebElement validateButton2=driver.findElement(By.name("button_validate"));
		validateButton2.click();
		Thread.sleep(1000);

		//s.no

		driver.findElement(By.xpath("//*[@data-tooltip='Back to \"S00150\"']")).click();
		Thread.sleep(1000);

		//create invoice
		driver.findElement(By.id("create_invoice")).click();

		//draft invoice
		driver.findElement(By.id("create_invoice_open")).click();

		//confirm
		driver.findElement(By.name("action_post")).click();

		Thread.sleep(1000);


		//logout
		WebElement logoutButton = driver.findElement(By.xpath("//*[@class='o_avatar o_user_avatar rounded']"));
		logoutButton.click();


		driver.findElement(By.xpath("//*[@data-menu='logout']")).click();

		driver.quit();
}
}
