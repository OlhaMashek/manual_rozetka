package rozetka;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.apache.log4j.Logger;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/manual/tests"},
        plugin = {"pretty"}, glue = {"rozetka"})
public class RunCucumberTest {

}


