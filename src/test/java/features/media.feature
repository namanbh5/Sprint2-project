Feature: Media

Feature: Login into Application
  User should login with valid credentials

  Scenario Outline: Positive test validating login

    Given Initialize the browser with chrome
    And Navigate to "http://realty-real-estatem1.upskills.in/" website
    And Click on Login link in home page to land on Secure sign in Page
    Then User enters <username> and <password>
    And Click on login button
    And verify you have successful login
    Then Click on Media option
    And Click on Add new option
    And select the files
    And Click on open option
    And Click on 	Upload option
  

Examples:
|username	|mohankrishna176@gmail.com|
|password	|Secret@123&&|































































































































































































































