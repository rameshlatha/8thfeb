package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exc_newtours {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(3000);

		//driver.findElement(By.name("userName")).sendKeys("mercury");
		//driver.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
		

	}

}
