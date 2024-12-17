package pages;

import org.openqa.selenium.By;

import base.LibraryClass;
import base.Utlityclass;
import io.appium.java_client.AppiumDriver;

public class DragandDropPage {

	private AppiumDriver driver;
	Utlityclass util;
	private By viewoption=By.xpath("//android.widget.TextView[@content-desc='Views']");
	private By draganddrop=By.xpath("//android.widget.TextView[@content-desc='Views']");
	private By source=By.xpath("//android.widget.TextView[@content-desc='Views']");
	private By destination=By.xpath("//android.widget.TextView[@content-desc='Views']");

	public DragandDropPage() {
		this.driver=LibraryClass.driver.get();
		this.util = new Utlityclass(driver);
	}
	
	public void Clickview() throws InterruptedException {
		Thread.sleep(4000);
		util.clickElement(viewoption);
	}
	
	public void scroll() {
		util.scrollDown();
		util.clickElement(viewoption);
	}
	
	public void drop() {
		util.dragAndDrop(source, destination);
	}
	
}
