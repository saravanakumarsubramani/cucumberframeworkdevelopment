@ceoname
Feature: This feature is to get the ceo name from the orangehrm app
Scenario: This test is to verify the ceo name
Given the user is logged in successfully and is on home page
When the user clicks on the directory option from the menu bar
And the user selects the job title as "Chief Executive Officer" from the drop down
And clicks the search term
Then the user should see the CEO name as "John Smith"
