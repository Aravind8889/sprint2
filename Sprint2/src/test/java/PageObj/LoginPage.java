package PageObj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginTry() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
		Thread.sleep(1500);
	}
	
	public void loginCre(String emailid, String password) throws InterruptedException
	{
		driver.findElement(By.xpath("(//input)[1]")).sendKeys(emailid);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input)[2]")).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);
		String loginErr="Something went wrong...";
		String ErrL=driver.findElement(By.className("header")).getText();
		Assert.assertTrue(loginErr.contains(ErrL));
		System.out.println("Something went wrong...\r\n"
				+ "Invalid request");
	}
	
	
	
	public void validLogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saiaravindkumar88@gmail.com");
		System.out.println("email id is: saiaravindkumar88@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aravind88");
		System.out.println("password  is: aravind88");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	
	
}
