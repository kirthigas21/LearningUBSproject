package stepsdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editlead extends projectspecificmethod{
	
	@Given("Click on the CRMSFA link  button")
	public void Click_on_CRMSFA_link_button () {
		
		driver.findElement(By.linkText("CRM/SFA")).click();		

	}



}
