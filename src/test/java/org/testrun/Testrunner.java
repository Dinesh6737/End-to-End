package org.testrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.step",dryRun=false,monochrome=true,plugin= {"pretty","html:target/html-report/Cu.pom"})
public class Testrunner {

}
