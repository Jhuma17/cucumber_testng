Feature: Zoopla users can buy & sell the property

Description: "User can search the property, check the price, contact with the agent." 
                           
Scenario Outline: Login with valid credential & Verify the home page   
      
Given As a user I am able to open any browser
And As a user I am able to enter "https://www.zoopla.com/"
When As a user I am able to click on signin button 
And  As a user I am able to enter the "<userName>" and password "<passWord>"
And As a user I am able to submit signin button
And Homepage title should be "Browse properties by city or town in the UK|We know what a home is really worth"
And As a user I can enter the location & search it
And As a user I can print all the price values
And As a user I can select the fifth property on list
And As a user I can verify the agent logo, name & phone no  
And As a user I can click on logout link
Then As a user I can verify the logout title "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents"
Examples: 
|userName              |passWord|                                                                                                                   
|jhumarayyan@gmail.com |  Tuktuki2712|
 