Feature: LoginFeature

  @XSBX-270 @smokeTest
  Scenario: Log in
    Given The user login to the application
    When the credentials are entered
    Then the homepage is viewed

