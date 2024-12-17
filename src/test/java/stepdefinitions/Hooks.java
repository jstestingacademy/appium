package stepdefinitions;

import base.LibraryClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends LibraryClass{
	@Before
    
	 public void setUp() throws Exception {
		intailiazedriver();
	    }
 

   @After
   public void tearDown() {
	   quitdriver();
   }
}
