package retoBooking.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consulta_hotel/consulta_hotel_inntu.feature",
        glue = "retoBooking.step_definition" )
public class ConsultarHotel {
}
