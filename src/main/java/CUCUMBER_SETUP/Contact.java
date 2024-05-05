package CUCUMBER_SETUP;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
@CucumberOptions(
        features = "src/main/resources/featurebdd/User_Details.feature",
        glue = "ORANGEHRM_TESTCASES",
        tags = "@SmokeTest",
        plugin = {"pretty", "html:target/contact-reports.html"}
)
public class Contact extends AbstractTestNGCucumberTests {
}
