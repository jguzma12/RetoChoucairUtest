package co.com.retochoucair.tasks;

import co.com.retochoucair.models.PersonalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterfaces.MainPage.BTN_JOINTODAY;
import static co.com.retochoucair.userinterfaces.MainPage.TXT_CONFIRM;

public class StartToRegister implements Task {
    private PersonalData personalData;

    public StartToRegister(PersonalData personalData) {
        this.personalData = personalData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_JOINTODAY),
                Form1Personal.with(personalData),
                Form2Address.fill(personalData),
                Form3TellUs.fill(personalData),
                Form4LastStep.fill(personalData)
        );


    }

    public static StartToRegister with(PersonalData personalData) {
        return Tasks.instrumented(StartToRegister.class, personalData);
    }
}
