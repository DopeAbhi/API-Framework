package stepDefination;
import io.cucumber.java.Before;
import org.junit.After;

import java.io.IOException;

public class Hooks
{
    @Before("@DeletePlace")
    public void beforeScenario() throws Throwable
    {
        stepDefination m=new stepDefination();

        if (stepDefination.place_id==null) {
            m.add_place_payload("Raj", "Hindi", "Dada Nagar");
            m.user_calls_with_http_Post_request("AddPlaceAPI", "POST");
            m.verify_place_id_created_maps_to_using("Raj", "GetPlaceAPI");
        }
    }


}
