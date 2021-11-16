package retoBooking.step_definition;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retoBooking.model.BuscarHotel;
import retoBooking.tasks.Go;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ConsultaHotelStepDefinition {
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) ha decidido consultar la disponibilidad de hoteles$")
    public void consultarDisponibilidadDeHoteles(String actorName) throws Throwable {
        theActorCalled(actorName).attemptsTo(Go.to());
        // Write code here that turns the phrase above into concrete actions
    }

    @Cuando("^el mira el hotel (.*) desde (.*) hasta (.*)$")
    public void seleccionaPreferenciaHotel(String hotel, String desde, String hasta) throws Throwable {
        theActorInTheSpotlight().attemptsTo(
            BuscarHotel.paraMedellin()
                    .destino(hotel)
                    .desde(desde)
                    .hasta(hasta)
        );// Write code here that turns the phrase above into concrete actions
    }

    @Entonces("^el deberia ver las siguientes opciones de habitaciones:$")
    public void el_deberia_ver_las_siguientes_opciones_de_habitaciones(List <String> arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
    }
}
