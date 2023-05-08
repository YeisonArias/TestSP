package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginMetisPage {
    public static final Target USUARIO = Target.the("Usuario")
            .located(By.xpath("//input[@placeholder='Username']"));
    public static final Target PASSWORD = Target.the("Clave")
            .located(By.xpath("//input[@placeholder='Password']"));
    public static final Target SIGNIN = Target.the("Sign In")
            .located(By.xpath("//button[@type='submit' and text()='Sign in']"));
}
