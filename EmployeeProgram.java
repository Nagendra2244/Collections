/*
Create a Java program to implement the following scenario:

There are two types of workers: daily workers and salaried workers. Both types of workers have an employee number and a name.

The daily worker's salary is calculated based on the rate per hour and the number of hours worked. The salaried worker's salary is calculated based on the rate per hour and a fixed number of hours (40 hours per week).

Write a program to implement the above scenario using inheritance. Define a class named Worker that contains two instance variables: empno and name, and a method named show() that displays the values of these variables.

Create two subclasses of the Worker class named dailyworker and salariedworker. Both of these classes should contain an instance variable named rate and a constructor that takes three parameters: empno, name, and rate.

The dailyworker class should contain a method named compay() that takes an integer parameter named h, which represents the number of hours worked, and calculates and displays the salary based on the formula salary = rate * h.

The salariedworker class should contain a method named compay() that calculates and displays the salary based on the formula salary = rate * 40.

In the main() method, create an instance of the dailyworker class and an instance of the salariedworker class, and then call their respective compay() methods with appropriate parameters to calculate and display their salaries.
*/
import java.util.*;
class Worker{
          String name;
          int empno;
Worker(int no,String n){ 
  empno=no; name=n; 
}
void show(){
             System.out.println("\n--------------------------");
              System.out.println("Employee number : "+empno);
               System.out.println("Employee name : "+name);
      }
}
class dailyworker extends Worker{
             int rate;
          dailyworker(int no,String n,int r){
                     super(no,n);
                      rate=r;
            }
    void compay(int h){
               show();
              System.out.println("Salary : "+rate*h);
       }
}
class salariedworker extends Worker{
            int rate;
    salariedworker(int no,String n,int r){
              super(no,n);
              rate=r;
     }
            int hour=40;
       void compay(){
            show();
        System.out.println("Salary : "+rate*hour);
     }
}
public class EmployeeProgram{
    public static void main(String[] args) {
         dailyworker d=new dailyworker(254,"Arjun",75);
        salariedworker s=new salariedworker(666,"Unni",100);
                d.compay(45);
               s.compay();
    }
}