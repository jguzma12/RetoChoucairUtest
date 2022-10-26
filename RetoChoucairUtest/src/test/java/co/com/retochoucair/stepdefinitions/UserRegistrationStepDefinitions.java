package co.com.retochoucair.stepdefinitions;

import co.com.retochoucair.models.PersonalData;
import co.com.retochoucair.questions.TextConfirmation;
import co.com.retochoucair.tasks.StartToRegister;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class UserRegistrationStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Actor");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }

    @Given("the user wants to register on Utest")
    public void theUserWantsToRegisterOnUtest() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));

    }

    @When("^the user start to complete the differents forms to register$")
    public void theUserStartToCompleteTheDifferentsFormsToRegister(List<PersonalData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(StartToRegister.with(data.get(0)));
    }


    @Then("the user should see the text (.*)$")
    public void theUserShouldSeeTheText(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextConfirmation.with(), Matchers.is(message)));
    }



}
