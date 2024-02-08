package Selenium1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sele_day3 {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
driver.get("https://demo.opencart.com/");                   //open url
driver.manage().window().maximize();                       //size of webpage

driver.findElement(By.name("search")).sendKeys("phone");           //find the name webelements 

 boolean logoStatus=driver.findElement(By.id("logo")).isDisplayed();     //find the id of webelements using with boolean
System.out.println("logo display status:"+logoStatus);

driver.findElement(By.linkText("Tablets")).click();        // find the linktext

driver.findElement(By.partialLinkText("Table")).click();       // find the partiallinktext

List<WebElement>headlinks =driver.findElements(By.className("list-inline-item"));     //find the classname
System.out.println( "number of header links "+headlinks.size());

 List<WebElement>image=driver.findElements(By.tagName("img"));           // find the img tagname
System.out.println("total num of imgs:"+image.size());

//num of links in tagname

List<WebElement>links=driver.findElements(By.tagName("a"));                      
System.out.println("total num of links"+links.size());
for(WebElement link:links)                                         //num of text links displayed
{
	System.out.println(link.getText());
}
//driver.quit();
	}

}
