package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utlis.Driver;

public class page {
	
	public page() {
		
		 PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//a[contains(text(), 'Login')]")
	public WebElement loginLink; 

	

}
