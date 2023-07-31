Feature: Record attendance for students

  @
  Scenario: TC_001 Mark attendance for students
    Given I am logged in as an administrator
    And I am on the Attendance page
    When I select the Class
    And I select the Section
    And I enter the Date
    And I select the Subject
    And I click the Search button
    Then the Student List is displayed
    And I mark the attendance status for each student:First,Second,Third
    And I click the Save Attendance button
    And Close the browser

  @
  Scenario: TC_002 Mark the entire day as "Holiday" and put some note for students box
    * I am logged in as an administrator
    * I am on the Attendance page
    * I select the Class
    * I select the Section
    * I enter the Date
    * I select the Subject
    * I click the Search button
    * the Student List is displayed
    * I write notes for three different students
    * I click the Mark As Holiday button
    * the entire day is marked as Holiday
    * I click the Save Attendance button
    * Close the browser
