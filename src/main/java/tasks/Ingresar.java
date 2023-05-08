package tasks;

import models.setdata.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.LoginMetisPage.*;

public class Ingresar implements Task {
    private LoginData loginData;

    public Ingresar(LoginData loginData) {
        this.loginData = loginData;
    }

    public static Ingresar lasCredenciales(LoginData loginData) {
        return Tasks.instrumented(Ingresar.class, loginData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(loginData.getUsuario()).into(USUARIO),
               Enter.theValue(loginData.getClave()).into(PASSWORD),
               Click.on(SIGNIN));
    }
}
