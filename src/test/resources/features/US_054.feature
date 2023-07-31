Feature: Password Change Feature

  @
  Scenario: TC_001 Changing password from Parent Panel
    Given I am on the Parent Panel
    When I click on the Profile Image
    And I click on the Change Password button
    Then I should be on the relevant page to change the password

    When I enter a new password "Abc123!"
    And I click on the Save button
    Then The new password should be at least 6 characters long
    And The new password should contain at least one uppercase letter and one special character
    And I should receive a success message stating that the password has been changed successfully

    When I enter a new password "invalidpassword"
    And I click on the Save button
    Then I should receive an error message indicating that the password is invalid
