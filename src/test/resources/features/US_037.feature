Feature: Online Permission Records

  @
  Scenario: TC_001 Create a new leave request
    Given I am logged in as an administrator (teacher)
    When I navigate to the "Human Resource" menu
    And I click on the "Apply Leave" link
    Then I should be redirected to the "leaverequest#addleave" page
    And I click on the "Apply Leave" button
    And I fill in the following details:
      | Apply Date     | Available Leave | Leave From Date | Leave To Date | Reason      |
      | 2023-07-30     | 20              | 2023-08-01      | 2023-08-05    | Vacation    |
    And I click the "Save" button
    Then a new leave request should be created


 @
  Scenario: TC_002 Check all permissions used
    Given I am logged in as an administrator (teacher)
    When I navigate to the "Leaves" page
    Then I should see a list of all leave requests
    And each leave request should have the following columns:
      | Staff   | Leave Type | Leave Date  | Days | Apply Date  | Status   |
    And I should be able to check the status of each leave request
    And for leave requests with a status of "Pending"
    And I should see a delete icon under the "Action" column
    And I can click the delete icon to remove the corresponding leave request
    And by clicking the view icon under the "Action" column
    And I should be able to access the details window for the selected leave request
