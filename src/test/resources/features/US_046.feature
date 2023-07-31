Feature: View Student Profile

  @
  Scenario: TC_001 Accessing "My Profile" in the Student Panel
    Given I am a user
    When I access "My Profile" in the Student Panel
    Then I should be able to view the Student's name
    And I should be able to view the Admission No
    And I should be able to view the Class
    And I should be able to view the Section
    And I should be able to view the Gender

  @
  Scenario: TC_002 Viewing Profile, Fees, Exam, and Documents segments
    Given I am a user
    When I access the Student Panel
    Then I should be able to view the Profile segment
    And I should be able to view the Fees segment
    And I should be able to view the Exam segment
    And I should be able to view the Documents segment

  @
  Scenario: TC_003 Viewing fields under the Profile section
    Given I am a user
    When I access the Profile segment in the Student Panel
    Then I should be able to see the fields under the Profile section

  @
  Scenario: TC_004 Viewing fields under the Fees section
    Given I am a user
    When I access the Fees segment in the Student Panel
    Then I should be able to see the fields under the Fees section

  @
  Scenario: TC_005 Viewing fields under the Exam section
    Given I am a user
    When I access the Exam segment in the Student Panel
    Then I should be able to see the fields under the Exam section

  @
  Scenario: TC_006 Viewing fields under the Documents section
    Given I am a user
    When I access the Documents segment in the Student Panel
    Then I should be able to see the fields under the Documents section
