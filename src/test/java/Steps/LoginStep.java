package Steps;


import Base.BaseUtil;
import Transformation.EmailTransform;
import Transformation.SalaryCountTransformer;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaju on 07/04/2017.
 */
public class LoginStep extends BaseUtil {

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    private BaseUtil base;

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

        System.out.println("The driver is: " + base.StepInfo);

        System.out.println("I should see the userform page");
    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {

        /*List<List<String>> data = table.raw();*/

        /* System.out.println("The Value is : " + data.get(0).get(0).toString());
        System.out.println("The Value is : " + data.get(0).get(1).toString());*/

        //Create an ArrayList
        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        for (User user : users) {
            System.out.println("The Username is" + user.username);
            System.out.println("The Password is" + user.password);
        }

    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String passWord) throws Throwable {
        System.out.println("The Username is" + userName);
        System.out.println("The Password is" + passWord);
    }

    @And("^I enter the users email address as Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {

        System.out.println("The Email Address is " + email);
    }

    @And("^I verify the count of my salary digits for Ps (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsForPs(@Transform(SalaryCountTransformer.class) int salary) throws Throwable {

        System.out.println("My salary digits is :" + salary);
    }


    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
