import java.util.*;
class Program7{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int sum=a+b+c;
    int avg=sum/3;
    int product=a*b*c;
System.out.println("Sum : "+sum);
System.out.println("Average : "+avg);
System.out.println("product : "+product);
    if(a>b && a>c){
      System.out.println(a+" is larger");
    }
    else if(b>a && b>c){
      System.out.println(b+" is larger");
    }
    else if(c>a && c>b){
      System.out.println(c+" is larger");
    }

if(a<b && a<c){
      System.out.println(a+" is smaller");
    }
    else if(b<a && b<c){
      System.out.println(b+" is smaller");
    }
    else if(c<a && c<b){
      System.out.println(c+" is smaller");
    }
      


 
           

}
}