# new feature
# Tags: optional
@smoke
Feature: Foot to Meter
    
Scenario: Convert Foot to Meter
    Given Open "length" converter from side menu
    When I choose "foot" to "meter"
    And I input "7" to convert
    Then the result should be "2.1336"