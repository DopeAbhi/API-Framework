package stepDefination;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("Add Place Payload$")
    public void add_place_payload() throws Throwable {

    }

    @When("user calls {string} with Post http request")
    public void user_calls_addplaceapi_with_post_http_request(String test) throws Throwable {
        System.out.println(test);

    }


    @Then("the API call got success with status code {int}")
    public void the_api_call_got_success_with_status_code_200(int ne) throws Throwable {
        System.out.println(ne);
    }

    @And("status in response body is {string}")
    public void status_in_response_body_is_ok(String test) throws Throwable {
        System.out.println(test);
    }

}