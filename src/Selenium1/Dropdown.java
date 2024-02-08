package Selenium1;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Select drpdwn=new Select(driver.findElement(By.id("course")));
//drpdwn.selectByVisibleText("java");
//drpdwn.selectByIndex(3);
//drpdwn.selectByValue("python");
  
//multiple selection dropdown

Select multidown=new Select(driver.findElement(By.xpath("//select[@id=\'ide\']")));
if(multidown.isMultiple())
{
	multidown.selectByIndex(0);
	multidown.selectByValue("vs");
}*/
	}

}
