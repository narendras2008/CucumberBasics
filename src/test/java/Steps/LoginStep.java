package Steps;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

/**
 * Created by Shaju on 07/04/2017.
 */
public class LoginStep {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

        System.out.println("Navigate Login Page");
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() throws Throwable {

        System.out.println("Click login button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {

        System.out.println("I should see the userform page");
    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {

        List<List<String>> data = table.raw();

        System.out.println("The Value is : " + data.get(0).get(0).toString());
        System.out.println("The Value is : " + data.get(0).get(1).toString());
    }
}
