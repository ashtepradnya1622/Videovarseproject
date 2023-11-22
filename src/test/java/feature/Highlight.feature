Feature: Highlight
  @Test12
  Scenario: Adding Clips in highlight
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    When User clicks on sportcategory"Tennis"
    Then user clicks on serach box and enter the event name"Saniatenis"
    Then user clicks on event name"Saniatenis"
    Then user clicks on stream name"streamfour"
    Then user clicks on stream Name
    Then user selects the clips
    Then user clicks on uparrow
    Then user clicks on highlight button
    Then user clicks on highlighttitle and enter the value"Highlight1"
    Then user clicks on description and enter the description details "Highlight one is important"
    Then user clicks on save as draft button
  @Test13
  Scenario:Dragdropclips
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    When User clicks on sportcategory"Tennis"
    Then user clicks on serach box and enter the event name"Saniatenis"
    Then user clicks on event name"Saniatenis"
    Then user clicks on stream name"streamfour"
    Then user clicks on stream Name
    Then user selects the clips
    Then user clicks on uparrow
    Then user clicks on highlight button
    Then user clicks on clips and perform drag drop

@Test14
Scenario:preview button
    Given User opens the url enter the valid details & click on login button
    Then user clicks on event
    When User clicks on sportcategory"Tennis"
    Then user clicks on serach box and enter the event name"Saniatenis"
    Then user clicks on event name"Saniatenis"
    Then user clicks on stream name"streamfour"
    Then user clicks on stream Name
    Then user selects the clips
    Then user clicks on uparrow
    Then user clicks on highlight button
    Then user clicks on highlighttitle and enter the value"Highlight1"
    Then user clicks on description and enter the description details "Highlight one is important"
    Then user clicks on preview button
   Then user clicks on frame








