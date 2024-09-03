import javax.swing.JOptionPane;

public class CurrencyGui {
    
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Welcome to the Currency Converter!");
        JOptionPane.showMessageDialog(null,"Here we can convert following currencies: \n" +
                         "1. USD to INR \n" +
                         "2. INR to USD \n" +
                         "3. JPY to INR \n" +
                         "4. INR to JPY \n" +
                         "5. USD to JPY \n" +
                         "6. JPY to USD");
        int choice = 
        Integer.parseInt(JOptionPane.showInputDialog("Enter the choice of conversion: "));
    }
}
