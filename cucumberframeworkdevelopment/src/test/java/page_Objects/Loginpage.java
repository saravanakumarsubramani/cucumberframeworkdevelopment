package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	
	private static Loginpage LoginInstance;
	
	private Loginpage() {
		
	}
	
	public static Loginpage getInstance() {
		
		if (LoginInstance==null) {
			LoginInstance=new Loginpage();
		}
		return LoginInstance;
	}

	@FindBy(name="username")
	private  WebElement Username;
	
	@FindBy(name="password")
	private  WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private  WebElement login_button;

//	public WebElement getUsername() {
//		return Username;
//	}
//
//	public WebElement getPassword() {
//		return password;
//	}

	//public WebElement getLogin_button() {
	//	return login_button;
//	}
	public void enterusername(String username) {
		Username.sendKeys(username);
	}
	public void enterpassword(String password) {
		this.password.sendKeys(password);
	}
	public void enterlogin() {
		login_button.click();
	}
	
}
