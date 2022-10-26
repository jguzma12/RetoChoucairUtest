package co.com.retochoucair.tasks;

import co.com.retochoucair.models.PersonalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucair.userinterfaces.Step4Page.*;

public class Form4LastStep implements Task {
    private PersonalData personalData;

    public Form4LastStep(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(personalData.getPassword()).into(INPUTPASSWORD),
                Enter.theValue(personalData.getConfirmPassword()).into(INPUTCONFIRMPASSWORD),
                Click.on(CHECKBOX2),
                Click.on(CHECKBOX3),
                Click.on(BUTTONEND)
        );
    }

    public static Form4LastStep fill(PersonalData data){
        return Tasks.instrumented(Form4LastStep.class, data);
    }
}
