package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.Constants;
import io.cucumber.java.Before;
import utilities.Commonutilities;
import webdrivermanager.DriverManager;

public class Common_Step_Def {

	//launch the browser

	private static final Logger LOGGER=LogManager.getLogger(Common_Step_Def.class);
	
	@Before
	public  void beforescenario() {
		LOGGER.info("Exection started");
		try {
		//	Commonutilities.loadproperties();
		LOGGER.info("Instantiation the commonutilities");
		Commonutilities commonutilities=new Commonutilities();
		LOGGER.info("Loading the property files");
		commonutilities.loadproperties();
		LOGGER.info("Checking the driver is null or not?");
		
			if(DriverManager.getDriver()==null) {
			LOGGER.info("DRIVER is NULL.InstantiatiNG IT");
			DriverManager.LaunchBrowser();
			commonutilities.initeWebelements();
		}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
/*	public void launchbrowser() {

		try {
			switch (Constants.BROWSER) {
			case "chrome":
				System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_LOCATION); 
				LOGGER.info("Launching"+Constants.BROWSER);
				driver=new ChromeDriver();
				break;

			case "firefox":
				System.setProperty(Constants.FIREFOX_DRIVER,Constants.FIREFOX_DRIVER_LOCATION); 
				LOGGER.info("Launching"+Constants.BROWSER);
				driver=new ChromeDriver();
				break;

			case "ie":
				System.setProperty(Constants.EDGE_DRIVER,Constants.EDGE_DRIVER_LOCATION); 
				LOGGER.info("Launching"+Constants.BROWSER);
				driver=new ChromeDriver();
				break;

			default:
				System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_LOCATION); 
				LOGGER.info("Launching"+Constants.BROWSER);
				driver=new ChromeDriver();
				break;
			}
		}
		catch(Exception e) {

		}
	}*/
}
