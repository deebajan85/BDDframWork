package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base {

	private static final String WebdriverUtility = null;

	// once we create Page Obj we need to extends the Base class use Parent Class
	// properties such is Webdriver driver
	// we create a constructor and inside the constructor we define the
	// PageFactory.initElements(driver, this)
	// method to initialize the WebElements in this page/

	public RetailPageObj() {
		PageFactory.initElements(driver, this);
	}

	// we need to store UI WebElements in a Private WebElement using @FindBy
	// annotations of
	// PageFactory class.

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;

	@FindBy(xpath = "(//a[text()='Register'])[1]")
	private WebElement registerOption;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;

	@FindBy(css = "#input-email")
	private WebElement emailField;

	@FindBy(id = "input-telephone")
	private WebElement telephoneField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;

	@FindBy(xpath = "(//input[@value='1'])[1]")
	private WebElement yesSubscribeButton;

	@FindBy(xpath = "(//input[@value='0'])[1]")
	private WebElement noSubscribeButton;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;

	// we need to create public methos to perform required actions on each elemtns
	// we stored.

	public void enterValueToSearachBar(String value) {

		WebDriverUtility.enterValue(searchBar, value);
	}

	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);

	}

	public boolean iphoneImageIsDispalyed() {

		if (iphoneImage.isDisplayed())
			return true;

		else
			return false;

	}

	// we need to create Methods to perform on each element

	public void clickOnRegister() {
		WebDriverUtility.clickOnElement(registerOption);

	}

	public void enterFirstName(String fName) {
		WebDriverUtility.enterValue(firstNameField, fName);

	}

	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastNameField, lName);

	}

	public void enterEmail(String email) {

		WebDriverUtility.enterValue(emailField, email);

	}

	public void enterTelephone(String phoneNumber) {
		WebDriverUtility.enterValue(telephoneField, phoneNumber);

	}

	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);

	}

	public void enterConfirmPassword(String confirmPassword) {

		WebDriverUtility.enterValue(confirmPasswordField, confirmPassword);

	}

	public void subscribe(String valueOfSubscribe) {

		if (valueOfSubscribe.equalsIgnoreCase("yes")) {
			WebDriverUtility.clickOnElement(yesSubscribeButton);

		} else
			WebDriverUtility.clickOnElement(noSubscribeButton);

	}

	public void CheckPrivacyPolicy() {

		if (privacyPolicyCheckBox.isDisplayed()) {

			privacyPolicyCheckBox.click();
		}

	}

	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);

	}

	public boolean registrationOutcome() {

		boolean successMessage = accountCreatedMessage.isDisplayed();
		return successMessage;

	}

}