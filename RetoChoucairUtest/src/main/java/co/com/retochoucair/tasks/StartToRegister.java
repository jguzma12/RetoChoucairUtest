package co.com.retochoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retochoucair.userinterfaces.MainPage.BTN_JOINTODAY;

public class StartToRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_JOINTODAY)
        );
    }

    public static StartToRegister startToRegister() {
        return Tasks.instrumented(StartToRegister.class);
    }
}
