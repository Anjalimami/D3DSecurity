@register
Feature:Resister a new User.

  Background:
    Given I go to Url "https://www.d3dsecurity.co.uk"
    When I click on Register button

  @RegisterValidData
  Scenario: Register as a New User with Valid Data
    And I enter a valid email address as "Testing123@hotmail.com"
    And I enter valid  new password as "PassWord1"
    And I enter valid  confirm password as "PassWord1"
    When I click on Resister button on register page
    And I should see My Account button
    And I should see Log Out button


   @Valid_data
   Scenario Outline:
   And I enter a invalid email address as "<Email>"
    And I enter   invalid  new password as "<New_password>"
    And I enter invalid  confirm password as "<Confirm_password>"
    Then I click on Resister button on register page
     And I should see My Account button
     And I should see Log Out button

     Examples:
      | Email                  | New_password | Confirm_password |
      | Testing123@hotmail.com | PassWord1    | PassWord1        |
      | raji@yahoo.com         | 12345        | 12345            |

  @RegisterInvalidData
   Scenario:  Register as a New User with Invalid Data
   And I enter a valid email address as "Testing.com"
    And I enter valid  new password as "12345"
    And I enter valid  confirm password as "12345"
    Then I click on Resister button on register page
  #  And I should see Error message

  @invalid
  Scenario Outline:
   And I enter a invalid email address as "<Email>"
    And I enter   invalid  new password as "<New_password>"
    And I enter invalid  confirm password as "<Confirm_password>"
    Then I click on Resister button on register page
 #  And I should see error messase   "<Error_message>"

    Examples:
      | Email          | New_password | Confirm_password | Error_message                              |
#    | raji@yahoo.com | pw3          | pwd              | Error_message                              |
#      | mama@gmail.com | 123abc       | 123abcd          | Error_message                              |
#      | hello123.com   | creat        | creat1           | Please include an '@' in the email address |
#      | Blank          | 123456       | 123456           | Username is not valid                      |