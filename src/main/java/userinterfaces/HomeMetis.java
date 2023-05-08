package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeMetis {
    public static final Target MENSAJE_BIENVENIDA = Target.the("Mensaje de Pantalla")
            .located(By.id("bootstrap-admin-template"));
}
