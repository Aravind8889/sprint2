package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFac {
	WebDriver driver;
	
	public PageFac(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Company Tab
	@FindBy(xpath="//*[@id='main-nav']/a[4]/span")
	@CacheLookup
	WebElement company;
	
	//Contacts Tab
	@FindBy(xpath="//*[@id='main-nav']/a[3]/span")
	@CacheLookup
	WebElement contacts;	
	
	//Deals Tab
	@FindBy(xpath="//*[@id='main-nav']/a[5]")
	@CacheLookup
	WebElement deals;
	
	//Tasks Tab
	@FindBy(xpath="//*[@id='main-nav']/a[6]")
	@CacheLookup
	WebElement tasks;
	 	
	
	public WebElement getCompany() {
		return company;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getDeals() {
		return deals;
	
	}

	public WebElement getTasks() {
		return tasks;
	}


}
