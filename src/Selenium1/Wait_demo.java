package Selenium1;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_demo {

	public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.hyrtutorials.com/p/waits-demo.html");
	//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.findElement(By.id("Add Textbox1")).click();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	d.findElement(By.id("Add Textbox1")).sendKeys("latha");
	d.findElement(By.id("Add Textbox2")).click();
	d.findElement(By.id("Add Textbox2")).sendKeys("R");
	

	}

}
