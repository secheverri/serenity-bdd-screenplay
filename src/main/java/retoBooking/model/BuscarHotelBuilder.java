package retoBooking.model;

import net.serenitybdd.screenplay.Performable;
import retoBooking.tasks.BuscarSoloHotel;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarHotelBuilder {

    private String destino;
    private String checkIn;
    private String checkOut;

    public BuscarHotelBuilder destino(String destino) {
        this.destino = destino;
        return this;
    }

    public BuscarHotelBuilder desde(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }


    public Performable hasta(String checkOut) {
        return instrumented(BuscarSoloHotel.class, destino, checkIn, checkOut);
    }

}
