package page_Objects;



import org.bouncycastle.asn1.cms.Time;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	//using singleton
	
	private static Homepage homepageinstance;
	private Homepage() {
		
	}
	public static Homepage getInstance() {
		if(homepageinstance==null) {
			homepageinstance=new Homepage();
		
	}
	return homepageinstance;
	}
	@FindBy(linkText="Directory")
	private  WebElement Directory;

	@FindBy(linkText="Time")
	private  WebElement Time;

	/*
	  public WebElement getDirectory() { 
	  return Directory; 
	  }
	 */
	public void clickdirectory() {
		Directory.click();
	}
	public void clickTime() {
		Time.click();
	}
	
}
