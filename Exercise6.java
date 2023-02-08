package Nada;

import java.util.Scanner;
import java.lang.Math;

public class Exercise6 {
 static final double pi = 3.14159;
 static Scanner in = new Scanner (System.in);
    public static void main(String args[]){
     double a, b, c;
     System.out.println ("Digit a,b and c:");
     a = in.nextDouble();
     b = in.nextDouble();
     c = in.nextDouble();
     
     double triangle = a*c/2; 
     double circle = pi*Math.pow(c,2);
     double trapeze = (a+b)*c/2;
     double square = Math.pow(b,2);
     double retangle = a*b;

     System.out.println ("Triangle: " + triangle + "\nCircle: " + circle + "\nTrapeze: " + trapeze + "\nSquare: " 
+ square + "\nRetangle: " + retangle);
}
}
