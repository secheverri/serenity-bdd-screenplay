package retoBooking.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleBusqueda {

    public static final Target DESTINO = Target.the("seleccionar destino")
            .locatedBy("//*[@id=\"ss\"]");

    public static final Target CHECK_IN = Target.the("seleccionar check in")
            .locatedBy("/html/body/div[1]/div/div/div[2]/form/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span");

    public static final Target CHECK_OUT = Target.the("seleccionar checkout")
            .locatedBy("/html/body/div[1]/div/div/div[2]/form/div[1]/div[2]/div[1]/div[3]/div/div/div/div/span");

    public static final Target BUSCAR = Target.the("boton buscar")
            .locatedBy("/html/body/div[1]/div/div/div[2]/form/div[1]/div[4]/div[2]/button");
}
