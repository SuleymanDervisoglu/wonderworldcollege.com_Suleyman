Feature: Password Change Feature

  @
  Scenario: TC_001 Changing password from Parent Panel with success
    * I log in as a Parent
    * I click on the Profile Image
    * I click on the Change Password button
    * I should be on the relevant page to change the password
    * I enter a new password "Abc123!"
    * I click on the Save button
     # The new password should be at least 6 characters long
     # The new password should contain at least one uppercase letter and one special character
    * I should receive a success message stating that the password has been changed successfully
    * Close the browser


  @
  Scenario: TC_002 Changing password from Parent Panel without success

    * I log in as a Parent
    * I click on the Profile Image
    * I click on the Change Password button
    * I should be on the relevant page to change the password
    * I enter a new invalidpassword "dervis"
    * I click on the Save button
     # The new password should be at least 6 characters long
     # The new password should contain at least one uppercase letter and one special character
    * I should receive an error message indicating that the password is invalid
    * Close the browser
