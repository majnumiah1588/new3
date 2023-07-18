public class Account_BalanceRunner {
    
    public int capital, year; 
    
    public double interest;
   
    public static void main(String [] args){

        Account_Balance account_Balance = new Account_Balance();

        account_Balance.OneYearLater(10000, 0.05, 1);

        account_Balance.TwoYearLater(10000, 0.05, 2);

        account_Balance.ThreeYearLater(10000, 0.05, 3);

    }

}
