package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
public class Exm2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/\r\n");
		Thread.sleep(3000);
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
Thread.sleep(3000);
String exp=driver.getTitle();
String act=("OrangeHRM");
if(exp.equals(act))
{
	System.out.println("test passed");
}
else
{
	System.out.println("test failed");
}
	}

}
