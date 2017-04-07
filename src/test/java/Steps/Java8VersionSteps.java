package Steps;

import cucumber.api.java8.En;

/**
 * Created by Shaju on 07/04/2017.
 */
public class Java8VersionSteps implements En {
    public Java8VersionSteps() {
        And("^I just need to see how step looks fot Cucumber-Java(\\d+)$", (Integer arg0) -> {
            System.out.println("The value from new Step class is: " + arg0);
        });
    }
}
