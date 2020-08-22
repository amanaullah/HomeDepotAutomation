package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeP {
	
	public WebDriver driver;
	@FindBy (xpath = "(//*[text()='My Account'])[1]")
	WebElement MyAccountText;
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement Register;
	
	
	
	public HomeP(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
			
	
	
public void MyAccountClick() {
	MyAccountText.click();
}
public void RegisterButtonClick() {
	Register.click();
}

}
