package Selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.logs.internal.SdkEventEmitterProvider;

public class Alert {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	d.manage().window().maximize();
/*d.findElement(By.name("alert")).click();
d.switchTo().alert();
String msg1=d.switchTo().alert().getText();
System.out.println(msg1);
d.switchTo().alert().accept();

//confirmation alert

d.findElement(By.name("confirmation")).click();
d.switchTo().alert();
String msg2=d.switchTo().alert().getText();
System.out.println(msg2);
d.switchTo().alert().dismiss();*/

//prompt alert
	
d.findElement(By.name("prompt")).click();
d.switchTo().alert();
String msg3=d.switchTo().alert().getText();
d.switchTo().alert().sendKeys("latha");
System.out.println(msg3);
d.switchTo().alert().accept();



	}

}
