package stepdefinitions;

import base.LibraryClass;
import base.Utlityclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DragandDropPage;
import pages.ViewPage;

public class DragandDropSteps {
	DragandDropPage drag ;
	Utlityclass util;
	
	public DragandDropSteps() {

		util=new Utlityclass(LibraryClass.driver.get());
		drag =new DragandDropPage();
	
	}

		@When("Click the View")
	public void click_the_view() {
	   drag.clickview();
	    System.out.println(" Clikced View");
	}

	@Then("Scroll down and Click Drag and drop link")
	public void scroll_down_and_click_drag_and_drop_link() {
	    drag.scrolldown();
	    System.out.println(" Clikced Drag and drop");
	}

	@Then("Drag from source to desitination")
	public void drag_from_source_to_desitination() {
	   drag.draganddrop();
	   System.out.println(" Dragged and dropped");
	}

	@Then("Take  the screen shot")
	public void take_the_screen_shot() {
		util.takeScreenshotWithTimestamp("Draganddrop");
	    
	}

}
