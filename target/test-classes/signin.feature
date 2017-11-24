@Login
Feature:Sign in To


  Scenario: sign in
    Given I go to Url "https://www.d3dsecurity.co.uk/"
    #alt enter
    When I click Login button
    Given I enter login as "test1@yahoo.com"
    And I enter password as "Testing1"
    When I click Log in button on login page
   Then I should see "D3D Security Systems" header with menu
   And I should see My Account button
   And I should see Log Out button

@Signin_invalid
  Scenario:NegativeScenario for Sign in.
    Given I go to Url "https://www.d3dsecurity.co.uk/"
    When I click Login button
    Given I enter login as "test1yahoo.com"
    And I enter password as "Testing1"
    When I click Log in button on login page
    Then I should see  error message "Wrong credentials"

@Aboutus
  Scenario:
    Given I go to Url "https://www.d3dsecurity.co.uk/"
    When I click on the link why d3d
    Then  I should see "about-us" in the current url
