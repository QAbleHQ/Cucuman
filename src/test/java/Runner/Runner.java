package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/web/Features/SuperAdmin/AddNewClient.feature",
        glue = {"io.unity.framework.init","web.Steps"},
        publish = true
)

public class Runner {



}
