package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		//launch the browser
				driver.get(	"http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("Demosalesmanager");
				WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("crmsfa");
			     driver.findElement(By.xpath("//input[@value='Login']")).click();
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//div/ul[@class=\"shortcuts\"]/li[4]")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//div/form[@name= 'MergePartyForm']/table/tbody/tr/td[2]/table/tbody/tr/td[2]")).click();
				
				//div[2]/table/tbody/tr[1]/td[1]
				
				
				
		
	

	}

}
