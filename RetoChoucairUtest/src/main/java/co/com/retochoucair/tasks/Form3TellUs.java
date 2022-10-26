package co.com.retochoucair.tasks;

import co.com.retochoucair.models.PersonalData;
import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.retochoucair.userinterfaces.Step3Page.*;

public class Form3TellUs implements Task {
    private PersonalData personalData;

    public Form3TellUs(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER),
                Enter.theValue(personalData.getComputer()).into(SELECTCOMPUTER).thenHit(Keys.ENTER),
                Click.on(VERSION),
                Enter.theValue(personalData.getVersion()).into(SELECTVERSION).thenHit(Keys.ENTER),
                Click.on(LANGUAGE),
                Enter.theValue(personalData.getLanguage()).into(SELECTLANGUAGE).thenHit(Keys.ENTER),
                Click.on(BTNLASTSTEP)
        );
    }

    public static Form3TellUs fill(PersonalData personalData) {
        return Tasks.instrumented(Form3TellUs.class, personalData);
    }
}
