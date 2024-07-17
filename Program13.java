import java.util.*;
class Program13{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the balance : ");
      int n=sc.nextInt();
      System.out.println("Enter withdraw amt : ");
      int w=sc.nextInt();
      Account a1=new Account();
      a1.balance=n;
      a1.debit(w);






}
}

class Account{
  
  int balance;
    
  public void debit(int withdrawAmt){
    if(withdrawAmt<=balance){
       balance=balance-withdrawAmt;
       System.out.println("Balance is : "+balance);
    }
    else{
   System.out.println("Withdraw Amount exceeds the Balance ");
   }
   
    
    

  }
}

     
    