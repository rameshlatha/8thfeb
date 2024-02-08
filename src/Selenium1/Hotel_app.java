package Selenium1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hotel_app {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
driver.findElement(By.name("username")).sendKeys("vamshinani");
driver.findElement(By.name("password")).sendKeys("Vamshi@133");
driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[6]/td[2]/input")).click();

	}

}
