package Steps;


import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

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
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() throws Throwable {
        base.Driver.findElement(By.name("Login")).submit();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        Assert.assertEquals("It's not displayed", base.Driver.findElement(By.id("Initial")).isDisplayed(), true);
    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        //Create an ArrayList
        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        for (User user : users) {
            base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
            base.Driver.findElement(By.name("Password")).sendKeys(user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String passWord) throws Throwable {
        System.out.println("The Username is" + userName);
        System.out.println("The Password is" + passWord);
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
