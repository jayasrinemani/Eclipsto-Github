package Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	Thread.sleep(5000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.id("btnLogin")).click();
		
		Actions actions =new Actions(driver);
		
         actions.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).click().perform();
         Thread.sleep(5000);
         actions.moveToElement(driver.findElement(By.id("menu_admin_Organization"))).click().perform();
         Thread.sleep(5000);
         actions.moveToElement(driver.findElement(By.id("menu_admin_viewLocations"))).click().perform();
         Thread.sleep(5000);
         driver.findElement(By.id("searchLocation_name")).sendKeys("TexasR&D");
         Thread.sleep(5000); 
         driver.findElement(By.id("btnSearch")).click();
         Thread.sleep(5000); 
         actions.contextClick().perform();
         Thread.sleep(5000); 
         driver.close();
	}
}
