package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObj.HomePage;
import PageObj.LoginPage;
import PageObj.PageFac;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRMStep {
	WebDriver driver;
	LoginPage fr;
	HomePage hm;
	PageFac pf;
	@Before
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freecrm.co.in/index.html");
		Thread.sleep(1500);
	}
	
	@After
	public void teardoen()
	{
		driver.close();
	}
	
	
	
	@Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {
		fr= new LoginPage(driver);
		fr.loginTry();
    }

    @Given("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {
    	 hm=new HomePage(driver);
         hm.loginHome();
    }

    @When("^User enters on Email(.+) and password(.+)$")
    public void user_enters_on_email_and_password(String emailid, String password) throws Throwable {
    	  
      fr.loginCre(emailid, password);
    }

    @When("^User enters valid email and password$")
    public void user_enters_valid_email_and_password() throws Throwable {
    
      fr.validLogin();
    }

    @When("^User clicks on Contacts and add new$")
    public void user_clicks_on_contacts_and_add_new() throws Throwable {
    	
    	
    	hm.contactNew();
    
    }

    @When("^User clicks on Deals and add new and enters title$")
    public void user_clicks_on_deals_and_add_new_and_enters_title() throws Throwable {

      hm.dealOpen();
      hm.dealPass();
    }

    @When("^User clicks on Deals and add new and clicks save$")
    public void user_clicks_on_deals_and_add_new_and_user_enters_title_deal_empty() throws Throwable {
    
        hm.dealOpen();
        hm.dealFail();
    }

    @When("^User clicks on Tasks$")
    public void user_clicks_on_tasks() throws Throwable {
    
       hm.taskopen();
       
    }

    @When("^User clicks on Companies and add new and enters name(.*)$")
    public void user_clicks_on_companies_and_add_new_and_enters_name(String nam) throws Throwable {
    
    	Thread.sleep(1500);
       hm.companyOpen();
       hm.companyNam(nam);
    }

    @Then("^Error message should displays as unsuccessful login$")
    public void error_message_should_displays_as_unsuccessful_login() throws Throwable {
    System.out.println("user unable to login");
    }

    @Then("^User logged in succesfully$")
    public void user_logged_in_succesfully() throws Throwable {
    	System.out.println("user logged in successfully");
    }

    @Then("^New contact should be created$")
    public void new_contact_should_be_created() throws Throwable {
    	System.out.println("User tries to create a new contact");
    }

    @Then("^New deal should be created$")
    public void new_deal_should_be_created() throws Throwable {
    	System.out.println("user created a deal");
    }

    @Then("^New deal should not be created$")
    public void new_deal_should_not_be_created() throws Throwable {
    	System.out.println("user not able to create a deal");
    }

    @Then("^New task should be created$")
    public void new_task_should_be_created() throws Throwable {
    	System.out.println("user tried created a task");
    }

    @Then("^New company should be created$")
    public void new_company_should_be_created() throws Throwable {
    	System.out.println("user tried to create a company");
    }

    @And("^entes Firstname(.*) and last name(.*)$")
    public void entes_firstname_and_last_name(String fname, String lname) throws Throwable {
    	Thread.sleep(1500);
      hm.contactNam(fname, lname);
    }

    @And("^add new and enters task(.*)$")
    public void add_new_and_enters_task(String ttl) throws Throwable {
    	 hm.taskTit(ttl);
    }


}
