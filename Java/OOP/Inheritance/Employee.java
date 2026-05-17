package OOP.Inheritance;

/// SUBCLASS (Child)
public class Employee extends Person{

 public int salary;

 public Employee(String first, String last, int salary){
   super(first,last);
   this.salary = salary;

 }
 public void showSalary(){
 System.out.println(this.first + " 's" + "salary is " + this.salary);
 }


}
