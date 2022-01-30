package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UserAnswer {
    public static final Target LAST_STEP = Target.the("label to confirm form")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__link']"));
}
