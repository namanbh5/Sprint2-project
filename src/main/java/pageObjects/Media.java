package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Media {
public WebDriver driver;
	

			
	By media = By.className("wp-has-submenu wp-not-current-submenu menu-top menu-icon-media selected");//click
	By addnew = By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a");//click
	By chooseupload = By.xpath("//*[@id=\"async-upload\"]");//click
	
	
	public Media(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	public WebElement getmedia()
	{
		return driver.findElement(media );
		
	}
	
	public WebElement getaddnew()
	{
		return driver.findElement(addnew );
		
	}

	public WebElement getchooseupload()
	{
		return driver.findElement(chooseupload);
		
	}
	

	
}
