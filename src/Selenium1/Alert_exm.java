package Selenium1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_exm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//simple alert

/*driver.findElement(By.id("alertBox")).click();
driver.switchTo().alert();
String msg1=driver.switchTo().alert().getText();
System.out.println(msg1);*/

//Confirmation alert

/*driver.findElement(By.id("confirmBox")).click();
driver.switchTo().alert();
 String msg2=driver.switchTo().alert().getText();
System.out.println(msg2);
driver.switchTo().alert().dismiss();*/

//prompt alert
driver.findElement(By.id("promptBox")).click();
driver.switchTo().alert();
 String msg3=driver.switchTo().alert().getText();
 Thread.sleep(3000);
 driver.switchTo().alert().sendKeys("latha");
 driver.switchTo().alert().accept();


	}

}
