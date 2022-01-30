package stepdefinitions;

import com.sun.org.apache.xerces.internal.impl.xs.util.StringListImpl;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
//import tasks.Login;
import questions.Answer;
import tasks.*;

public class UtestStepDefinition {
    @Before
    public void setState( ) {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than brandon wants to learns automation at academy chocair$")
    public void thanBrandonWantsToLearnsAutomationAtAcademyChocair() {

        OnStage.theActorCalled( "Brandon").wasAbleTo(Openup.thepage(),
                Login.OnThePage()
        );

    }

    @When("^he search for the course Recursos Automatizacion Bancolombia on the chocair Academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChocairAcademyPlatform() {
        OnStage.theActorCalled( "Brandon").wasAbleTo(BasicInformation.thePerson(),
        YourAddress.theAddres(), Devices.theDevices(),VerificationPasword.theVerication()


        );




    }

    @Then("^he finds the course called (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolobia(String questions) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(questions) ));
    }


}
