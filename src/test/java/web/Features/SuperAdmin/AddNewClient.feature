
Feature: Add New Client

Background: Admin is logged In
  When I submit username and password
  Then I should be logged in

@Regression @NewFeature @DD-101
Scenario: To verify that Super admin is able to Add new client

Given Admin is on tracking page
When Admin click on admin tab
Then Admin redirect on admin page
And Create a new client button should display
When I click on Create a new client button
Then New create a client page should open
When Admin enters client name
And Admin select Line Of Business "Fleet"
And Admin enters email
And Admin enters phone number "9033660480"
And Admin enters Address "402 QAble"
And Admin enters city "Ahmedabad"
And Admin enters state "Gujarat"
And Admin select country "India"
And Admin clicks create button
Then Client created successfully message should display
And Created client should display in client list