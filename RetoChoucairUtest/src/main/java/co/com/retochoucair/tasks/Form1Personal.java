package co.com.retochoucair.tasks;

import co.com.retochoucair.models.PersonalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.retochoucair.userinterfaces.Step1Page.*;

public class Form1Personal implements Task {

private PersonalData personalData;

    public Form1Personal(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUTFIRSTNAME, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(personalData.getFirstName()).into(INPUTFIRSTNAME),
                Enter.theValue(personalData.getLastName()).into(INPUTLASTNAME),
                Enter.theValue(personalData.getEmail()).into(INPUTEMAIL),
                SelectFromOptions.byVisibleText(personalData.getMonth()).from(SELECTMONTH),
                SelectFromOptions.byVisibleText(personalData.getDay()).from(SELECTDAY),
                SelectFromOptions.byVisibleText(personalData.getYear()).from(SELECTYEAR),
                Click.on(BTNNEXTFORM)
        );

    }

    public static Form1Personal form1Personal(PersonalData personalData) {
        return Tasks.instrumented(Form1Personal.class, personalData);
    }
}
