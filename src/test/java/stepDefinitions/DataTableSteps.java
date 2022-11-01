package stepDefinitions;

import java.util.Map;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
public class DataTableSteps {
    @Given("I placed an order for the following items")
    public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> billItems = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> billItem: billItems)
            for(Map.Entry<String, String> item: billItem.entrySet()){
                System.out.println("Key- "+item.getKey());
                System.out.println("Value- "+item.getValue());
            }

/*        for (List<String> billItem: billItems) {
         for(String s:billItem) {
             System.out.println(billItem);
         }
        }*/
      /*  List<String> billItems = dataTable.row(0);
        for (String billItem: billItems)
            System.out.println(billItem);*/
    }
    @When("I generate the bill")
    public void i_generate_the_bill() {

    }
    @Then("a bill of ${int} should be generated")
    public void a_bill_of_$_should_be_generated(Integer int1) {

    }

}
