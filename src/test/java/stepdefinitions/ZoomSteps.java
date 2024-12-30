package stepdefinitions;

import base.LibraryClass;
import base.Utlityclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DropDownPage;
import pages.ZoomPage;

public class ZoomSteps {
	ZoomPage zoom ;
	Utlityclass util;
	
	public ZoomSteps() {
		util=new Utlityclass(LibraryClass.driver.get());
		zoom=new ZoomPage();
	}
	
	
	@When("Click Graphics")
	public void click_graphics() {
	   zoom.clickGraphics();
	}

	@Then("Click Bitmapmesh")
	public void click_bitmapmesh() {
	    zoom.Bitmapmesh();
	}

	@Then("Zoom the picture")
	public void zoom_the_picture() {
	   zoom.zoompic();
	}

	@Then("Take screenshot")
	public void take_screenshot() {
	   util.takeScreenshotWithTimestamp("zoompic");
	}
}
