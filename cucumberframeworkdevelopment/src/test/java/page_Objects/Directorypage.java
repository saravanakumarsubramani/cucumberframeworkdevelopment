package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Directorypage {

	// using singleton
	
	private static Directorypage directorypage;
	
	private Directorypage() {
		
	}
	public static Directorypage getInstance() {
		if(directorypage==null) {
			directorypage=new Directorypage();
		}
		return directorypage;
	}
	
	@FindBy(id="searchDirectory_job_title")
	private  WebElement JOB_TITLE;
	
	@FindBy(id="searchBtn")
	private  WebElement SEARCH;
	
	@FindBy(xpath = "//ul//li/b")
	private  WebElement NAME;

	/*
	  public WebElement getJOB_TITLE() { return JOB_TITLE; }
	  
	  public WebElement getSEARCH() { return SEARCH; }
	 
	  public WebElement getNAME() { return NAME; }
	 */
	public void selectjob(String Jobtitle) {
		Select selectjob =new Select(JOB_TITLE); 
		selectjob.selectByVisibleText(Jobtitle);
	}
	public void clicksearch() {
		SEARCH.click();
	}
	public String getpersonname() {
		 return NAME.getText();
	}
}
