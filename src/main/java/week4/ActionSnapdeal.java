package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionSnapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ChromeDriver driver=new ChromeDriver();
		//launch the browser
				driver.get(	"https://www.snapdeal.com/");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//span[@class ='catText' and contains(text(),'Men')]")).click();
				driver.findElement(By.xpath("//span[@class ='linkTest' and contains(text(),'Shoes')]")).click();
			String no = driver.findElement(By.xpath("//input[@id='searchWithinSearch']/parent::div/preceding-sibling::span")).getText();
	System.out.println("The no of sport shoes" + no);
	driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();	
	driver.findElement(By.xpath(".//ul[@class='sort-value']//li[2]")).click();

	List<WebElement> price = driver.findElements(By.xpath("//div[@class='product-desc-rating ']//span[@class='lfloat product-desc-price strike ']")).getText();
	System.out.println("Total Training Shoes Loaded: "+price.size());
	
	
	
	Action load = new  Actions(driver);		
	WebWebElement elementToScroll = driver.findElement(By.id("see-more-products"));
	
	load.scrollToElement(elementToScroll).perform();
	
	
				
				
				
				
				
				
				
				span[text()='Men's Fashion']
				
				

	}

}
