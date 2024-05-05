package CUCUMBER_SETUP;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
@CucumberOptions(
        features = "src/main/resources/featurebdd/employee.feature",
        glue = "ORANGEHRM_TESTCASES",
        tags = "@SmokeTest",
        plugin = {"pretty", "html:target/info-reports.html"}
)
public class info extends AbstractTestNGCucumberTests{
}
