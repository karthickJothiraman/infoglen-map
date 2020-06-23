package Location.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search 

 {
	public WebDriver driver;
	
	By search = By.xpath("//input[@id='searchboxinput']");
	By searchbutton = By.id("searchbox-searchbutton");
	By Rating = By.xpath("//div[@class='gm2-display-2']");
	
	public Search(WebDriver driver) 
	{
	// TODO Auto-generated constructor stub
	this.driver = driver;
    }
public WebElement getSearch()
{
	 return driver.findElement(search);
}
public WebElement getsearchbutton()
{
	return driver.findElement(searchbutton);
}
	public WebElement getRating()
	{
	return driver.findElement(Rating);
	}
}

