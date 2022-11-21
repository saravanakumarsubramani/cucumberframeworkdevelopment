package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page_Objects.Homepage;
import page_Objects.Timesheetpage;
import webdrivermanager.DriverManager;

public class Verify_Timesheet {
	
	private static Logger LOGGER= LogManager.getLogger();

	@Given("the user is on the homepage")
	public void th_user_is_on_the_homepage() {
	   String url=DriverManager.getDriver().getCurrentUrl();
		
	   if(url.contains("dashboard")) {
		   LOGGER.info("the user is on the homepage");
	   }
	}

	@Given("the user clicks on the time option from the menu")
	public void the_user_clicks_on_the_time_option_from_the_menu() {
		Homepage.getInstance().clickTime();
		//LOGGER.info("the user clicks on the time option from the menu");
		//System.out.println("the user clicks on the time option from the menu");
	}

	@Given("the user enters the name as {string}")
	public void the_user_enters_the_name_as(String name) {
		Timesheetpage.getInstance().enterEmployeeName(name);
		//System.out.println("the user enters the name as john smith");
	}

	@Given("clicks on the view button")
	public void clicks_on_the_view_button() {
		Timesheetpage.getInstance().clickview();
		//System.out.println("clicks on the view button");
	}

	@Then("the user should see the message as {string}")
	public void the_user_should_see_the_message_as(String expectedmessage) {
	 String actualmessage=Timesheetpage.getInstance().getmessage();
	 if(expectedmessage.equals(actualmessage))
		 LOGGER.info("the user should see the message as john smith");
	}
}
