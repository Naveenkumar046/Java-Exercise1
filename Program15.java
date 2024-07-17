import java.util.*;
class Program15{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
  
  
  Employee emp1=new Employee();
  emp1.setfirstname("Naveen");
 
  emp1.setlastname("kumar");
 
  
  Employee emp2=new Employee();
  emp2.setfirstname("Vijay");
   
  emp2.setlastname("kumar");


  emp1.setsalary(100);
  System.out.println(emp1.getfirstname()+emp1.getlastname()+" salary is : "+emp1.getsalary());
  emp1.employeeTest();
  System.out.println(emp1.getfirstname()+emp1.getlastname()+" salary after 10% hike is : "+emp1.employeeTest());

  System.out.println();

  emp2.setsalary(200);
  System.out.println(emp2.getfirstname()+emp2.getlastname()+" salary is : "+emp2.getsalary());
  emp2.employeeTest();
  System.out.println(emp2.getfirstname()+emp2.getlastname()+" salary after 10% hike is : "+emp2.employeeTest());



 
   
}
}
class Employee{

  String firstName;
  String lastName;
  double salary;
   
  public void Employee(String firstName,String lastName, double salary){

    this.firstName=firstName;
    this.lastName=lastName;
     this.salary=salary;
  }
  
  public void setfirstname(String firstName){
     this.firstName=firstName;
    }
   public String getfirstname(){
     return firstName;
    }


   public void setlastname(String lastName){
    this.lastName=lastName;
   } 
   public String getlastname(){
    return lastName;
   } 

  
   public void setsalary(double salary){
    if(salary>0){
     this.salary=salary;
    }
    else{
     this.salary=0;
    }

 
   }
    public double getsalary(){
      return salary;
 
   }

 public double employeeTest(){
   return salary*1.1;
    

}

  

  


}    