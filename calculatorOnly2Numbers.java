import java.util.Scanner;

/* What to do: 
    -> Pick the numbers;
    -> Choose the operator;
    -> Give the result;
*/
public class calculatorOnly2Numbers{
public static void main (String arg[]){
 Scanner input = new Scanner (System.in);
 
 //first values (Only two due my current experience)
 System.out.println ("Type two numbers: ");
 double number1 = input.nextDouble();
 double number2 = input.nextDouble();
 

 //Select the operator: '+','-','/','*'.
 String operator = input.nextLine();
 System.out.print("Choose one of the current operators: +,-,/,*\n");
 operator = input.nextLine();
 
 //The result, based in the operation you choose.
 switch (operator){
 case "+":
 System.out.println (number1+number2);
 break;
 case "-":
 System.out.println (number1-number2);
 break;
 case "/":
 System.out.println (number1/number2);
 break;
 case "*": 
 System.out.println (number1*number2);
 break;
}

 input.close();
 
} 
}

