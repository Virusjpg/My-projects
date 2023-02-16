package program;

import utilities.BankSystem;
import java.util.Scanner;

public class RegisterInBank{
public static void main (String args[]){
    double deposit = 0;
    Scanner in = new Scanner (System.in);

    System.out.print ("Enter account number: ");
    int number = in.nextInt();
    System.out.print ("Enter account holder: ");
    String name = in.nextLine();
    name = in.nextLine();
    System.out.print ("Is there a inicial deposit (y/n)? ");
    String answer = in.nextLine();    

    BankSystem account = new BankSystem(number, name);
    if (answer.equals("y")){
     System.out.print ("Enter inicial deposit value: ");
     deposit = in.nextDouble();
     System.out.println(); 
     account = new BankSystem(number, name, deposit);
    }
    

    System.out.println ("Account data:");
    System.out.println(account.toString());

    System.out.print ("Enter a deposit value: ");
    deposit = in.nextDouble();
    account.deposit(deposit);
    System.out.println("Updated account data:");
    System.out.println(account.toString());

    System.out.print ("Enter a withdraw value: ");
    deposit = in.nextDouble();
    account.withdraw(deposit);
    System.out.println(account.toString());

    in.close();
}
}
