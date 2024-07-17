import java.util.*;
class Program14{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number : ");
      String n1=sc.next();
    System.out.println("Enter the description : ");
      String n2=sc.next();
    System.out.println("Enter the quantity : ");
      int n3=sc.nextInt();
    System.out.println("Enter the price per item : ");
      double n4=sc.nextDouble();
   Invoice obj=new Invoice();
   obj.setNumber(n1);
  System.out.println("Number is : "+obj.getNumber());
 obj.setDescription(n2);
System.out.println("Description is : "+obj.getDescription());
 obj.setQuantity(n3);
System.out.println("quantity is : "+obj.getQuantity());
 obj.setPricePerItem(n4);
System.out.println("Price per Item is : "+obj.getPricePerItem());
double result=obj.getInvoice();
System.out.println("getInvoice is : "+result);

   
    





}
}

class Invoice{
    String number;
    String description;
    int quantity;
    double pricePerItem;

   Invoice(){
    String number;
    String description;
    int quantity;
    double pricePerItem;
     
   }

  public void setNumber(String a1) {
     number=a1;
  }
  public String getNumber() {
    return number;
     
  } 


  public void setDescription(String a2) {
     description=a2;
  }
  public String getDescription() {
     return description;
  }


  public void setQuantity(int a3) {
    if(a3>0){
     quantity=a3; 
    }
    else{
     quantity=0;
    }
  }
  public int getQuantity() {
     return quantity;
  }

  
  public void setPricePerItem(double a4) {
    if(a4>0){
       pricePerItem=a4;
    }
    else{
      pricePerItem=0;
    }
  }
  public double getPricePerItem() {
     return pricePerItem;
  }


  
  
  public double getInvoice(){
   return pricePerItem*quantity;

}
    
  
    

  
}

     
    