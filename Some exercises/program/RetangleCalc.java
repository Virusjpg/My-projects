package program;

import java.util.Scanner;

import entities.Retangle;

public class RetangleCalc {
 public static void main (String args[]){
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the retangle width and height: ");
    Retangle retangle = new Retangle();

    retangle.width = in.nextDouble();
    retangle.height = in.nextDouble();

    System.out.print(retangle);
    in.close();
}
}