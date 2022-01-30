package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterfaces.UserYourAddres;

import static userinterfaces.UserYourAddres.*;

public class YourAddress implements Task {
    public static Performable theAddres() {
        return Tasks.instrumented(YourAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue("Ibague").into(INPUT_CITY),
         Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
        Hit.the(Keys.ENTER).into(INPUT_CITY),

        Enter.theValue("730001").into(INPUT_CODE),
       Hit.the(Keys.ENTER).into(UserYourAddres.INPUT_CODE),
       Click.on(INPUT_COUTRY),
       Enter.theValue("Colombia").into(INPUT_COUTRYS),
       //Hit.the(Keys.ARROW_DOWN).into(INPUT_COUTRYS),
       Hit.the(Keys.ENTER).into(INPUT_COUTRYS),
       Click.on(NEXT_DEVICES)
        );

    }
}
