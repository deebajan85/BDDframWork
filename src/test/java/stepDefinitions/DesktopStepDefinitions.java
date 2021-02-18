package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebDriverUtility;

public class DesktopStepDefinitions extends Base {
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
	    
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
	    
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
	    
		
}
	Base.initializeDriver();
	logger.info("Retail page is opened");
	String actualPageTitle = RetailLoginObj.getPageTitle();
	String expectedPageTitle = "TEK SCHOOL";
	Assert.assertEquals(expectedPageTitle, actualPageTitle);
	logger.info("Page title  is verified");
	WebDriverUtility.screenShot();
	
}
