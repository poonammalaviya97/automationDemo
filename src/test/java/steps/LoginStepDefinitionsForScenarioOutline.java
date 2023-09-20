package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginStepDefinitionsForScenarioOutline {
    private WebDriver driver;

    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws Throwable {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("^User navigate to Login Page$")
    public void userNavigateToLoginPage() throws Throwable {
        System.out.println("userNavigateToLoginPage");
    }

    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String username, String password) throws Throwable {
        System.out.println("Username is: " + username + " password is: " + password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void messageDisplayedLoginSuccessfully() throws Throwable{
        System.out.println("Successfully Logged In");
        Thread.sleep(20000);
        driver.close();
    }
}
