import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"},
        //glue = {"steps"}
        plugin = {"pretty","html:target/report.html"},
        tags = "@sanity",
       // tags = "@ui or @sanity or @regression"
       //tags = "@regression and @ui"
       // dryRun = true,
        monochrome = true


)


public class TestRunner
{

}
