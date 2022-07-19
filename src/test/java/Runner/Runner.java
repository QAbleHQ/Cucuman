package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/SuperAdmin/AddNewClient.feature",
        glue = "object_repository",
        publish = true
)

public class Runner {


    public static void main(String[] args) {

    }

}
