package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//the path of the feature file.
		features = "/Users/himanshu.dubey/eclipse-workspace/FreeCRMBDDFramework/src/main/java/features/deals.feature"
		//the path of the step definition files.
		,glue= {"stepDefinition"}
		,monochrome = true,
				dryRun=false,
				strict = true
		,format= {"pretty", "html:test-output"}
		)




public class TestRunner {

}
