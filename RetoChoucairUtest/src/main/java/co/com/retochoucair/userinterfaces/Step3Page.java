package co.com.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step3Page {
    public static final Target COMPUTER = Target.the("Computer").located(By.cssSelector("div[name='osId'] " +
            "> div[placeholder='Select OS'] > span.btn-default"));

    public static final Target SELECTCOMPUTER = Target.the("Select your computer").located(By.cssSelector("div[name='osId'] > inp" +
            "ut[placeholder='Select OS']"));

    public static final Target VERSION = Target.the("Version").located(By.xpath("//span[@" +
            "class='btn btn-default form-control ui-select-toggle']// span[.='Select a Version']"));

    public static final Target SELECTVERSION = Target.the("Select version").located(By.cssSelector("in" +
            "put[placeholder='Select a Version']"));

    public static final Target LANGUAGE = Target.the("Language").located(By.xpath("//sp" +
            "an[@class='btn btn-default form-control ui-select-toggle'] // span[.='Select OS language']"));

    public static final Target SELECTLANGUAGE = Target.the("Select language").located(By.cssSelector("inp" +
            "ut[placeholder='Select OS language']"));

    public static final Target BTNLASTSTEP = Target.the("Button last step").
            located(By.xpath("//a[@class='btn btn-blue pull-right']// span[.='Next: Last Step']"));

}
