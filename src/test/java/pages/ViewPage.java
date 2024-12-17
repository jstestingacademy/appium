package pages;


import org.openqa.selenium.By;

import base.LibraryClass;
import base.Utlityclass;
import io.appium.java_client.AppiumDriver;

public class ViewPage {
	private AppiumDriver driver;
	Utlityclass util;
	private By viewoption=By.xpath("//android.widget.TextView[@content-desc='Views']");

	public ViewPage() {
		this.driver=LibraryClass.driver.get();
		this.util = new Utlityclass(driver);
	}
	
	public void Clickview() throws InterruptedException {
		Thread.sleep(4000);
		util.clickElement(viewoption);
	}
	
	
}
