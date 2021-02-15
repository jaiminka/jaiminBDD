Feature: Etasy login feature

Scenario: Etasy login scenario

Given user is already on loginpage
When title of login page is Etsay
#Then user enters "jaimin" and "jaimin@123"  for with out examples keyword and with Scenario .
#Then user enters "<username>" and "<password>" for Scenario Outline with Examples keyword.
Then user enters username and password
|	jaimin	|	jaimin@123	|
Then user click on login button
And user is on homepage 

#Examples:
#|username	|	password	|
#|	jaimin	|	jaimin@123	|
#|	jay		|	jaimin@123	|