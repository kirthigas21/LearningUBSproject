import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpage {
	
	
	public static void main (String args[]) throws Exception
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/crmsfa/control/main");
		
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");	
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("loginButton")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='frameSection']/div[@class='frameSectionBody']"));
		WebElement shortcutsSection =
		        driver.findElement(By.xpath("//ul[@class='shortcuts']"));

		List<WebElement> links =
		        shortcutsSection.findElements(By.tagName("a"));
	
	//System.out.print(links);
	
	Thread.sleep(1000);
	
	for (WebElement a : links )
	{
		
		if(a.getText().contains("Create Account"))
				{
			 a.click();
			 break;
				}
	}
		
	}

}
