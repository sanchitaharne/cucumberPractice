package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableSteps {

    @Given("I placed an order for the following items")
    public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
       /* List<List<String>> billItems = dataTable.asLists(String.class);
        for (List<String> billItem: billItems)
            System.out.println(billItem);*/

        List<String> billItems = dataTable.row(0);
        for (String billItem: billItems)
            System.out.println(billItem);
    }
    @When("I generate the bill")
    public void i_generate_the_bill() {

    }
    @Then("a bill of ${int} should be generated")
    public void a_bill_of_$_should_be_generated(Integer int1) {

    }

}
