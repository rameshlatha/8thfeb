package Selenium1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex_program {
	public static WebDriver driver;


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		  if(str.equals("Edge"))
			  
		  { 
			  driver=new EdgeDriver();
		  } 
		  else 
		      { 
			  driver = new ChromeDriver();
			  }
		 		driver.get(" https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F\r\n");
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		  String st =driver.getTitle();
		  String exp="Dashboard / nopCommerce administration";
		  if(st.equals(exp))
		  {
			  System.out.println("title is passed");
		  }
		  else
		  {
			  System.out.println("title is failed");
		  }


	}

}
