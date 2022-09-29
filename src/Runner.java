import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {

        double bill, tip;
        double totalBill, totalTip, tipPerPerson, totalPerPerson;

        int people;

        Scanner input = new Scanner(System.in);

        System.out.println("Are you now leaving?\nYou'll receive a few prompts for payment options.");
        System.out.print("Enter the total bill (total due): ");
        bill = input.nextDouble();

        System.out.print("Enter the tip percent (as a whole number): ");
        tip = (input.nextDouble() / 100);

        System.out.print("The total amount of people to split between: ");
        people = input.nextInt();

        TipCalculator calc = new TipCalculator(bill, tip, people);

        calc.printBills();

    }
}
