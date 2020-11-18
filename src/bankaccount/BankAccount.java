package bankaccount;
import javax.swing.JOptionPane;
/**
 * Program that allows user to create a bank account, deposit, withdraw, 
 * and check the balance.
 * @author Aidan McMahon
 * oct. 20, 2020
 */
public class BankAccount {

    /**
     * Creates a drop down menu of things that you can do with the bank account
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final String[] OPTIONS = {"Create account","Get balance", "Deposit", 
       "Withdraw", "Quit"};
         
         
         
         Dialogs.title = "The Bank";
         Account account = new Account();
        String choice = "";
        do{
            choice = Dialogs.choices("Welcome to the bank,"
                    + " what would you like to do?", OPTIONS);
            if(choice.equals(OPTIONS[0])){
               account.setCurrentBalance(0);
            }
            else if(choice.equals(OPTIONS[1])) {
                account.show();
            }
            else if(choice.equals(OPTIONS[2])){
                account.deposit(0);
            } 
             else if(choice.equals(OPTIONS[3])){
                account.withdraw(0);
            } 
                    
        }
        while(choice.equals(OPTIONS[4]) == false);
        Dialogs.output("Thanks for visiting " + Dialogs.title + 
                "\nThe program will now end.");
        System.exit(0);
    }
    
}
