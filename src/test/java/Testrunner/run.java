package Testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		features=".//Feature//Login.feature.feature",
		glue="StepDefination",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty"}
		)

public class run {

}
