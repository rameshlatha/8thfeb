package Selenium1;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Wait_implicity {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='enable-button']")));
driver.findElement(By.xpath("//button[@id='enable-button']")).click();



	}

}
