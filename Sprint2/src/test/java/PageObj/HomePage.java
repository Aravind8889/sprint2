package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;


public class HomePage {
	WebDriver driver;
	PageFac rt;
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
   public void loginHome() throws InterruptedException
	{
	  
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saiaravindkumar88@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aravind88");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(1500);
	}
	
   //contact 
   
  public void contactNew() throws InterruptedException
  {
	  rt= new PageFac(driver);
		rt.getContacts().click();
		Thread.sleep(1500);
	  driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button")).click();
	   Thread.sleep(1500);
  }
   
   public void contactNam(String fname,String lname) throws InterruptedException
   {
	   
	    WebElement Fname=driver.findElement(By.xpath("//input[@name='first_name']"));
	       
	    WebElement Lname= driver.findElement(By.xpath("//input[@name='last_name']"));
	    Fname.sendKeys(fname);
	    driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	    Lname.sendKeys(lname);
	  
		  Thread.sleep(1500);
		   driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		   
		   
		    //String errFn="The field First Name is required";
		    //String errLn="The field Last Name is required";
	/*	if(fname.contains(" "))
		{
			String errExp1= driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/label/span")).getText();
			Assert.assertTrue(errExp1.contains(errFn));
			System.out.println(errFn);
		}
		Thread.sleep(1500);
		if(lname.contains(" "))
		{
			String errExp2 =driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/label/span")).getText();
			Assert.assertTrue(errExp2.contains(errLn));
			System.out.println(errLn);
		}
		*/   
   }
	/*
	public void comapnyErr(String fname,String lname) throws InterruptedException
	{
		 
	    String errFn="The field First Name is required";
	    String errLn="The field Last Name is required";
	if(fname.contains("1"))
	{
		String errExp1= driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/label/span")).getText();
		Assert.assertTrue(errExp1.contains(errFn));
		System.out.println(errFn);
	}
	Thread.sleep(1500);
	if(lname.contains("1"))
	{
		String errExp2 =driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/label/span")).getText();
		Assert.assertTrue(errExp2.contains(errLn));
		System.out.println(errLn);
	}
	}
	*/
	
	//deals
	public void dealOpen() throws InterruptedException
	{
		rt= new PageFac(driver);
		rt.getDeals().click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[3]/button")).click();
		Thread.sleep(1500);
	}
	
	public void dealPass() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")).sendKeys("DealtStep");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();
	    Thread.sleep(1500);
		Thread.sleep(1500);
		System.out.println("deal is created");
	}
	public void dealFail() throws InterruptedException
	{
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();
	    Thread.sleep(1500);
		Thread.sleep(1500);
		String deaErr="The field Title is required";
		String errDe=driver.findElement(By.className("inline-error-msg")).getText();
		Assert.assertTrue(errDe.contains(deaErr));
		System.out.println(deaErr);
	}
	
	
	
	//tasks
	
	public void taskopen() throws InterruptedException
	{
		rt= new PageFac(driver);
		rt.getTasks().click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button")).click();
		Thread.sleep(1500);
	}
	
	public void taskTit(String ttl) throws InterruptedException
	{
	WebElement titlet=	driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input"));
	titlet.sendKeys(ttl);
		Thread.sleep(1500);
	/*	if(ttl.contains(" "))
		{
			titlet.clear();
		}
		else
		{
			titlet.sendKeys(ttl);
		}
	*/	
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();
	    Thread.sleep(1500);
	    
	/*    String tasErr="The field Title is required";
	   if(ttl.contains(" "))
	    {
	    	String tas=driver.findElement(By.className("inline-error-msg")).getText();
	    	Assert.assertTrue(tasErr.contains(tas));
	    	System.out.println(tasErr);	
	   	
	    }
	  */  
}
	

	
	
	//companies
	
	public void companyOpen() throws InterruptedException
	{
		rt= new PageFac(driver);
		rt.getCompany().click();
				Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button")).click();
		Thread.sleep(1500);
	}
	
	public void companyNam(String nam) throws InterruptedException
	{
	WebElement companyn=	driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/input"));
		Thread.sleep(1500);
		companyn.sendKeys(nam);
	/*	if(nam.contains(" "))
		{
			companyn.clear();
		}
		else
		{
			companyn.sendKeys(nam);
		}
		*/
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();
	    Thread.sleep(1500);
	    
	   
	  //  String act="The field Name is required";
	  /*  if(nam.contains(" "))
	    {
	    	 String cmperr=driver.findElement(By.className("inline-error-msg")).getText();
	    Assert.assertTrue(cmperr.contains(act));
	    System.out.println(cmperr);
	    }
	   */
	}
	
}
