package program;

import java.util.Arrays;
import java.util.Scanner;

public class SeeTheSideElements {
 
 public static void main (String args[]){
    Scanner in = new Scanner(System.in);
    
    System.out.print("Type the number of lines: ");
    int line = in.nextInt();
    System.out.print("Type the number of collumns: ");
    int collumn = in.nextInt();
    
    int [][] matrix = new int[line][collumn];

    for(int i = 0; i<line;i++){
         for(int j = 0; j<collumn; j++){
            System.out.print("Type a number: ");
            matrix[i][j] = in.nextInt();
        }   
    }
    System.out.println();

    int numberT = in.nextInt();
    
    for (int i = 0; i<line; i++){
         for(int j = 0; j<collumn; j++){
             if (matrix[i][j] == numberT){
                int[] target = new int[] {i, j};
                System.out.println(Arrays.toString(target));
            try{
                System.out.println("Up: " + matrix[i-1][j]);   
                
            }
            catch (Exception e){
               System.out.println("The up side doesn't exist");
            }
            try{
                System.out.println("Down: " + matrix[i+1][j]);   
                
            }
            catch (Exception e){
               System.out.println("The down side doesn't exist");
            }
            try{
                System.out.println("Left: " + matrix[i][j-1]);   
                
            }
            catch (Exception e){
               System.out.println("The left side doesn't exist");
            }
            try{
                System.out.println("Right: " + matrix[i][j+1]);   
                
            }
            catch (Exception e){
               System.out.println("The right side doesn't exist");
            }
         }
    }
    
    in.close();
}
}
}

        
    
    
  


