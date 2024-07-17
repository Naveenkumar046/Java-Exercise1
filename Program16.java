import java.util.*;
class Program16{

  public static void main(String args[]){
     Date obj=new Date();
     obj.setMonth(12);
     obj.setDay(10);
      obj.setYear(2002);
    System.out.println("Month is : "+obj.getMonth());
    System.out.println("Day is : "+obj.getDay());
System.out.println("Year is : "+obj.getYear());
obj.displayDate();


}

}

class Date{

    int month;
    int day;
    int year;

  public void Date(int month,int day,int year){
   this.month=month;
   this.day=day;
   this.year=year;
  }
 
public void setMonth(int month){
   this.month=month;
   
}
public int getMonth(){
   return month;
   
}

public void setDay(int day){
   this.day=day;
   
}
public int getDay(){
   return day;
   
}
   

public void setYear(int year){
   this.year=year;
   
}
public int getYear(){
   return year;
   
}

public void displayDate(){
      System.out.printf("%d/%d/%d",month,day,year);
}
   
   

}
  