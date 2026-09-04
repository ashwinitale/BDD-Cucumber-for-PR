Feature: Homepage functionality
Scenario: Verify title of page
Given user is at landing page
When page title should contain "Shopping"

Scenario: Verify cart icon is displaying
Given user is at landing page
When cart icon should displayed

Scenario: checkout the deal section
Given user is at landing page
When user click on deal section
Then user should redirect to deal page