package co.com.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step1Page {
    public static final Target INPUTFIRSTNAME = Target.the("Input for first name")
            .located(By.id("firstName"));

    public static final Target INPUTLASTNAME = Target.the("Input for Last name")
            .located(By.id("lastName"));

    public static final Target INPUTEMAIL = Target.the("Input for email")
            .located(By.id("email"));

    public static final Target SELECTMONTH = Target.the("select the month of birth")
            .located(By.id("birthMonth"));

    public static final Target SELECTDAY = Target.the("select the day of birth")
            .located(By.id("birthDay"));

    public static final Target SELECTYEAR = Target.the("select the year of birth")
            .located(By.id("birthYear"));

    public static final Target BTNNEXTFORM = Target.the("Button for next form ")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
