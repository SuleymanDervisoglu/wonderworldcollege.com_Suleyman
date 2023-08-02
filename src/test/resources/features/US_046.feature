Feature: View Student Profile

  @
  Scenario: TC_001 Accessing "My Profile" in the Student Panel
    Given I log in as an student
    When I access My Profile in the Student Panel
    Then I should be able to view the Student's name
    And I should be able to view the Admission No
    And I should be able to view the Class
    And I should be able to view the Section
    And I should be able to view the Gender
    * Close the browser

  @
  Scenario: TC_002 Viewing Profile Section
    * I log in as an student
    When I access My Profile in the Student Panel
    Then I should be able to view the Profile segment
    And I should be able to view information under profile segment
    * Close the browser

  @
  Scenario: TC_003 Viewing Exam Section
    * I log in as an student
    When I access My Profile in the Student Panel
    Then I should be able to see the fields under Exam Section
    * Close the browser

  @
  Scenario: TC_004 Viewing Documents Section
    * I log in as an student
    When I access My Profile in the Student Panel
    Then I should be able to see the fields under Documents Section
    * Close the browser


  @
  Scenario: TC_005 Viewing Fees Section
    * I log in as an student
    When I access My Profile in the Student Panel
    Then I should be able to see the fields under Fees Section
    * Close the browser
