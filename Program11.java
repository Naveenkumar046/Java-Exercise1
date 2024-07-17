import java.util.*;
class Program11{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[] counts=new int[10];
    for(int i=0;i<10;i++){
       counts[i]=0;
    } 
    for(int i=0;i<10;i++){
      System.out.print(counts[i]+" ");
    }

   System.out.println();

    int bonus[]={5,10,15,20,25,30,31,32,33,34,35,36,37,38,39};
  
    for(int i=0;i<15;i++){
      System.out.print(bonus[i]+1+" ");
    }
    
  
   System.out.println();

    int bestScores[]=new int[5];
    for(int i=0;i<5;i++){
      bestScores[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
      System.out.println(bestScores[i]+" ");
     }


    
}
}

