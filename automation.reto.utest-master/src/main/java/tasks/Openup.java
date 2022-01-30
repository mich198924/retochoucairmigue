package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.choucairAcademiPage;
import userinterfaces.ChoucairLoginPage;

public class Openup implements Task {
private userinterfaces.choucairAcademiPage choucairAcademiPage;
    public static Performable thepage() {
        return Tasks.instrumented(Openup.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademiPage));
    }
}
