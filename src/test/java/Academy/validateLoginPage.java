package Academy;
import java.io.IOException;
import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import resources.Base;
public class validateLoginPage extends Base {
	 
	 @BeforeTest
	 public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 driver.get(prop.getProperty("url"));
		}
	 @Test
	 public void login() throws IOException{
			 LoginPage lp =new LoginPage(driver);
			 lp.getUsername().sendKeys("mohankrishna176@gmail.com");
		     lp.getPassword().sendKeys("Secret@123&&"); 
		     lp.getLogin().click();
	 }
	 @AfterTest
	 public void teardown() {
		     driver.close();
			 driver=null; 
		 
			 
				 
			 }
	 
	
		}