Feature: Login Caseleri

  @Tolunay
  Scenario: Login with Invalid Email
    Given Go to the Site
    When Reach the login page
    When Fill the related email fields with "tolunayaktas"
    Then check "There was a problem" the warning message

  @Aktas
  Scenario: Login Successfully
    Given Go to the Site
    When Reach the login page
    When Fill the related email fields with "tolunayaktas@gmail.com"
    When Fill the related password fields with "Ta850450"
    Then Check if you're logged in without any error
