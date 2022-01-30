package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserYourAddres {

    public static final Target INPUT_CITY = Target.the("write city location")
            .located(By.id("city"));
  public static final Target INPUT_CODE  = Target.the("write postal code location")
          .located(By.id("zip"));
 public static final Target INPUT_COUTRY = Target.the("select country location")
     .located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
  public static final Target INPUT_COUTRYS = Target.the("write country location")
          .located(By.xpath("//input[@placeholder='Select a country']"));
   public static final Target NEXT_DEVICES = Target.the("next step devices")
        .located(By.xpath("//a[@aria-label='Next step - select your devices']"));
}


