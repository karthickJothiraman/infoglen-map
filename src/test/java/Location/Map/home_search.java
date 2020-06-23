package Location.Map;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.google.common.io.Files;
import resources.Base;

public class home_search extends Base
{
	@Test(dataProvider="getdata")
	public void BasepageNavigation(String location) throws IOException
	{
		driver = initializeDriver();
		driver.get("https://www.google.com/maps/");
		driver.manage().window().maximize();
		
		Search s = new Search(driver);
		s.getSearch().sendKeys(location);
		s.getsearchbutton().click();
		s.getRating().getText();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("E:\\Wankhede Stadium.png"));
		
		if( driver.findElement(By.xpath("//input[@id='searchboxinput']")).equals("Wankhede stadium"));
	    {
	    	System.out.println("Stadium present in search Box");
	    }
	    
	    
	    
	    if (driver != null)
            driver.close();
}
	@DataProvider
	public Object [] getdata() 
	{

		Object [] data = new Object[1];
		data[0]="Wankhede Stadium";
		return data;

   }
}
