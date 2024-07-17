public class Program19{
    public static void main(String args[]){
    Sedan obj1=new Sedan(400,5000,"blue",25);
    Ford obj2=new Ford(200,5000,"blue",2002,1000);
    Ford obj3=new Ford(100,5000,"blue",1950,500);
    Car obj4=new Car(400,5000,"blue");
    System.out.println("sedan : "+obj1.getSalePrice());
   System.out.println("Ford1 : "+obj2.getSalePrice());
   System.out.println("Ford2 : "+obj3.getSalePrice());
   System.out.println("car : "+obj4.getSalePrice());
 
}
}

class Car{
   
  int speed;
  double reg_price;
  String color;

  public Car(int speed,double reg_price,String color){
          this.speed=speed;
          this.reg_price=reg_price;
          this.color=color;


}

 public double getSalePrice(){
  return reg_price;

  }


} 

class Truck extends Car{

     int weight;

 public Truck(int speed,double reg_price,String color,int weight){
   
  super(speed,reg_price,color);
  this.weight=weight;
  

}

 public double getSalePrice(){
   return super.getSalePrice() * (weight>2000 ? 0.10 : 0.20);
}

}

class Ford extends Car{
  int year;
  int manu_dis;
  public Ford(int speed,double reg_price,String color,int year,int manu_dis){
   super(speed,reg_price,color);
   this.year=year;
   this.manu_dis=manu_dis;}

 public double getSalePrice(){
    return super.getSalePrice()-manu_dis;
}
   

}

class Sedan extends Car{

int length;
public Sedan(int speed,double reg_price,String color,int length){
super(speed,reg_price,color);
this.length=length;

}
public double getSalePrice(){
  return super.getSalePrice() * (length>20 ? 0.05 : 0.010);
}


}
 