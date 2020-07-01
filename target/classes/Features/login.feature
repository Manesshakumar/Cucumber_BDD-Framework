Feature: CRM Login Action
 
#Cucumber Testcase without Paramaterization :
#Scenario: Successful Login with Valid Credentials

 #Given User is on Login Page
 #When  The user check logo of the Login Page
 #And   The User enters UserName and Password
 #Then  The user is on Home Page
 #And Close the Browser
 
 
 #Parameterization without Example Keyword
#Given User is on Login Page
#When  The user check logo of the Login Page
# And   The User enters "batchautomation" and "Test@12345"
#Then  The user is on Home Page
#And Close the Browser


 #This is used to run the same scenario for 2 or more different sets of test data. 
 #Parameterization with Example Keyword
Scenario Outline: Successful Login with Valid Credentials
 
 Given User is on Login Page
 When  The user check logo of the Login Page
 And   The User enters "<username>" and "<password>"
 
 
 Examples:
    | username        | password |
    | batchautomation | Test@12345 |
   
 
