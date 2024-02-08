package Selenium1;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.hyrtutorials.com/p/waits-demo.html");
		dr.manage().window().maximize();
		Wait<WebDriver> wait=new FluentWait(dr).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(ElementNotInteractableException.class);
dr.findElement(By.id("btn1")).click();
//wait.until(ExpectedConditions.visibilityOfAllElements(By.xpath("")));

	}

}
