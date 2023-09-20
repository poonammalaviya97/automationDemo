package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/postfeature.feature"}, glue = {"steps", "hooks"}, dryRun = false,
         plugin = {"pretty", "html:target/HtmlReports"})
       //   plugin = {"pretty","json:target/report.json"})
        //  plugin = {"pretty","junit:target/report.xml"})

public class PostRunner {
}
