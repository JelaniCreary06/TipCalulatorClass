import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    double bill, tip;
    double totalBill, totalTip, tipPerPerson, totalPerPerson;

    int people;

    DecimalFormat df = new DecimalFormat("0.00");

    public TipCalculator(double bill, double tip, int people) {

        this.bill = bill;
        this.tip = tip;
        this.people = people;
    }


    public void printBills() {
        totalTip = bill * tip;
        totalBill = bill + totalTip;
        tipPerPerson = totalTip / people;
        totalPerPerson = totalBill / people;

        System.out.println("\nCalculations complete.\nTotal Tip Amount: " + df.format(totalTip) + "\nTotal Bill (including tip): " + df.format(totalBill) + "\nTip Per Person: " + df.format(tipPerPerson) + "\nTotal Per Person: " + df.format(totalPerPerson));

    }

}
