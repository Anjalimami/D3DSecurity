Feature: GetQuote

  Background:
    Given I go to Url "https://www.d3dsecurity.co.uk"
    When I click on products on the menu button
#    Then I should see "Get a free Quote " on the left side of home page
@a1
  Scenario:Get a free Quote with Valid Data.
    When I enter below details:
      | First Name | Last Name | Email Address      | Phone Number |
      | Anjali     | Sethi     | Anjali@hotmail.com | 078900       |
    When I entered first name "Anjali"
    And I entered last name "Sethi"
    And  I entered email as "Anjali@hotmail.com "
    And I entered phone number as "078900"
    And I should enter Subject as "Quote for Security Alarm System"
    And I should enter message as "Give me a Quote"
    And I click on the check box I am not a Robert
    And I click on submit button
    Then I should see error message

#  Scenario Outline:Get a free Quote with Valid Data.
#    Then  I should enter First name as "<First_Name>"
#    And I should enter last name as "<Last_name>"
#    And I should enter Email as "<Email_address>"
#    And I should enter Phonenumber "<phonenumber>"
#    And I should enter Subject "<Subject>"
#    And I should enter message as "<message>"
#
#    Examples:
#      | First_Name | Last_name | Email_address      | phonenumber | Subject                         | message         |
#      | Anjali     | Sethi     | Anjali@hotmail.com | 078900      | Quote for Security Alarm System | Give me a Quote |
#      | Raji       | Sethi     | Raji@hotmail.com   | 076900      | Quote for Security Alarm System | Give me a Quote |
#      | Bunu       | S         | Bunu@gmail.com     | 5678        | Quote for Security Alarm System | Give me a Quote |
#
#
#  Scenario Outline:Get a free Quote with Invalid Data.
#    When I enter below details:
#      | First Name | Last Name | Email Address | Phone Number |
#      | Anjali     | Sethi     | #@hotmail.com | 078900       |
#
#    And I should enter Subject "<Subject>".
#    And I should enter message as "<message>".
#    Then I should see error messase as "<Error Message>"
#
#
#    Examples:
#      | Subject                         | message                         | Error Message                                                              |
#      | Quote for Security Alarm System | Give me a Quote                 | Validation errors occurred. Please confirm the fields and submit it again. |
#      | Quote for Security Alarm System | Give me a Quote                 | Validation errors occurred. Please confirm the fields and submit it again. |
#      | Quote for Security Alarm System | Give me a Quote                 | Validation errors occurred. Please confirm the fields and submit it again. |
#      | Quote for Security Alarm System | Quote for Security Alarm System | Validation errors occurred. Please confirm the fields and submit it again. |
#
