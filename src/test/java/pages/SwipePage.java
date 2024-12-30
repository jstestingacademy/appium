package pages;

import org.openqa.selenium.By;

import base.LibraryClass;
import base.Utlityclass;
import io.appium.java_client.AppiumDriver;

public class SwipePage {
	private AppiumDriver driver;
	Utlityclass util;
	
	private By view=By.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
	private By animation=By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]");
	private By Interplorators=By.xpath("//android.widget.TextView[@content-desc=\"Interpolators\"]");
	
	public SwipePage() {
		this.driver=LibraryClass.driver.get();
		this.util = new Utlityclass(driver);
	}
	
	public void horizontalswipe() {
		util.swipeHorizontally();
	}
	
	public void verticalswipe() {
		util.swipeVertically();
	}
}
