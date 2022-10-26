package co.com.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step4Page {
    public static final Target INPUTPASSWORD = Target.the("Input for password")
            .located(By.id("password"));

    public static final Target INPUTCONFIRMPASSWORD = Target.the("Input for confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_02 = Target.the("where we confirm checkbox 2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECKBOX_03 = Target.the("where we confirm checkbox 3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTONEND = Target.the("where we confirm register")
            .located(By.id("laddaBtn"));
}
