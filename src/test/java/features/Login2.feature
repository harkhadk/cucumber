Feature: TF login functionality validation 


@md
Scenario Outline: user should be able to input different username and password 

	Given User is on techfios login page 
	When User enters username as "<username>" 
	When User enters password as "<password>" 
	When User clicks on signin button 
	Then User should be on Dashboard page 
	
	Examples: 
		|username	|			password|
		|demo@techfios.com|		abc123|
		|demo2@techfios.com|	abc123|
		|demo@techfios.com|		abc1234|