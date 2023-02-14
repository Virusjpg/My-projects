package program;

import java.util.Scanner;
import utilities.CurrencyConverter;

public class CalcDollarCotation {
 public static void main (String args[]){
    Scanner in = new Scanner(System.in);
   
    System.out.print ("What is the dollar price? ");
    double dPrice = in.nextDouble();
    System.out.print ("How much you want to bought? ");
    double dBought = in.nextDouble();

    double convertedMoney = CurrencyConverter.amountInReais(dPrice, dBought);
    System.out.print("Amount to be paid in reais: " + convertedMoney);
    
    in.close();
}
}
