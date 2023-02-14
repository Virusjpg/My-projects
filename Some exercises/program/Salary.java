package program;

import java.util.Scanner;

import entities.Employee;

public class Salary {
 public static void main (String args[]){
    Scanner in = new Scanner(System.in);
    Employee employee = new Employee();
    
    System.out.println("Insert the name, salary and tax of the employee:");
    
    employee.name = in.nextLine();
    employee.grossSalary = in.nextDouble();
    employee.tax = in.nextDouble();

    System.out.println("Employee: " + employee);
    System.out.print("Which percentage to increase salary? ");
    double percentage = in.nextDouble();
    
    System.out.print("Updated data: " + employee.name + ", $ ");
    employee.increaseSalary(percentage);
    in.close();
}
}