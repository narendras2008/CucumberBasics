package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Shaju on 07/04/2017.
 */
public class Hook extends BaseUtil {

    public Hook(BaseUtil base) {
        this.base = base;
    }

    private BaseUtil base;


    @Before
    public void Initializetest() {

        System.out.println("Opening the browser: Firefox");

        System.setProperty("webdriver.firefox.marionette", "D:\\libs\\geckodriver.exe");
        base.Driver = new FirefoxDriver();

    }

    @After
    public void TearDownTest(Scenario scenario) {

        if (scenario.isFailed()) {

            //Take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser: MOCK");
    }
}
