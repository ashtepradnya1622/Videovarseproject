Feature: Stream
  @Test10
  Scenario: Add Stream
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    When User clicks on sportcategory"Tennis"
    Then user clicks on serach box and enter the event name"Saniatenis"
    Then user clicks on event name"Saniatenis"
    Then user clicks on add stream button
    Then user clicks on Streamtitle and enter the stream name "Stream2"
    Then user clicks on streamtype dropdown option "Archievd"
    Then user clicks on stream link type option "Others"
    Then user clicks on Downlodable link
    Then user clicks on create button
  @Test11
  Scenario: Edit Stream
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    When User clicks on sportcategory"Tennis"
    Then user clicks on serach box and enter the event name"Saniatenis"
    Then user clicks on event name"Saniatenis"
    Then user clicks on stream name"streamfour"
    Then user clicks on three dots
    Then user clicks on editstreambutton
    Then user clicks on stream title and enter the stream name "Streamupdated"
    Then user clicks on create button









