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


    private void calculateBills() {
        this.totalTip = this.bill * this.tip;
        this.totalBill = this.bill + this.totalTip;
        this.tipPerPerson = this.totalTip / this.people;
        this.totalPerPerson = this.totalBill / this.people;
    }

    public void printBills() {

        calculateBills();
        System.out.println("\nCalculations complete.\nTotal Tip Amount: " + df.format(this.totalTip) + "\nTotal Bill (including tip): " + df.format(this.totalBill) + "\nTip Per Person: " + df.format(this.tipPerPerson) + "\nTotal Per Person: " + df.format(this.totalPerPerson));

    }

}
