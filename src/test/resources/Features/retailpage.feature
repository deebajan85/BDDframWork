Feature: Retail Website Feature
 Background: 
 Given User is on Retail website 
 
 
 Scenario Outline: Test Search Functionality with multiple set of Data 
	
	When User search for '<itemName>' 
	And User click on search button
 



Scenario: Register an Account Test case
Given user is on Retail Website
When User click on MyAccount 
And User click on Register option
And User fill Register form with Below Information












#Every feature file starts with feature: <Name of feature>
#Every Scenario start with Scenario: <Name of Test case we want to automate>
#Gherkin keyword are GIVEN WHEN THEN
#when is an Action taken
#Then is an expected result( We write Validation)
#And is repeating an action or can be used following Given keyword as well
#But is used for negative scenarios verification
#
#	Given User is on Retail website 
#	When User click on 'mP3player'
#	And User on Sort By button isDisplayed 
#	Then User should see MP3 Player image
	






