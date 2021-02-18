
Feature: Retail Product Feature


@DeskTopLogin
Scenario: Login to see the Desktop page

Given User is on Retail website
When User click on Desktops tab
And User click on Show all desktops
Then User should see all items are present in Desktop page


 