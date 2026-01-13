package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttask {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		//launch the browser
				driver.get("https://www.leafground.com/alert.xhtml");
				
		//maximize		
				driver.manage().window().maximize();
				driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				Thread.sleep(3000);
				Alert alert = driver.switchTo().alert();
				alert.sendKeys("kirthiga");
				alert.accept();
				
				WebElement  key = driver.findElement(By.id("confirm_result"));
				
		String print = 	key.getText();
		
		System.out.println("The text entered is :" +print);
				
		// TODO Auto-generated method stub

	}

}
