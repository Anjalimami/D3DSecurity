package d3dCom;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty"},features="src/test/resources/", tags={"@a1"})


public class RunCukesTest {



}
