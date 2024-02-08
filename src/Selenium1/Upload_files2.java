package Selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_files2 {

	public static void main(String[] args) throws AWTException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/upload/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//upload file using send keys method
		//d.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\latharamesh\\OneDrive\\Desktop");
		
		WebElement ele=d.findElement(By.id("uploadfile_0"));
		Actions act=new Actions(d);
		act.moveToElement(ele).click().perform();
		
	Robot RB=new Robot();     		                           //upload file using robot class
	StringSelection ss=new StringSelection("‪C:\\Users\\latharamesh\\OneDrive\\Desktop\\Asos");  //copy the file from local folder
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//paste the data
		RB.keyPress(KeyEvent.VK_CONTROL);
		RB.keyPress(KeyEvent.VK_V);
		
		//release the keys
		RB.keyPress(KeyEvent.VK_CONTROL);
		RB.keyPress(KeyEvent.VK_V);
		
		//enter  key on keyboard to upload the file
		RB.keyPress(KeyEvent.VK_ENTER);
		RB.keyPress(KeyEvent.VK_ENTER);
		

		
		
	}

}
