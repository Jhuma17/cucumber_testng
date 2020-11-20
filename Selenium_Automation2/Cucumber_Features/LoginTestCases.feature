Feature: Login function validations 

Scenario Outline: User able to successfully login & Verify the home page   
      
Given As a user I am able to open any browser
And As a user I am able to enter "https://www.zoopla.com/"
When As a user i can click on signin button 
And  As a user i can enter the "<userName>" and password "<passWord>"
And As a user i can click on login button
And Homepage title should be "Zoopla users can buy the property & sell the property"
And As a user i can click on logout link
Then Loginpage title should be "We know what a home is really worth"
And close the browser
Examples: 
		|userName              |passWord|
		|jhumarayyan@gmail.com |  Tuktuki2712|
		|jhumarayyan@icloud.com|  Tuktuki2713|
		|jhumarayyan1@gmail.com| Tuktuki27124| 