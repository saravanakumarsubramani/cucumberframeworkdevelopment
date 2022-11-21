package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Timesheetpage {
	private static Timesheetpage timesheetpageobjects=null;
	
	@FindBy(id="employee")
	private WebElement EMPLOYEE_NAME;
	
	@FindBy(id="btnview")
	private WebElement VIEW;
	
	@FindBy(id="//div[@class='message warning']")
	private WebElement MESSAGE;
	
	private static Timesheetpage getInstance;
	
	public static Timesheetpage getInstance() {
		if(timesheetpageobjects==null) {
			timesheetpageobjects=new Timesheetpage();	
	}
	return timesheetpageobjects;
	}
private Timesheetpage() {
		
	}
	public void enterEmployeeName(String name) {
		EMPLOYEE_NAME.sendKeys(name);
	}
	public void clickview() {
		VIEW.click();
	}
	public String getmessage() {
		return MESSAGE.getText();
	}
}
