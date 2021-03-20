Feature: To Execute the test cases

  Background: 
    Given user has to launch the browser and hit the url

  Scenario: To validate if I can enter a text inside a email and password field
    When user has to click the your account button
    And user has to enter the email and password field
    And click the signin button
    Then user unable to sign in

  Scenario: To validate the create account field
    When user has to click the your account
    And user has to enter the email
    And click the continue button
    Then confirm the emailid page has to be visible

  Scenario: To validate the search box field
    When Enter the text in Search field
    And Click Search button
    Then search results will be displayed

  Scenario: To validate the mouseover action in all element in homepage
    When use mouseover in cycle
    And use mouse over in swim
    And use mouse over in trialthon
    And use mouse over in outdoors
    And use mouse over in gymand
    And use mouse over in nutrition and welness
    Then check the mouse over working results

  Scenario: To validate if I can click cycles and click road bikes in bikes
    When Mouse over the Cycles
    And in cycles mouseover the bikes
    And select road bikes
    Then road bikes will appear
