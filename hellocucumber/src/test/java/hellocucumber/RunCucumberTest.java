package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonFormat.Features;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/features/address.feature")
public class RunCucumberTest {
}
