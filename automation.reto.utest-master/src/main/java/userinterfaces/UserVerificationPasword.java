package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserVerificationPasword {
    public static final Target INPUT_PASWORD = Target.the("Write fist name")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASWORD = Target.the("Write fist name")
            .located(By.id("confirmPassword"));
    public static final Target CONFIRM_OPTION = Target.the("Next Location")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CONFIRM_OPTION2 = Target.the("Next Location")
           .located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));
     public static final Target CONFIRM_OPTION3 = Target.the("Next Location")
         .located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
      public static final Target COMPLETE_SETUP = Target.the("Next Location")
          .located(By.xpath("//span[normalize-space()='Complete Setup']"));

}
