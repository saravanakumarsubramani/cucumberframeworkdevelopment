package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.platform.commons.function.Try;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import page_Objects.Directorypage;
import page_Objects.Homepage;
import page_Objects.Loginpage;
import page_Objects.Timesheetpage;
import webdrivermanager.DriverManager;

public class Commonutilities {

	public  void loadproperties()  {
		
	//1.config properties in common 
	//	FileReader reader=null;
	//	try {
	//		 reader=new FileReader("config.properties");
	//	}catch (FileNotFoundException e) {
	//		e.printStackTrace();
	//	}
		Properties properties=new Properties();
	//	try {
	//		properties.load(reader);
	//	} catch (IOException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		
	//2.keep our files under resource
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	Constants.APP_URL=properties.getProperty("APP_URL");
	Constants.BROWSER=	properties.getProperty("BROWSER");
	Constants.USERNAME=	properties.getProperty("USERNAME");
	Constants.PASSWORD=	properties.getProperty("PASSWORD");
	Constants.CHROME_DRIVER_LOCATION=properties.getProperty("CHROME_DRIVER_LOCATION");
	Constants.FIREFOX_DRIVER_LOCATION=properties.getProperty("FIREFOX_DRIVER_LOCATION");
	Constants.EDGE_DRIVER_LOCATION=properties.getProperty("EDGE_DRIVER_LOCATION");
		
	}
	
	public void initeWebelements() {
	//	PageFactory.initElements(DriverManager.getDriver(), Loginpage.class);
	//	PageFactory.initElements(DriverManager.getDriver(), Homepage.class);
	//	PageFactory.initElements(DriverManager.getDriver(), Directorypage.class);
		
		PageFactory.initElements(DriverManager.getDriver(), Loginpage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), Homepage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), Directorypage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), Timesheetpage.getInstance());
		
	}
}
