# new feature
# Tags: optional
@smoke
Feature: Search to convert

Scenario: Using search to convert
  Given Open "area" converter from search by keyword
  When I choose "square meter" to "Hectare"
  And I input "125" to convert
  Then the result should be "0.0125"