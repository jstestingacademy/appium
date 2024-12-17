package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class Utlityclass  {
	 
	 private AppiumDriver driver;
	 
	 private int defaultTimeout = 30;
	 public Utlityclass(AppiumDriver driver) {
	        this.driver = driver;
	    }

	
	public boolean waitForInvisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
	
	
	  public WebElement waitForClickability(By locator, int timeout) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	        return wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }
	  
	  public void takeScreenshot(String filePath) {
	        try {
	            // Capture screenshot
	            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	            // Create directories if they don't exist
	            File destinationFile = new File(filePath);
	            destinationFile.getParentFile().mkdirs();

	            // Copy the screenshot to the destination
	            Files.copy(screenshot.toPath(), destinationFile.toPath());

	            System.out.println("Screenshot saved at: " + filePath);
	        } catch (IOException e) {
	            System.err.println("Failed to save screenshot: " + e.getMessage());
	        }
	    }
	    
	    public void takeScreenshotWithTimestamp(String fileName) {
	        String timestamp = String.valueOf(System.currentTimeMillis());
	        String defaultDirectory = "screenshots/";
	        String fullPath = defaultDirectory + fileName + "_" + timestamp + ".png";
	        takeScreenshot(fullPath);
	    }
	    
	    public void clickElement(By locator) {
	    	waitForClickability(locator, 10).click();
	    }
	    
	    
	    //Drag and drop
	    public void dragAndDrop(By source , By destination) {
	        try {
	            // Locate the source and target elements
	            WebElement sourceElement = driver.findElement(source); // Replace with actual source element locator
	            WebElement targetElement = driver.findElement(destination); // Replace with actual target element locator

	            // Get the location of source and target elements
	            int startX = sourceElement.getLocation().getX();
	            int startY = sourceElement.getLocation().getY();
	            int endX = targetElement.getLocation().getX();
	            int endY = targetElement.getLocation().getY();

	            // Perform drag and drop using TouchAction
	            new TouchAction((PerformsTouchActions) driver)
	                .press(PointOption.point(startX, startY)) // Press on the source element
	                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))) // Optionally wait for a while before moving
	                .moveTo(PointOption.point(endX, endY)) // Move to the target element
	                .release() // Release the touch action
	                .perform();

	            System.out.println("Drag and drop performed successfully!");
	        } catch (Exception e) {
	            // Log the error with more details
	            System.err.println("Drag and drop failed: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }	
	    //Scroll down
	    public void scrollDown() {
	        // Get the screen size
	        Dimension screenSize = driver.manage().window().getSize();
	        
	        // Get the height and width of the screen
	        int startX = screenSize.width / 2; // Start in the middle of the screen horizontally
	        int startY = (int) (screenSize.height * 0.8); // Start at 80% of the screen height
	        int endY = (int) (screenSize.height * 0.2); // Scroll down to 20% of the screen height

	        // Perform a swipe (scroll) down
	        new TouchAction((PerformsTouchActions) driver)
	            .press(PointOption.point(startX, startY)) // Start the press at (startX, startY)
	            .moveTo(PointOption.point(startX, endY)) // Move to (startX, endY)
	            .release() // Release the touch
	            .perform(); // Perform the action

	        System.out.println("Scrolled down successfully!");
	    }
}
	    
	    

