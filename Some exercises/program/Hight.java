package program;

import java.util.Scanner;


public class Hight {  
public static void main (String args[]){
    Scanner in = new Scanner(System.in);
    
    System.out.print ("How many people will be? ");
    int number = in.nextInt();

    String[] name = new String[number];
    int[] age = new int[number];
    double[] hight = new double[number];    


    for (int i = 0; i<number;i++){
        System.out.println ("What's the person's name? ");
        System.out.print ("Name: ");
        name[i] = in.nextLine();
        name[i] = in.nextLine();
        System.out.print ("Age: ");
        age[i] = in.nextInt();
        System.out.print ("Higth: ");
        hight[i] = in.nextDouble();
    }
    
    double soma = 0;
    
    for (int i =0; i<hight.length;i++){
        soma += hight[i];
    }
    
    double media = soma/number;
    double lessThan16 = 0;
    String nameLessThan16 = " ";

    System.out.println("Media of hight: " + media);

    for (int i =0; i<age.length;i++){
        soma += age[i];
        if (age[i]<16){
        lessThan16 += age[i];
        nameLessThan16 += "," + name[i];
    }
    }
    
    double percentage = lessThan16*100/soma;
    
    System.out.println();
    System.out.printf("People with less than 16: %.1f", percentage, "%");
    System.out.print("\n" + nameLessThan16);
    in.close();
}
}
