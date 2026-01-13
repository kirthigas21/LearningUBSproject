package week5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//launch the browser
				driver.get("https://leafground.com/checkbox.xhtml");
				
		//maximize		
				driver.manage().window().maximize();
		//wait		
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//span[text()='Basic']")).click();
				driver.findElement(By.xpath("//span[text()='Ajax']")).click();
				Thread.sleep(3000);
				
				//boolean Message =  driver.findElement(By.xpath("//span[text()='checked']")).isDisplayed();
			
				//System.out.println("Both checkbox checked correctly" +Message);
				
				//Alert alert = driver.switchTo().alert();
				//String message = alert.getText();
				//System.out.println(message);
				
				String message =driver.findElement(By.xpath("//div[@class = 'ui-growl-message']")).getText();
					System.out.println(message);
				
					//Favourite Language select
					driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
					
					//Tri State Checkbox
					driver.findElement(By.xpath("(//div[@class='grid formgrid'])[4]//div[2]")).click();
					Thread.sleep(3000);
					
					System.out.println("After click of Tri State Checkbox, State has been changed to: "+driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText());
					
					
					driver.findElement(By.className("ui-toggleswitch-slider")).click();
					
					
					if(driver.findElement(By.className("ui-growl-title")).getText().equals("Checked"))
					{
						System.out.println("Message Expected after Toggle Switch: \"Checked\" :Displayed as Expected");
					}
					else
					{
						System.out.println("Message Expected after Toggle Switch: \"Checked\" : Not Displayed");
					}
					
					
					if(driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isSelected()==true)
					{
						System.out.println("'Verify the check box  status :'  The Field is enabled");
					}
					else
					{
						System.out.println("'Verify the check box  status:'  The field is disabled");
					}
					//select mutiple checkbox
					driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
					driver.findElement(By.xpath("//label[text()='Miami']/preceding-sibling::div")).click();
					driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div")).click();
					driver.findElement(By.xpath("//label[text()='Amsterdam']/preceding-sibling::div")).click();
					
					//close the multiple checkbox
					driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
					
					//validate selected values
					System.out.print(driver.findElement(By.xpath("(//span[@class='ui-selectcheckboxmenu-token-label'])[1]")).getText()+",");
					System.out.print(driver.findElement(By.xpath("(//span[@class='ui-selectcheckboxmenu-token-label'])[2]")).getText()+",");
					System.out.print(driver.findElement(By.xpath("(//span[@class='ui-selectcheckboxmenu-token-label'])[3]")).getText()+" cities were selected");
					
				//	driver.close();
						
	}

}

