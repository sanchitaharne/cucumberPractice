package org.cucumber.learning;

import java.text.DecimalFormat;

public class BillCalculationHelper {

    public static double calculateFinalBill(Integer initalBillAmt, Double taxRateDouble){
        double finalAmt = initalBillAmt * (1 + taxRateDouble/100);
        DecimalFormat df = new DecimalFormat("0.00");

        String result = df.format(finalAmt);
        System.out.println(finalAmt);
        return Double.parseDouble(result);

    }

    public static int calculateFinalBill(Integer initalBillAmt, Integer taxRateInt){
        int finalAmt = initalBillAmt * (1 + taxRateInt/100);
        System.out.println(finalAmt);
        return finalAmt;
    }

}

