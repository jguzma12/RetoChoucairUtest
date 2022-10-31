package co.com.retochoucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.retochoucair.userinterfaces.MainPage.TXT_CONFIRM;

public class TextConfirmation implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TXT_CONFIRM.resolveFor(actor).getText();
    }

    public static TextConfirmation with() {
        return new TextConfirmation();
    }
}
