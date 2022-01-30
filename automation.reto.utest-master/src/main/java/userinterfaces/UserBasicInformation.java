package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserBasicInformation {
    public static final Target INPUT_FIST_NAME = Target.the("Write fist name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Write last name")
            .located(By.id("lastName"));
    public static final Target INPUT_IMAIL_ADDRES = Target.the("Write email")
            .located(By.id("email"));
     public static final Target INPUT_MONTH = Target.the("Select month birth")
      .located(By.id("birthMonth"));
   public static final Target INPUT_DAY  = Target.the("Select day birth")
      .located(By.id("birthDay"));
   public static final Target INPUT_YEAR = Target.the("Select year birth")
       .located(By.id("birthYear"));
 public static final Target NEXT_LOCATION = Target.the("Next Location")
         .located(By.xpath("//span[normalize-space()='Next: Location']"));
}

