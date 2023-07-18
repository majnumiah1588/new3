public class Account_Balance {
    
     public int capital, year;

     public double interest;

    public void OneYearLater(int capital, double interest, int year){

    System.out.println(capital * Math.pow(1+interest, year)+" $");
    }
     public void TwoYearLater(int capital, double interest, int year){

    System.out.println(capital * Math.pow(1+interest, year)+" $");
    }
     public void ThreeYearLater(int capital, double interest, int year){

   System.out.println(capital * Math.pow(1+interest, year)+" $");
    }
}
