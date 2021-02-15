Feature: sign up feature

Scenario: sign up scenario

Given user is aleady on homepage
When user click on sign in button and register button
Then user enter the valid details of sign up
|	email			|	firstname	|	password	|
|	kachadiyajaimin	|	jaimin		|	jaimin123	|
|	sfkakbfsaowe	|	viswadsafa	|	jasijfia	|	
Then browser close