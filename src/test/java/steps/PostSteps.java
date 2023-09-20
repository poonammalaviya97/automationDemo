package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostSteps {
    @Given("^User should be logged in and should be present at its own wall$")
    public void userShouldBeLoggedInAndShouldBePresentAtItsOwnWall(){
        System.out.println("userShouldBeLoggedInAndShouldBePresentAtItsOwnWall");
    }

    @When("^I type the message in the text box$")
    public void iTypeTheMessageInTheTextBox(){
        System.out.println("iTypeTheMessageInTheTextBox");
    }

    @And("^Click on Post button$")
    public void clickOnPostButton(){
        System.out.println("clickOnPostButton");
    }

    @When("^I type the message as \"([^\"]*)\" in the text box$")
    public void iTypeTheMessageAsInTheTextBox(String arg0) throws Throwable {
        System.out.println(arg0);
    }

    @Then("^the message should get posted$")
    public void theMessageShouldGetPosted() {
        System.out.println("theMessageShouldGetPosted");
    }

    @When("^User supply the youtube link as \"([^\"]*)\" in the text box$")
    public void userSupplyTheYoutubeLinkAsInTheTextBox(String arg0) throws Throwable {
        System.out.println(arg0);
    }

    @Then("^The video should get posted on user wall$")
    public void theVideoShouldGetPostedOnUserWall() {
    }

    @And("^the video should have proper thumbnail\\.$")
    public void theVideoShouldHaveProperThumbnail() {
    }
}
