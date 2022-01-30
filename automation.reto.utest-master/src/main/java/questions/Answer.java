package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterfaces.UserAnswer.LAST_STEP;
public class Answer implements Question<Boolean> {
    private String question;
//no quedo gual a la guia //
    public Answer (String question) {
        this.question = question;
    }

    public static  Answer toThe(String question)  {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String labelConfirm = Text.of(LAST_STEP).viewedBy(actor).asString();
        boolean result;
        if (question.equals(labelConfirm)){
            result=false;
        }
        else {
            result=true;
        }
        return result ;
    }
}


