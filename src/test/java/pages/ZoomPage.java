package pages;

import org.openqa.selenium.By;

import base.LibraryClass;
import base.Utlityclass;
import io.appium.java_client.AppiumDriver;

public class ZoomPage {
	private AppiumDriver driver;
	Utlityclass util;
	
	private By Graphics=By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]");
	private By Bitmapmesh=By.xpath("//android.widget.TextView[@content-desc=\"BitmapMesh\"]");
	private By zoompicture=By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.view.View");
	
	public ZoomPage() {
		this.driver=LibraryClass.driver.get();
		this.util = new Utlityclass(driver);
		
	}
	
	public void clickGraphics() {
		util.clickElement(Graphics);
	}
	
	public void Bitmapmesh() {
		util.clickElement(Bitmapmesh);
	}
	public void zoompic() {
		util.zoom(zoompicture);
	}
	

}
