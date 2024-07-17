import java.util.*;
class Program17{

  public static void main(String args[]){
     SavingsAccount saver1=new SavingsAccount();
     SavingsAccount saver2=new SavingsAccount();

     saver1.setSavingBalance(5000.00);
     saver2.setSavingBalance(8000.00);
  
     System.out.println("New balance user1 : "+saver1.getSavingBalance());
     System.out.println("New balance user2: "+saver2.getSavingBalance());

     SavingsAccount.modifyInterestRate(0.05);
     saver1.calculateMonthlyInterest();
     saver2.calculateMonthlyInterest();

     System.out.println("New balance user1 after interest modify 5% interest: "+saver1.getSavingBalance());
     System.out.println("New balance user2 after interest modify 5% interest: "+saver2.getSavingBalance());


     saver1.setSavingBalance(5000.00);
     saver2.setSavingBalance(8000.00);

     SavingsAccount.modifyInterestRate(0.04);
     saver1.calculateMonthlyInterest();
     saver2.calculateMonthlyInterest();
    
 System.out.println("New balance user1 after interest modify 4% interest: "+saver1.getSavingBalance());
 System.out.println("New balance user2 after interest modify 4% interest: "+saver2.getSavingBalance());
 




}

}

class SavingsAccount{

  static double annualInterestRate;
  private double savingsBalance;


public void SavingsAccount(){
    annualInterestRate=0.0;
    savingsBalance=0.0;
}


 public void SavingsAccount(double annualInterestRate,double savingsBalance){
    this.annualInterestRate=annualInterestRate;
    this.savingsBalance=savingsBalance;
}






public void setSavingBalance(double savingsBalance){
    this.savingsBalance=savingsBalance;
}
public double getSavingBalance(){
    return savingsBalance;
}

public double getAnnualInterest(){
    return annualInterestRate;
}



public static void modifyInterestRate(double newAnnualInt){
  annualInterestRate=newAnnualInt;
  
 
}

public double calculateMonthlyInterest(){
  double monInt=(savingsBalance*annualInterestRate)/12;
  savingsBalance=savingsBalance+monInt;
  return monInt;

}







   
   

}
  