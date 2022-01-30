package userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject  {
    public static final Target JOIN_BUTTON = Target.the("Button that takes us to the registration page")
     .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}