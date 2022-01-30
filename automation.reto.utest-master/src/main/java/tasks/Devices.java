package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static userinterfaces.UserDevice.*;

public class Devices implements Task {

 private userinterfaces.UserDevice userDevice;

 public static Performable theDevices() {
  return Tasks.instrumented(Devices.class);
    }
    @Override
public <T extends Actor> void performAs(T actor) {
     actor.attemptsTo(

          Click.on(COMPUTER_MACHINE),
          Enter.theValue("Windons").into(INPUT_COMPUTER_MACHINE),
          Hit.the(Keys.ENTER).into(INPUT_COMPUTER_MACHINE),
          Click.on(INPUT_COMPUTER_MACHINE_VERSION),
          Enter.theValue("10").into(INPUT_VERSION),
          Hit.the(Keys.ENTER).into(INPUT_VERSION),
          Click.on(MACHINE_LANGUAGE),
          Enter.theValue("SPANISH").into(INPUT_LANGUAGE),
          Hit.the(Keys.ENTER).into(INPUT_LANGUAGE),
          Click.on(MOBILE_MIGUE),
          Enter.theValue("Xiaomi").into(INPUT_MOBILE_MIGUE),
          Hit.the(Keys.ENTER).into(INPUT_MOBILE_MIGUE),
          Click.on(MODEL),
          Enter.theValue("Mi5").into(INPUT_MODEL),
          Hit.the(Keys.ENTER).into(INPUT_MODEL),
          Click.on(SISTEM_MOBILE),
          Enter.theValue("Android 5.0.2").into(INPUT_SISTEM_MOBILE),
          Hit.the(Keys.ENTER).into(INPUT_SISTEM_MOBILE),
          Click.on(NEXT_LAST_STEP)
   );

    }
}
