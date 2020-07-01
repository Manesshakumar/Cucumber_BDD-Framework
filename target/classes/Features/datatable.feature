Feature: Parameterization Datatable Concept 

Scenario: Login Validation 

	Given User is on Login Page 
	And   The User enters UserName and Password 
		| batchautomation | Test@12345 |
	Then Click Login button 
	
