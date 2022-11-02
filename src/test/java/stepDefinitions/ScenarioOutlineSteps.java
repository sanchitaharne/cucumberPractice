package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.cucumber.learning.BillCalculationHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScenarioOutlineSteps {
    int initialBillAmt;
    double taxRateDouble;

    @Given("I have a Customer")
    public void i_have_a_customer() {
       }
    @Given("user enters an initial bill amount as {int}")
    public void user_enters_an_initial_bill_amount_as(Integer initialBillAmt) {
        this.initialBillAmt = initialBillAmt;
        }
    @Given("sales tax rate is {double}")
    public void sales_tax_rate_is(Double taxRateDouble) {
        this.taxRateDouble = taxRateDouble;
        System.out.println("Tax rate "+taxRateDouble);
    }

    @Then("final bill amount calculated as {double}")
    public void final_bill_amount_calculated_as(Double expectedValue) {
      double finalBill =  BillCalculationHelper.calculateFinalBill(this.initialBillAmt,this.taxRateDouble);
        System.out.println("Expected Value "+expectedValue);
        System.out.println("System Calculated "+finalBill);
        assertEquals(expectedValue, finalBill, 0.0);
        invokeWebPage();
    }

    private void invokeWebPage(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }


}
