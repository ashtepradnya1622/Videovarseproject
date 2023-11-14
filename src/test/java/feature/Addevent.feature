Feature: Add event
  @Test6
  Scenario: Add Event
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    Then user selects the category
    Then user click on Add event button
    Then user clicks on upload thumbnail and upload the file
    Then user clicks on event title  and enter the event title "Worldtenisone"
    Then user clicks on event Orgnizer and enter the event orgnizer name "Pradnya"
    Then user clicks on dropdown option
    Then User selects the Event Start Date 20
    And User selects the Event End Date 30
   And User clicks the Create button

  Scenario: Edit Event
    Given User navigated to Event Page
    When User scrolls down and clicks on sport "Cricket"
    And User clicks on the three dots under Actions column
    And User clicks on Edit Event button
    And Edit Event creation form displays
    Then Verify the Edit Event text on the form
    And User edits the Event Title "Cricket World Cup-5"
    And User edits the description "Pataskar"
    And User edits the name of the Organizer "Prajakta"
    And User clicks on the Save button


