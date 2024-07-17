import java.util.*;
import java.text.DecimalFormat;
class Program12{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double[] grades=new double[20];
    int count=0;

    for(int i=0;i<20;i++){
        double input=sc.nextDouble();
        if(input==-1){
           break;
        }
        else{
          grades[count]=input;
          count++;
        }
      
    } 
     System.out.print("Entered grades are : ");
    for(int i=0;i<count;i++){
      System.out.print(grades[i]+" ");
    }
  System.out.println();

    double average=findAvg(grades,count);
   DecimalFormat d=new DecimalFormat("#.##");
   String answer=d.format(average);
   System.out.println("Average : "+answer);
     
    
    
    
  


  

    
}

public static double findAvg(double[] arr,int count){
     double avg=0;
     double sum=0;
     for(int i=0;i<count;i++){
        sum=sum+arr[i];
     }
     avg=sum/count;
     return avg;
}
     
}
