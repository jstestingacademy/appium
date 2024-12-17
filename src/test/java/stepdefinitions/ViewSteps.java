package stepdefinitions;

import base.LibraryClass;
import base.Utlityclass;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ViewPage;

public class ViewSteps extends LibraryClass{

	ViewPage view ;
	Utlityclass util;
	
	public ViewSteps() {
		
			util=new Utlityclass(LibraryClass.driver.get());
			view =new ViewPage();
		
			
		}
		
	
	@Given("Launch the app")
	public void launch_the_app() {
	   System.out.println("Launched the app");
	}

	@When("Click the view Link")
	public void click_the_view_link() throws InterruptedException {
		
	Thread.sleep(2000);
	    view.Clickview();
	}

	@Then("Take Screenshot")
	public void take_screenshot() throws InterruptedException {
	
		util.takeScreenshotWithTimestamp("viewpage");
		Thread.sleep(2000);
	}

	@Then("Close the app")
	public void close_the_app() {
		
		System.out.println(" closed the app");
	}
	  

}
