package retoBooking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import retoBooking.user_interface.DetalleBusqueda;

public class BuscarSoloHotel implements Task {

    private final String destino;
    private final String desde;
    private final String hasta;

    public BuscarSoloHotel(String destino, String desde, String hasta) {
        this.destino = destino;
        this.desde = desde;
        this.hasta = hasta;
    }

    @Override
    @Step("{0} busca hotel en #destino desde #desde hasta #hasta")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleBusqueda.DESTINO),
                Enter.theValue(this.destino).into(DetalleBusqueda.DESTINO),
                Hit.the(Keys.ARROW_DOWN).into(DetalleBusqueda.DESTINO),
                Hit.the(Keys.ENTER).into(DetalleBusqueda.DESTINO)
        );

    }

}
