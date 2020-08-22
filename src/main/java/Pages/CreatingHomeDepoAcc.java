package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingHomeDepoAcc {

	public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Select & Continue')]")
	WebElement ContinueButton;
	
	@FindBy(xpath="//p[@class='u__bold u__text-align--center u__husky']")
	WebElement CreateAccountText;
	
	@FindBy(xpath="//span[text()='Back']")
	WebElement BackLink;
	
	@FindBy(id="email")
	WebElement EmailField;
	
	@FindBy(id="password-input-field")
	WebElement PasswordField;
	
	@FindBy(id="zipCode")
	WebElement ZipCodeField;
	
	@FindBy(id="phone")
	WebElement PhoneNumberField;
	
	@FindBy(xpath="//div[@class='myAccount--button u--marginSmall-bottom']//label[@class='checkbox-btn__label-test u__text-align--left']")
	WebElement CheckBoxButton;
	
	@FindBy(xpath="//span[contains(text(),'Create an Account')]")
	WebElement CreateAccountLink;

	
public CreatingHomeDepoAcc(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

public void SelectContiClick() {
	 ContinueButton.click();
}

public void Eamil() {
	EmailField.sendKeys("syeda786@yahoo.com");
}

public void Password() {
	PasswordField.sendKeys("agheg1870");
}
public void Zipcode() {
	ZipCodeField.sendKeys("19805");
}
public void Phone() {
	PhoneNumberField.sendKeys("30278657864");
}
public void ChechkBoxClick() {
CheckBoxButton.click();
}
public void CreateAccButton() {
	CreateAccountLink.click();
}

}
