package com.info.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.info.base.BaseTest;

public class HomePage extends BaseTest{

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName_TextBox;
	
	
	@FindBy(xpath = "//div[@class='oxd-form-row']//div[@class='oxd-input-group__label-wrapper']//i[@class='oxd-icon bi-person oxd-input-group__label-icon']/following-sibling::label")
	private WebElement userName_title;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password_textBox;
	@FindBy
	(xpath = "//div[@class='oxd-form-row']//div[@class='oxd-input-group__label-wrapper']//i[@class='oxd-icon bi-key oxd-input-group__label-icon']/following-sibling::label")
	private WebElement passwordTextBoxTitle;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	private WebElement headingOfLoginBoard;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	private WebElement forgotPassLink;
	
	@FindBy(xpath = "//img[@alt='company-branding']")
	private WebElement BrandingLogo;
	
	@FindBy(xpath = "//img[@alt='orangehrm-logo']/ancestor::div[@class='orangehrm-login-logo']")
   private 	WebElement orangeHRMLogo;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
private WebElement errorMassageOFUserName;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement errorMassageInvalidLogin;
@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
private WebElement Login_Button;

/** getterMethods*/
public WebElement getLogin_Button()
{
	return Login_Button;
}
	public WebElement getUserName_TextBox() {
		return userName_TextBox;
	}
	public WebElement getPassword_textBox()
	{
		return password_textBox;
	}

	public WebElement getUserName_title() {
		return userName_title;
	}

	public WebElement getPasswordTextBoxTitle() {
		return passwordTextBoxTitle;
	}

	public WebElement getHeadingOfLoginBoard() {
		return headingOfLoginBoard;
	}

	public WebElement getForgotPassLink() {
		return forgotPassLink;
	}

	public WebElement getBrandingLogo() {
		return BrandingLogo;
	}

	public WebElement getOrangeHRMLogo() {
		return orangeHRMLogo;
	}

	public WebElement getErrorMassageOFUserName() {
		return errorMassageOFUserName;
	}

	public WebElement getErrorMassageInvalidLogin() {
		return errorMassageInvalidLogin;
	}
	
	/** constructor */
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
/**  buisness logic */
	public String getTitle()
	{
	  return	driver.getTitle();
	}
	public boolean isBrandingLogoDisplayed()
	{
	return	getBrandingLogo().isDisplayed();
	}
	public boolean isOrangeHRMLogoDisplayed()
	{
		return getOrangeHRMLogo().isDisplayed();
	}
	public String getheadingOfLoginBoard()
	{
		return getHeadingOfLoginBoard().getText();
	}
	public boolean userIDBoxIsEnabled()
	{
		return getUserName_TextBox().isEnabled();
		
	}
	public boolean password_textBoxIsEnabled()
	{
		return getPassword_textBox().isEnabled();
	}
	public boolean userIDBoxIsDisplayed()
	{
		return getUserName_TextBox().isDisplayed();
	}
	public boolean password_textBoxIsDisplayed()
	{
		return getPassword_textBox().isDisplayed();
	}
	
	public boolean forgotPasswordLinkIsDisplayed()
	{
		return getForgotPassLink().isDisplayed();
	}
	
	public void doLogin()
	{
		getUserName_TextBox().sendKeys(config.getUserID());
		log.info("userId provided");
		getPassword_textBox().sendKeys(config.getPassword());
		log.info("password provided");
		getLogin_Button().click();
	}
	
	public boolean isPlaceholderOfUserIDCorect()
	{
	return 	getUserName_TextBox().getAttribute("placeholder").equals(data.expectedplaceholder_userID());
	}
	
}
