package co.com.retochoucair.stepdefinitions;

import co.com.retochoucair.models.PersonalData;
import co.com.retochoucair.tasks.Form1Personal;
import co.com.retochoucair.tasks.StartToRegister;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class UserRegistrationStepDefinitions {
    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Actor");
    }

    @Given("the user wants to register on Utest")
    public void theUserWantsToRegisterOnUtest() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));

    }

    @When("the user go to Join Today")
    public void theUserGoToJoinToday() {
        OnStage.theActorInTheSpotlight().attemptsTo(StartToRegister.startToRegister());

    }

    @When("the user completes the firts form with the following data$")
    public void theUserCompletesTheFirtsFormWithTheFollowingData(List<PersonalData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Form1Personal.form1Personal(data.get(0)));

    }

    @When("the user completes form second with the following data")
    public void theUserCompletesFormSecondWithTheFollowingData() {
    }

    @When("the user completes form third with the following data")
    public void theUserCompletesFormThirdWithTheFollowingData() {
    }

    @When("the user completes form final with the following data")
    public void theUserCompletesFormFinalWithTheFollowingData() {
    }

    @Then("the user should see the text (.*)$")
    public void theUserShouldSeeTheText(String message) {
    }
}
