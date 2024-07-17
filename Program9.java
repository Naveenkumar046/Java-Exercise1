import java.util.*;
class Program9{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   
    int arr[]=new int[10];
int counter=0;
int max=0;
    for(int i=0;i<10;i++){
      arr[i]=sc.nextInt();
      counter++;

      System.out.println("Counter : "+counter);
      System.out.println("recent input element : "+arr[i]);
       if(arr[i]>max){
          max=arr[i];
       }
       System.out.println("Till now max is : "+max);


      
    }
     

 
           

}
}