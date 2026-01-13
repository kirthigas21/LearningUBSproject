package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class chromedriver {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
//launch the browser
		driver.get("https://www.facebook.com/");
		
//maximize		
		driver.manage().window().maximize();
//wait		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("testleaft2023@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.getTitle());
	
		//driver.close();

		
	}


}
