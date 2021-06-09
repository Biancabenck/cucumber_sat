Feature: Verify valid login (Positive Test), Invalid login (negative Testing)

Background:
Given User is at the login page

Scenario: Successful login and verify message
When User enters a valid username and password
And User clicks on login button
Then User should be able to verify dashboard text

Scenario Outline: verify invalid login
When User enters "<Username>" and "<Password>" and click login
Then User should be able to verify invalid text

Examples:
|   Username   |   Password    |
|   user1      |   admin123    |
|   Admin     | blackusername  |