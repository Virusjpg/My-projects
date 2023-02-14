package program;

import java.util.Scanner;

import entities.Student;

public class Grade {
 public static void main (String args[]){
    Student st = new Student();
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the student name: ");
    st.name = in.nextLine();
    System.out.print("Enter the first trimester grade: ");
    st.firstT = in.nextDouble();
    System.out.print("Enter the second trimester grade: ");
    st.secondT = in.nextDouble();
    System.out.print("Enter the third trimester grade: ");
    st.thirdT = in.nextDouble();

    System.out.print ("Final grade: " + st.finalGrade());
    System.out.print ("\n" + st.passed());  
    in.close();
}
}
