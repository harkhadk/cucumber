Feature: TF login functionality validation 


@Scenario1 @smoke 
Scenario: user should be able to login with valid credentials 
	Given User is on techfios login page 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc123" 
	When User clicks on signin button 
	Then User should be on Dashboard page 
	
@Scenario2 @smoke 
Scenario: user should be able to login with valid credentials 
	Given User is on techfios login page 
	When User enters username as "demo@techfios.com" 
	When User enters password as "abc1234" 
	When User clicks on signin button 
	Then User should be on Dashboard page