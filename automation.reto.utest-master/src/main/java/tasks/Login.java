package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.ChoucairLoginPage;


public class Login implements Task {
  public static Performable OnThePage() {
     return Tasks.instrumented(Login.class);
 }

 @Override
 public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ChoucairLoginPage.JOIN_BUTTON));
        
 }
}
