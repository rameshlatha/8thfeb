package Selenium1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoqa_app1 {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
	    d.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		
		d.findElement(By.id("userName")).sendKeys("latha");
		d.findElement(By.id("userEmail")).sendKeys("latha123@gmail.com");
		d.findElement(By.id("currentAddress")).sendKeys(" 2/34 ,n.s.k.street.chennai");
		d.findElement(By.id("permanentAddress")).sendKeys("2/34 ,n.s.k.street.chennai");
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.id("submit")).submit();

d.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
d.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]")).click();
d.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();
//d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();

	}

}
