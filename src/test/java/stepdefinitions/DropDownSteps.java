package stepdefinitions;

import base.LibraryClass;
import base.Utlityclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DragandDropPage;
import pages.DropDownPage;

public class DropDownSteps {
	
	DropDownPage drop ;
	Utlityclass util;
	
	public DropDownSteps() {
		util=new Utlityclass(LibraryClass.driver.get());
		drop=new DropDownPage();
	}


	@When("Click view")
	public void click_view() {
		drop.clickview();
		 System.out.println("Clicked view");
	    
	}

	@Then("Click Animation")
	public void click_animation() {
	    drop.clickAnimation();
	}

	@Then("Click Interplorators")
	public void click_interplorators() {
	    drop.clickInterplorators();
	}

	@Then("Handle Drop Down")
	public void handle_drop_down() {
	    drop.handledropdown();
	}

	@Then("Take Screen shot")
	public void take_screen_shot() {
	    util.takeScreenshotWithTimestamp("Dropdown");
	}



}
