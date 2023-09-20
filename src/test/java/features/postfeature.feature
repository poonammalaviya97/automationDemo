
Feature:Post feature to facebook
        This will test the post functionality at the user wall

  Scenario:Post the message on user wall
Given User should be logged in and should be present at its own wall
When I type the message in the text box
And Click on Post button
Then the message should get posted