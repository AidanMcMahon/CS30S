package bankaccount;

/**
 *
 * @author Aidan McMahon
 */
public class Account {
   double balance;
   double amount;
 
   
   /**
    * default constructor method that creates an account with $0
    */
   public Account(){
      balance = 0;
      
   }
   /**
    * withdraws money from the account
    * @param amount that will be withdrawn
    */
   public void withdraw(double amount){
       String input = Dialogs.input("How much would you like to withdraw");
       amount = Double.parseDouble(input);
       balance = balance - amount;
       if(balance < 0){
           balance = balance + amount;
           Dialogs.output("Sorry, you don't have enough money!"
                   + " \n You currently have a balance of $" + balance);           
       }
       show();
   }
   /**
    * deposits money into the account
    * @param amount that will be deposited
    */
   public void deposit(double amount){
       String input = Dialogs.input("How much would you like to deposit");
       amount = Double.parseDouble(input);
       balance = balance + amount;
       show();
   }
  
   /**
    * Lets the user input the amount the account will have from the beginning
    * @param amount 
    */
    void setCurrentBalance(double amount) {
        String input = Dialogs.input("Enter the amount you would "
                + "like to deposit");
        balance = Double.parseDouble(input);
        show();
    }
    /**
     * Displays the accounts balance
     */
    public void show(){
        Dialogs.output("Your account has $" + balance);
    }

   
   
   
   
}
