package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.setdata.LoginData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import org.hamcrest.Matchers;
import questions.ElMensaje;
import tasks.Abrir;
import tasks.Ingresar;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MetisStepDefinition {

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }

    @Given("que Yeison quiere Acceder a Metis")
    public void queYeisonQuiereAccederAMetis() {
        theActorCalled("Actor").wasAbleTo(Abrir.laPagina());

    }

    @When("el ingresa el usuario y la clave")
    public void elIngresaElUsuarioDemoYLaClaveDemo(DataTable table) {
        theActorInTheSpotlight().attemptsTo(Ingresar.lasCredenciales(LoginData.setData(table).get(0)));
    }

    @Then("el verifica el mensaje {string}")
    public void elVerificaElMensaje(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ElMensaje.enPantallaEs(), Matchers.equalTo(mensaje)));
    }
}
