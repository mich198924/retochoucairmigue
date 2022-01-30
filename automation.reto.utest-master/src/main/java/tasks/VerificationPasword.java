package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.UserVerificationPasword;

import static userinterfaces.UserDevice.COMPUTER_MACHINE;
import static userinterfaces.UserVerificationPasword.*;
//import static userinterfaces.UserVerificationPasword.CONFIR_PASSWORD;


public class VerificationPasword implements Task {
    public static Performable theVerication() {
//        private userinterfaces.UserVerificationPasword UserVerificationPasword;
        return Tasks.instrumented(VerificationPasword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue("MiGORDO2017").into(UserVerificationPasword.INPUT_PASWORD),
        Enter.theValue("MiGORDO2017").into(UserVerificationPasword.INPUT_CONFIRM_PASWORD),
        Click.on(CONFIRM_OPTION),
        Click.on(CONFIRM_OPTION2),
        Click.on(CONFIRM_OPTION3),
        Click.on(COMPLETE_SETUP)
        );



    }
}
