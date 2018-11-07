# new feature
# Tags: optional
@smoke
Feature: Login Mokapos
    
Scenario: Login Mobile Apps Mokapos
    Given user open mokapos apps
    When user try to login
    Then user should see home activity mobile apps mokapos