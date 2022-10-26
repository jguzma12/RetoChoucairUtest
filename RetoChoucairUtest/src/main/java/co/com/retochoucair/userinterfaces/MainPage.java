package co.com.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target BTN_JOINTODAY = Target.the("Button join today")
            .located(By.xpath("//*[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target TXT_CONFIRM = Target.the("Text confirm")
            .located(By.cssSelector("div.image-box-header > h1"));
}
