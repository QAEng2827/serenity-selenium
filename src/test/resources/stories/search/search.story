Search

Meta:
@search

Narrative:
  In oreder to use search functionality
  As a user
  I want to be able to search for keyword

Scenario: Search for keyword
Meta:
@search01
@smoke
Given I open Landing page
When I click on 'Sign in' button
Then I should be on Login page
When I sign In as 'linkedin.tst.yanina@gmail.com' , 'Test123!'
Then I should be on Home page
When I search for 'HR' keyword
Then I should see more than 1 result
And each result contains 'HR' keyword
