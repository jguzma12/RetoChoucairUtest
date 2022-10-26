package co.com.retochoucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TextConfirmation implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall("message");
    }

    public static TextConfirmation with() {
        return new TextConfirmation();
    }
}
