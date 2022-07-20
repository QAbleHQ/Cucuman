Feature: Add New User

 Background: Admin is logged In
  When I submit username and password
  Then I should be logged in

Scenario: To verify that Super admin is able to Add new user as client admin role with mapping
Given Admin is on tracking page
When Admin click on User module
Then Super Admin redirect to User page
When Admin click on new user
Then Super Admin redirect to create a new User page
When Admin enters name
And Admin enter email
And Admin enters phone number
And Admin enter password
And Admin select client admin role
And Admin click on create button
Then Created user shows in user list with details
