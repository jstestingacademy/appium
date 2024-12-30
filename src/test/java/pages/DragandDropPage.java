package pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.LibraryClass;
import base.Utlityclass;
import io.appium.java_client.AppiumDriver;

public class DragandDropPage {

	private AppiumDriver driver;
	Utlityclass util;
	private By view=By.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
	private By drag=By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
	
    
	
	public DragandDropPage() {
		this.driver=LibraryClass.driver.get();
		this.util = new Utlityclass(driver);
		
	}
	
	public void clickview() {
		util.clickElement(view);
		
	    
	   
	}
	
	public void scrolldown() {
		util.scrollDown();
		util.clickElement(drag);
		
	}
	
	public void draganddrop() {
		util.getlocation();
	}
	
	
	
	
}
