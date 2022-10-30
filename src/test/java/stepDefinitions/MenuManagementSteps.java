package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cucumber.learning.RestaurantMenu;
import org.cucumber.learning.RestaurantMenuItem;
public class MenuManagementSteps {

    RestaurantMenuItem newMenuItem;
    RestaurantMenu locationMenu = new RestaurantMenu();
    @Given("^I have a new menu item by name \"([^\"]*)\" and price ([$]*)([\\d]+)$")
    public void i_have_a_new_menu_item_by_name_and_price(String itemName, String currencyType, Integer price) {
        newMenuItem = new RestaurantMenuItem(itemName, itemName, price);
        System.out.println("step 1");
    }
    @When("I add that menu item")
    public void i_add_that_menu_item() {
        locationMenu.add(newMenuItem);
        System.out.println("step 2");
    }

    @Then("New item {string} is added")
    public void new_item_in_added(String string) {
        locationMenu.isExist(newMenuItem);
        System.out.println("step 3");
    }


}
