package co.com.retochoucair.tasks;

import co.com.retochoucair.models.PersonalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static co.com.retochoucair.userinterfaces.Step2Page.*;

public class Form2Address implements Task {
    private PersonalData personalData;

    public Form2Address(PersonalData personalData) {
        this.personalData = personalData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(personalData.getCity()).into(INPUTCITY),
                Enter.theValue(personalData.getZip()).into(INPUTZIP),
                Click.on(COUNTRY),
                Enter.theValue(personalData.getCountry()).into(SELECTCOUNTRY),
                Click.on(BTNNEXTFORM2)
        );

    }
    public static Form2Address fill(PersonalData personalData){
        return Tasks.instrumented(Form2Address.class,personalData);
    }
}
