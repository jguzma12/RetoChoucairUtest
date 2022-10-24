package co.com.retochoucair.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\userRegistration.feature",
glue = "co.com.retochoucair.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE)


public class UserRegistrationRunners {
}
