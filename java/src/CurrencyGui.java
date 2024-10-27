import javax.swing.JOptionPane;

public class CurrencyGui {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the Currency Converter!");
        JOptionPane.showMessageDialog(null, "Here we can convert following currencies: \n" +
                "1. USD to INR \n" +
                "2. INR to USD \n" +
                "3. JPY to INR \n" +
                "4. INR to JPY \n" +
                "5. USD to JPY \n" +
                "6. JPY to USD");
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter the choice of conversion: "));
        JOptionPane.showMessageDialog(null, "Thanks for choosing us for your conversion needs!");
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount you need to convert: "));
        String currency = null;
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

        JOptionPane.showMessageDialog(null,
                "For the convertion of " + amount + " " + currency + " we will charge some amount as service charge. ");

        switch (choice) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "The amount you get after converting is " + amount * (82 + 0.2 * amount));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "The amount you get after converting is " + amount / (0.012 + 0.2 * amount));
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                        "The amount you get after converting is " + amount / (0.58 + 0.2 * amount));
                break;
            case 4:
                JOptionPane.showMessageDialog(null,
                        "The amount you get after converting is " + amount * (1.72 + 0.2 * amount));
                break;
            case 5:
                JOptionPane.showMessageDialog(null,
                        "The amount you get after converting is " + amount / (144.31 + 0.2 * amount));
                break;
            case 6:
                JOptionPane.showMessageDialog(null,
                        "The amount you get after converting is " + amount * (0.0069 + 0.2 * amount));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nope not good!");
        }
    }
}