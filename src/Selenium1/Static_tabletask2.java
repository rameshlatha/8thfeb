package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_tabletask2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://Seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();   //no of rows
		System.out.println("num of row in table:"+rows);
		int colums=driver.findElements(By.xpath("//table[@id='customers']//th")).size();     //no of colums
		System.out.println("no of colums:"+colums);
		
		//click on checkbox if the company name is Amazon
		
		List<WebElement>tabledata=driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		for(WebElement options:tabledata)
		{
			String values=options.getText();
			if(values.equals("Amazon"))
			{
				driver.findElement(By.xpath("//td[text()='Amazon']//preceding-sibling::td//input")).click();
			}	
				else if(values.equals("UK")) 
				 {
				driver.findElement(By.xpath("//td[text()='UK']//following-sibling::td//a")).click();
			     }
		}
		



	}

}
