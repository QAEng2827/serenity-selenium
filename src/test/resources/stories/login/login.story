Login

Meta:
@tag login

Narrative:
  In order to use app functionality
  As a user
  I want to be able to login

Scenario : Successful user login
Meta:
@tag login01
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as '<email>' , '<password>'
Then I should be on Home page
Examples:
|email                              |password|
|linkedin.tst.yanina@gmail.com      |Test123!|
|linkedin.TST.yanina@gmail.com      |Test123!|

Scenario: Negativ test login
Meta:
@tag login02
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as '<email>' , '<password>'
Then I should be on Checkpoint page
Examples:
|email                              |password|
|linkedin.tst.yanina@gmail.com      |123!|
