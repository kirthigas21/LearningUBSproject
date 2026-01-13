package week4;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frametask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		//launch the browser
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				
			//Thread.sleep(3000);
			//	List<WebElement> iframeElements = driver.findElements(By.tagName("iframeResult"));
				//System.out.println("Total number of iframes are " + iframeElements.size());
				
			driver.switchTo().frame("iframeResult");
				
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
				Alert alertkey = driver.switchTo().alert();
				alertkey.accept();
				
				
				alertkey.getText();
				
				

	}

}
