package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.Directorypage;
import page_Objects.Homepage;
import page_Objects.Loginpage;
import webdrivermanager.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;

public class VerifyCeo_Name_Step_Def {

	private static final Logger LOGGER=LogManager.getLogger(VerifyCeo_Name_Step_Def.class);
	
	@Given("the user is logged in successfully and is on home page")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() {
		DriverManager.getDriver().get(Constants.APP_URL);
		//Loginpage.Username.sendKeys(Constants.USERNAME);
		//Loginpage.password.sendKeys(Constants.PASSWORD);
	//	Loginpage.login_button.click();
		
		//2.without static
		//Loginpage loginpage=new Loginpage();
		
	//	loginpage.getUsername().sendKeys(Constants.USERNAME);
	//	loginpage.getPassword().sendKeys(Constants.PASSWORD);
	//	loginpage.getLogin_button().click();
		
		//3.using singleton method
	//	Loginpage.getInstance();
	//	Loginpage.getInstance().getUsername().sendKeys(Constants.USERNAME);
	//	Loginpage.getInstance().getPassword().sendKeys(Constants.PASSWORD);
	//	Loginpage.getInstance().getLogin_button().click();
		
		//4.
		Loginpage.getInstance().enterusername(Constants.USERNAME);
		Loginpage.getInstance().enterpassword(Constants.PASSWORD);
		Loginpage.getInstance().enterlogin();
		
		String Url = DriverManager.getDriver().getCurrentUrl();
		if(Url.contains("dashboard")) {
			LOGGER.info("the user is logged in successfully and is on home page");
		}
	}

	@When("the user clicks on the directory option from the menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
		
		//Homepage.Directory.click();
		//2.
	//	Homepage homepage=new Homepage();
	//	homepage.getDirectory().click();
		
		//3.using singleton method
	//	Homepage.getInstance().getDirectory().click();
	//4.
		Homepage.getInstance().clickdirectory();
		
		LOGGER.info("the user clicks on the directory option from the menu bar");
	}

	@When("the user selects the job title as {string} from the drop down")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String Jobtitle) {
	  //  Select select=new Select(Directorypage.JOB_TITLE);
	  //  select.selectByVisibleText(Jobtitle);
	    //2.
	  //  Directorypage directorypage=new Directorypage();
	  //  Select select=new Select(directorypage.getJOB_TITLE());
	  //  select.selectByVisibleText(Jobtitle);
	    
	    //3.using singleton method
		
	//	Select select=new Select(Directorypage.getInstance().getJOB_TITLE());
	//	 select.selectByVisibleText(Jobtitle);
	  //4. 
		Directorypage.getInstance().selectjob(Jobtitle); 
		 
	    LOGGER.info("the user selects the job title as {string} from the drop down");
	}

	@When("clicks the search term")
	public void clicks_the_search_term() {
		
	//	Directorypage.SEARCH.click();
		
		//2.
	//	 Directorypage directorypage=new Directorypage();
	//	 directorypage.getSEARCH().click();
		
		//3.using singleton method
		 
	//	Directorypage.getInstance().getSEARCH().click();
	//4.	
		Directorypage.getInstance().clicksearch();
		
		LOGGER.info("clicks the search term");
	}

	@Then("the user should see the CEO name as {string}")
	public void the_user_should_see_the_ceo_name_as(String expectedname) {
	//	 Directorypage directorypage=new Directorypage();
	//	String actualname = Directorypage.NAME.getText();
	//	 String actualname = directorypage.getNAME().getText();
		 
		//3.using singleton method
		 
	//	String actualname = Directorypage.getInstance().getNAME().getText();
		
		//4.
		String actualname = Directorypage.getInstance().getpersonname();
		
		if(actualname.equalsIgnoreCase(expectedname))
			LOGGER.info("the user should see the CEO name as {string}");
	}
}
