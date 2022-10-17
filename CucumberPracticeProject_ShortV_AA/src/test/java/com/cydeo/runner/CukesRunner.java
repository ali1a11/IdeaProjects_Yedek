package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "html:target/cucumber_reports.html"
        },
    features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@ScenarioOutline" //@MoviesSearchMap, @MoviesSearch, @MoviesSearchTable, @eating2,
)
public class CukesRunner {
}
// plugin --> reports under target directory
// features --> / features directory / copy path reference / Path From Content Root
// glue -->     / step_definitions directory/ copy path reference / Path From Source Root
// tags --> for running specific scenarios

//Hooks class in step_definitions directory

