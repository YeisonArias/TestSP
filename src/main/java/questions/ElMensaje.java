package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.HomeMetis;

public class ElMensaje implements Question<String> {

    public static ElMensaje enPantallaEs() {
        return new ElMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomeMetis.MENSAJE_BIENVENIDA).answeredBy(actor);
    }
}
