Feature: Application login

  Scenario Outline: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to  "http://realty-real-estatem1.upskills.in/" website
    And Click on Login link in home page to land on Secure sign in Page
    When User enters <username> and <password> and logs in
    Then Verify that user is succesfully logged in
    And close browsers

    Examples: 
      | username                  | password     |
      | mohankrishna176@gmail.com | Secret@123&& |
      | username                  | password     |
      | mohankrishna17qukvdcu6@gmail.com | Secqcqk uret@123&& |
      