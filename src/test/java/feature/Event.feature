Feature: Event
  @Test6
  Scenario: Categories
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    When User clicks on sport
  @Test7
  Scenario: Add Event
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    Then user selects the category
    Then user click on Add event button
    Then user clicks on upload thumbnail and upload the file
    Then user clicks on event title  and enter the event title "Worldtenisone"
    Then user clicks on event Orgnizer and enter the event orgnizer name "Pradnya"
    Then user clicks on dropdown option "National"
    Then User selects the Event Start Date 20
    And User selects the Event End Date 30
    And User clicks the Create button
  @Test8
  Scenario: Edit Event
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    When user selects the category
    Then user clicks on serach box and enter the event name"Saniatenis"
    And User clicks on the three dots under Actions column
    And User clicks on Edit Event button
    And user edits the event title"Tenisone"
    And User edits the name of the Organizer "Priya"
    Then user clicks on save button
  @Test9
  Scenario: Delete Event
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    When user selects the category
    Then user clicks on serach box and enter the event name"Deleteevent"
    And User clicks on the three dots under Actions column
    And user clicks on Delete event button
    Then user clicks on Cancel button








