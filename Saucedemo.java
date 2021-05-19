package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Saucedemo
{
	public static void main(String args[]) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	    driver.findElement(By.name("login-button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("shopping_cart_link")).click();
	    driver.findElement(By.name("checkout")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Ankit");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Gupta");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("272002");
	    Thread.sleep(4000);
	    driver.findElement(By.name("continue")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("finish")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("react-burger-menu-btn")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    Thread.sleep(4000);
	    driver.findElement(By.id("logout_sidebar_link")).click();
	    Thread.sleep(2000);
	}
}