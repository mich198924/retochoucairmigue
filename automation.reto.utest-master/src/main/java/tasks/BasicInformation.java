package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.UserBasicInformation;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static userinterfaces.UserBasicInformation.*;

public class BasicInformation implements Task {
    public static Performable thePerson() {
        return Tasks.instrumented(BasicInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("miguel").into(UserBasicInformation.INPUT_FIST_NAME),
                Enter.theValue("angel").into(UserBasicInformation.INPUT_LAST_NAME),
                Enter.theValue("maac1017455245@hotmail.com").into(UserBasicInformation.INPUT_IMAIL_ADDRES),
                SelectFromOptions.byVisibleText("May").from(INPUT_MONTH),
                SelectFromOptions.byVisibleText("24").from(INPUT_DAY),
                SelectFromOptions.byVisibleText("1989").from(INPUT_YEAR),
                Click.on(NEXT_LOCATION)

        );
    }
}
