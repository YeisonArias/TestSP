package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.BeforeSuite;
import utils.DataToFeature;

import java.io.IOException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/metis.feature"},
        tags = "",
        glue = "",
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},
        snippets= CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags
{
    private RunnerTags() {}
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException
    {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/metis.feature");
    }
}
