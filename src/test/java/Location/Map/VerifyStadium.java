package Location.Map;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import resources.Base;

public class VerifyStadium extends Base
 {
	@Test  
	public void BasepageNavigation() throws IOException
		{
			driver = initializeDriver();
			driver.get("https://www.google.com/maps/");
			driver.manage().window().maximize();
		    
			
			String Actual = driver.getTitle(); 
		    String Expected = "Wankhede Stadium";


		
		}
	  }
 
