package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class LoginSteps {
    @Given("^User is at the login page of the application$")
    public void userIsAtTheLoginPageOfTheApplication() throws Throwable {
        System.out.println("userIsAtTheLoginPageOfTheApplication");
    }

    @When("^User logs in with following username and password$")
    public void userLogsInWithFollowingUsernameAndPassword(DataTable dataTable) throws Throwable {
        List<List<String>> list_of_rows = dataTable.raw();
        for (List<String> row:list_of_rows){
            for (String str:row){
                System.out.println("Data : " + str);
            }
        }
    }

    @Then("^user should be able to login with correct username and password$")
    public void userShouldBeAbleToLoginWithCorrectUsernameAndPassword() throws Throwable {
        System.out.println("userShouldBeAbleToLoginWithCorrectUsernameAndPassword");
    }

}
