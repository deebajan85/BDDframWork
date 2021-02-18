package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailLoginObj extends Base {
	
	public RetailLoginObj() {
		
	
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (how = How.XPATH, using = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20'] ")
	
	private WebElement retailWebsite;
	
	@FindBy (how= How.XPATH, using = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20'] ")
	private WebElement deskTopTab;
	
	@FindBy (how = How.XPATH, using  = "//*[@class='see-all']")
	private WebElement showAllDesktop;
	
	
	
	
	
	public void clickOnRetailWebsite() {
		retailWebsite.click();
		
	}
	
	public void clickOnDeskTopTab() {
		deskTopTab.click();
	}
	
	public void clickonShowAllDesktop() {
		showAllDesktop.click();
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
}
	
	
	
	
	
}










