import java.util.Scanner;
import javax.swing.JOptionPane;

public class currencyConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("-------------------Currency Convertor-------------------");
        System.out.println("Welcome to the currency coverter application!");
        System.out.println(
                "Here we can convert following currencies: \n 1. USD to INR \n 2. INR to USD \n 3. JPY to INR \n 4. INR to JPY \n 5. USD to JPY \n 6. JPY to USD");
        
        int choice;
        System.out.println("Enter the choice of conversion: ");
        choice = sc.nextInt();
        String currency = "";
        switch (choice) {
            case 1:
            case 5:
                currency = "USD";
                break;
            case 2:
            case 4:
                currency = "INR";
                break;
            case 3:
            case 6:
                currency = "JPY";
                break;
            default:
                break;
        }
        System.out.println("Thanks for choosing us for your conversion needs!");
        System.out.println("Please enter the amount you need to convert: ");
        double amount = sc.nextDouble();
        System.out.println(
                "For the convertion of " + amount + " " + currency + " we will charge some amount as service charge. ");

        switch (choice) {
            case 1:
                System.out.println("The amount you get after converting is " + amount * (82 + 0.2 * amount));
                break;
            case 2:
                System.out.println("The amount you get after converting is " + amount / (0.012 + 0.2 * amount));
                break;
            case 3:
                System.out.println("The amount you get after converting is " + amount / (0.58 + 0.2 * amount));
                break;
            case 4:
                System.out.println("The amount you get after converting is " + amount * (1.72 + 0.2 * amount));
                break;
            case 5:
                System.out.println("The amount you get after converting is " + amount / (144.31 + 0.2 * amount));
                break;
            case 6:
                System.out.println("The amount you get after converting is " + amount * (0.0069 + 0.2 * amount));
                break;
        }

    }
}
