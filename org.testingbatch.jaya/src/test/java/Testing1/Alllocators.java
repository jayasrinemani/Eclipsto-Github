package Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Alllocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				//open browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				//Launch site 
				driver.get("http://www.github.com/login");
				Thread.sleep(5000); 
				//fill userid
			WebElement e=driver.findElement(By. name("login"));
			e.sendKeys("Hi Jayasri");
			Thread.sleep(5000);
			WebElement e1=driver.findElement(By.id("login_field"));
			e1.sendKeys("hai@gmail.com");
			Thread.sleep(5000);
			WebElement e2=driver.findElement(By.className("header-logo"));
			e2.click();
			Thread.sleep(5000);
			// using link text - forgot password
						WebElement e3=driver.findElement(By.linkText("Forgot password?"));
						e3.click();
						Thread.sleep(5000); 
						
						//using partial link text 
						WebElement e4=driver.findElement(By.partialLinkText("Create a"));
						   e4.click(); 
						   
						   // using tag 
						WebElement e5=driver.findElement(By.tagName("h1"));
						e5.click();
						  System.out.println("locating of sign is successfull"); 
						   Thread.sleep(5000);
						   driver.close();
						   }
		

	}


