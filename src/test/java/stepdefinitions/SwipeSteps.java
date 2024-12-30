package stepdefinitions;

import base.LibraryClass;
import base.Utlityclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DragandDropPage;
import pages.DropDownPage;
import pages.SwipePage;

public class SwipeSteps {
	SwipePage swipe ;
	Utlityclass util;
	public SwipeSteps() {
		util=new Utlityclass(LibraryClass.driver.get());
		swipe=new SwipePage();
	}
	@When("Perform Horizontal Swipe")
	public void perform_horizontal_swipe() {
	   swipe.horizontalswipe();
	}

	@Then("Take Screen_shot")
	public void take_screen_shot() {
	    util.takeScreenshotWithTimestamp("hswipe");
	}

	@When("Perform Vertical Swipe")
	public void perform_vertical_swipe() {
	    swipe.verticalswipe();
	}

	@Then("Capture Screen_shot")
	public void capture_screen_shot() {
	    util.takeScreenshotWithTimestamp("vswipe");
	}

}
