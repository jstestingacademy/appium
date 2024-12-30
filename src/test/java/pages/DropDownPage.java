package pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.LibraryClass;
import base.Utlityclass;
import io.appium.java_client.AppiumDriver;

public class DropDownPage {

	private AppiumDriver driver;
	Utlityclass util;
	
	private By view=By.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
	private By animation=By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]");
	private By Interplorators=By.xpath("//android.widget.TextView[@content-desc=\"Interpolators\"]");
	
	public DropDownPage() {
		this.driver=LibraryClass.driver.get();
		this.util = new Utlityclass(driver);
		
		
	}
	
	public void clickview() {
		util.clickElement(view);
		
	}
	

	public void clickAnimation() {
		util.clickElement(animation);
		
	}
	
	public void clickInterplorators() {
		util.clickElement(Interplorators);
	
	}
	
	public void handledropdown() {
		util.selectDropdownOption("Decelerate");
		
	}
	
	
}
