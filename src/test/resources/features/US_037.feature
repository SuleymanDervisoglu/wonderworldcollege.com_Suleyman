Feature: Online Permission Records

  @
  Scenario: TC_001 Create a new leave request
    * I am logged in as a teacher
    * I navigate to the Human Resource menu
    * I click on the Apply Leave on menu
    * I add a new Apply Leave with click on button
    * I fill in the following details: Apply Date, Available Leave , Leave From Date, Leave to Date and Reason
    * I click the Save button
    * A new leave request should be created
    * Close the browser


 @
  Scenario: TC_002 Delete the Newly created leave request
   * I am logged in as a teacher
   * I navigate to the Human Resource menu
   * I click on the Apply Leave on menu
   * I delete the newly created leave request
   * I confirm the delete
   * Close the browser

