@regression @ui @RTB-1 @api
Feature:  Validating Etsy application search and filter functionalities

  #Before
  Background: Repeated first steps in each scenario
    Given user navigates to "Etsy" application


  @RTB-1
  Scenario: Validating search results
    When user searches for "sofa"
    Then user validates search result items name contains keyword "sofa"
   #After
  @RTB-2
  Scenario Outline: Validating price range filter functionality for searched item
    When user searches for "<item>"
    And user applies price filter "<price>" dollars
    Then user validates that item prices are over "<price>" dollars
    And user validates search result items name contains keyword "<item>"
    #After
    #
    #
    # |sofa|chair|carpet|table|
    # |over 1500|under 250|250 to 750|750 to 1500|

    Examples:
      | item       | price      |
      | sofa       | over 1500  |
      | couch      | under 250  |
      | side table | 250 to 750 |
      | chair      | 500 to 1000 |

