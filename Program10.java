import java.util.*;
class Program10{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double diameter=sc.nextDouble();
double radius=diameter/2;

double volume=volSphere(radius);

System.out.println("Volume is: "+volume);
         

}
 
public static double volSphere(double r){

      double vol=4.0/3.0*Math.PI*Math.pow(r,3);
      return vol;
}
}