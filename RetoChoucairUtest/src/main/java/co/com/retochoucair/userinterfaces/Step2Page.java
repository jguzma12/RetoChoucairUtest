package co.com.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step2Page {
    public static final Target INPUTCITY = Target.the("Input for city")
            .located(By.id("city"));

    public static final Target INPUTZIP = Target.the("Input for zip")
            .located(By.id("zip"));

    public static final Target COUNTRY = Target.the("where we find the country")
            .located(By.cssSelector("div[name='countryId']"));

    public static final Target SELECTCOUNTRY = Target.the("Input for country")
            .located(By.cssSelector("input[placeholder='Select a country']"));

    public static final Target BTNNEXTFORM2 = Target.the("Button form next form devices ")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
