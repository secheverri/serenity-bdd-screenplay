package retoBooking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Go implements Task {

    private final String url="https://www.booking.com/";

    public Go() {

    }

    @Override
    @Step("{0} goes to #to")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static Performable to() {
        return instrumented(Go.class);
    }
}
